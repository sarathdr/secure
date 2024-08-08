LLS (Local License Server) Online and Offline Sync

Since LLS cannot use RabbitMQ for pushing JSON sync messages, a different approach from the CLS JSON sync is necessary. The proposed solution involves exposing two new API endpoints on the usage service to handle both online and offline JSON sync messages. The LLS will directly push these messages to the usage service. The usage service will then validate the messages before pushing them to S3. This service will be provisioned with tenant-based URLs to ensure messages are routed correctly to the corresponding S3 bucket for each region.

Signing

For both LLS online and offline sync, the JSON sync message will be signed using the existing identity data. The usage service will need to connect to the LFS database to retrieve this identity data. For online sync, the LLS will sign the JSON sync message using the private key from the identity data and add the signature to the header. For offline sync, the signature will be included in the binary file. The usage service will then validate the message using the public key from the identity data.

LLS Online Sync

- Generate JSON sync messages similar to CLS and sign the messages using the identity data.
- Push the messages to the new usage data endpoint, adding the signature to the header.
- The usage service validates the signature and then pushes the messages to S3.

LLS Offline Sync

1. Download Messages

- Add a new API endpoint on LLS to download usage data as binary sync files.
- The JSON content will be signed using the identity data private key, and both the signature and JSON content will be written into the binary sync file.
- Create a utility to download the usage data.

2. Upload the Binary Files to Usage Service

- Develop a new utility to upload the binary sync files to the usage service.
- The usage service will retrieve the identity details of the tenant from the database and validate the signature.
- After validation, the usage service will push the sync messages to S3.
