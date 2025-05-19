# Snowflake setup

## Creating the schema
We use Liquibase to set up usage table in Snowflake. Please run [400-snowflake-schema-validate.yml](.github/workflows/400-snowflake-schema-validate.yml)
Please select the correct environment and database to apply changes to the schema.

## Modules and how they work
Please apply the Snowflake schema changes before proceeding with Terraform changes.
Snowflake setup is now separated into 3 modules
- Snowflake_s3 buckets: handles bucket creation and modifications. outputs a list of buckets details such as name, arns, kms arn and folders.
- Snowflake_integration: handles a single integration with snowflake with a single role that has access to specified buckets in any AWS account
- Snowflake_stage: handles setting up of snowflake stage, pipe and SQS notification for each bucket against a single integration.

These 3 modules can be planned and applied using [501 Snowflake setup plan](.github/workflows/501-snowflake-setup-plan.yml) and [502 Snowflake setup apply](.github/workflows/501-snowflake-setup-plan.yml) workflows.
These workflows take the following inputs:
- region: AWS Region to set up buckets, snowflake integration, stage and pipes.
- app: Application to set up buckets and stages for Snowflake. This should exactly match the folder name in _infrastructure/_environment/<env>/<region>/snowflake. example 'pas'
- stage: Environment to apply changes. Example staging, uat
- buckets_present: flag to specify if this workflow should create buckets. For example CLS creates the buckets in a separate workflow and would not want them to be created by this workflow, so would set this flag to true.

Note: When you add new application, add your app as an option to the input `app` 

If we are applying the modules individually, they need to be applied in following order, snowflake_s3, snowflake_integration then snowflake_stage.
Use tools account credentials.
Terraform states are stored in S3 in tools account (347670616898) at following locations:
- Snowflake_s3 buckets: dwh-infra/<env>/<region>/snowflake_s3/<app>.tfstate
- Snowflake_integration: dwh-infra/<env>/<region>/snowflake_integration/common.tfstate
- Snowflake_stage: dwh-infra/<env>/<region>/snowflake_stage/<app>.tfstate

#### Configure Snowflake integration
Snowflake integration and AWS Integration role, both managed by [snowflake_integration module](_infrastructure/stacks/terraform/snowflake_integration) is common for all applications for each environment within an AWS region.
To configure integrations please add the file integration.tfvars (only integration.tfvars name will work) at _infrastructure/_environment/<env>>/<region>/snowflake/common with the following configuration
```yaml
env = "<environment e.g. staging>"
region = "<region e.g. us-west-2>"
profile = "" #leave blank
account_role = "arn:aws:iam::<AWS account number of PAS environment>:role/ToolsAccountAccess"
snowflake_integration_name = "<integration name(prefix)>"
snowflake_iam_role_name = "integration role name(prefix)"
dba_role = "<Snowflake role with privilege to create stage and pipe>"

snowflake_connection = {
  snowflake_user = "<Snowflake username>"
  snowflake_role = "<Snowflake role with privilege to create integration>"
  snowflake_account = "<Snowflake account number>"
  snowflake_host = "<Snowflake host>"
}
apps_using_snowflake = [<app names that use this integration>]
```
NOTE: please ensure your app is listed in 'apps_using_snowflake' in the configuration file.

## Setup snowflake for application
Note: Please add your account tools access to 'Pas' accounts in https://github.com/flexera/swm-tools-infra/blob/main/_infrastructure/_environment/runner_roles.tfvars


### Create s3 buckets
This is the simple way to create the buckets, simply configure the bucket information and run the workflow.
Create a file named buckets.tfvars in folder _infrastructure/_environment/<environment>/<region>/snowflake/<app> with following configuration
   ```yaml
    env = "<environment e.g. staging>"
    region = "<region e.g. us-west-2>"
    workload = "<name of the app, e.g. Dynamic Monetization"
    profile = "" #leave blank
    account_role = "arn:aws:iam::<AWS account number where to create the bucket>:role/ToolsAccountAccess"
    map_tag = "d-server-000x1p5vih4sd3"
    snowflake_integration_role_arn = "arn:aws:iam::<PAS env AWS account number>:role/external/snowflake/<integration role name for the environment>" # this value can be obtained from pas/<env>/<region>/snowflake_integration/common.tfstate from terraform state S3 bucket in tools account
    snowflake_s3 = [ #list of buckets for this account in this region
      {
        bucket_folder_name = "<folder where usage files will reside>"
        bucket_name_prefix = "<prefix of the bucket name, -<region>-<env> will be appended. e.g. prefix: sample, bucket name would be 'sample-us-west-2-staging'>"
        bucket_expiry_days = "Number of days to keep the file in S3"
      }
    ]
   ```

Note: when you run workflow [501 Snowflake setup plan](.github/workflows/501-snowflake-setup-plan.yml) set option 'bucket_present' to 'no'

### to create the stage and pipes
To generate snowflake resources of stage, pipe and add the s3 locations to allowed locations of integration follow these steps
1) Add a file stages.tfvars in folder _infrastructure/_environment/<environment>/<region>/snowflake/<app> with following configuration
   ```yaml
   env = "<environment e.g. staging>"
   region = "<region e.g. us-west-2>"
   workload = "<name of the app, e.g. Dynamic Monetization>"
   profile = "" #leave blank
   account_role = "arn:aws:iam::<AWS account number where buckets exist>:role/ToolsAccountAccess"
   integration_account_role = <the same value set for account_role property in common/intergration.tfvars in the corresponding environment>
   insert_columns = "<Comma seperated list of usage table column names to insert data>"
   json_prefixes = "Comma seperated list of JSON path expressions to read data from S3 file"
   
   snowflake_connection = {
     snowflake_user = "<Snowflake username>"
     snowflake_role = "<Snowflake role with privilege to create integration>"
     snowflake_account = "<Snowflake account number>"
     snowflake_host = "<Snowflake host>"
   }
   
   stage_config = [#list of stages for each bucket
     {
       stage_name_prefix  = "<stage name prefix, _<env> will be appended at runtime>"
       bucket_folder_name = "<usage folder name>"
       bucket_name_prefix = "<prefix of the bucket name>"
       database_name      = "<snowflake database name to connect this bucket>"
       schema             = "<snowflake schema name>"
     }
   ]
   ```
2) Ensure your app is listed in 'apps_using_snowflake' in the integration configuration file for your environment (_infrastructure/_environment/<environment>/<region>/snowflake/common/integration.tfvars)
3) Run workflow [501 Snowflake setup plan](.github/workflows/501-snowflake-setup-plan.yml)
