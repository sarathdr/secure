# Snowflake Setup

## Creating the Schema

We use **Liquibase** to set up the usage table in Snowflake. Please run [`400-snowflake-schema-validate.yml`](.github/workflows/400-snowflake-schema-validate.yml).

Ensure you select the correct environment and database to apply the schema changes.

---

## Modules and How They Work

Apply Snowflake schema changes before proceeding with Terraform changes.

The Snowflake setup is separated into **three modules**:

- **`snowflake_s3`**: Handles bucket creation and modifications. Outputs a list of bucket details such as name, ARNs, KMS ARN, and folders.
- **`snowflake_integration`**: Handles a single integration with Snowflake using one IAM role that has access to specified buckets across AWS accounts.
- **`snowflake_stage`**: Sets up the Snowflake stage, pipe, and SQS notification for each bucket against the integration.

Use the following workflows:

- [`501-snowflake-setup-plan.yml`](.github/workflows/501-snowflake-setup-plan.yml)
- [`502-snowflake-setup-apply.yml`](.github/workflows/502-snowflake-setup-apply.yml)

**Inputs for the workflows:**

- `region`: AWS Region (e.g., `us-west-2`)
- `app`: Application folder name (e.g., `pas`)
- `stage`: Environment (e.g., `staging`, `uat`)
- `buckets_present`: `true` if buckets are already created (e.g., for CLS)

> **Note:** When adding a new application, update the `app` input options accordingly.

### Module Execution Order

If applying modules individually, use this order:

1. `snowflake_s3`
2. `snowflake_integration`
3. `snowflake_stage`

Use **Tools account credentials**.

Terraform states are stored in the **S3 bucket** of the Tools account (`347670616898`) at:

- `snowflake_s3`: `dwh-infra/<env>/<region>/snowflake_s3/<app>.tfstate`
- `snowflake_integration`: `dwh-infra/<env>/<region>/snowflake_integration/common.tfstate`
- `snowflake_stage`: `dwh-infra/<env>/<region>/snowflake_stage/<app>.tfstate`

---

## Configuring Snowflake Integration

The `snowflake_integration` module is common for all applications per environment per region. It's located at:

```
_infrastructure/stacks/terraform/snowflake_integration
```

To configure:

Create a file named `integration.tfvars` at:

```
_infrastructure/_environment/<env>/<region>/snowflake/common
```

With the following:

```hcl
env = "<environment e.g. staging>"
region = "<region e.g. us-west-2>"
profile = ""
account_role = "arn:aws:iam::<AWS_ACCOUNT_ID>:role/ToolsAccountAccess"
snowflake_integration_name = "<integration name prefix>"
snowflake_iam_role_name = "<integration IAM role name prefix>"
dba_role = "<Snowflake DBA role>"

snowflake_connection = {
  snowflake_user    = "<Snowflake username>"
  snowflake_role    = "<Role with integration creation privileges>"
  snowflake_account = "<Snowflake account ID>"
  snowflake_host    = "<Snowflake host URL>"
}

apps_using_snowflake = ["<app1>", "<app2>", ...]
```

> **Note:** Ensure your app is listed under `apps_using_snowflake`.

---

## Setting Up Snowflake for Applications

> **Note:** Add your tools account access to PAS accounts in [runner_roles.tfvars](https://github.com/flexera/swm-tools-infra/blob/main/_infrastructure/_environment/runner_roles.tfvars)

---

### Creating S3 Buckets

Create a file `buckets.tfvars` in:

```
_infrastructure/_environment/<env>/<region>/snowflake/<app>
```

With:

```hcl
env = "<environment>"
region = "<region>"
workload = "<app name>"
profile = ""
account_role = "arn:aws:iam::<AWS_ACCOUNT_ID>:role/ToolsAccountAccess"
map_tag = "d-server-000x1p5vih4sd3"
snowflake_integration_role_arn = "arn:aws:iam::<PAS_ACCOUNT_ID>:role/external/snowflake/<role_name>"

snowflake_s3 = [
  {
    bucket_folder_name  = "<usage folder>"
    bucket_name_prefix  = "<bucket name prefix>" # '-<region>-<env>' is appended
    bucket_expiry_days  = "<days to retain files>"
  }
]
```

> **Tip:** When running `501-snowflake-setup-plan.yml`, set `buckets_present` to `no`.

---

### Creating Stages and Pipes

1. Create `stages.tfvars` in:

```
_infrastructure/_environment/<env>/<region>/snowflake/<app>
```

With:

```hcl
env = "<environment>"
region = "<region>"
workload = "<app name>"
profile = ""
account_role = "arn:aws:iam::<AWS_ACCOUNT_ID>:role/ToolsAccountAccess"
integration_account_role = "<same as in integration.tfvars>"
insert_columns = "<comma-separated column names>"
json_prefixes = "<comma-separated JSON path expressions>"

snowflake_connection = {
  snowflake_user    = "<username>"
  snowflake_role    = "<integration creation role>"
  snowflake_account = "<account ID>"
  snowflake_host    = "<host>"
}

stage_config = [
  {
    stage_name_prefix  = "<prefix>"
    bucket_folder_name = "<folder>"
    bucket_name_prefix = "<prefix>"
    database_name      = "<Snowflake DB name>"
    schema             = "<Snowflake schema>"
  }
]
```

2. Ensure your app is listed in `apps_using_snowflake` in the relevant `integration.tfvars`.

3. Run [`501-snowflake-setup-plan.yml`](.github/workflows/501-snowflake-setup-plan.yml)
