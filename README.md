# Hashicorp vault essentials

## Docker commands for vault

**Docker command to pull latest vault:** `docker pull hashicorp/vault`

**Docker command to create vault container:** `docker run --cap-add=IPC_LOCK -d --name=vault-dev -e 'VAULT_DEV_ROOT_TOKEN_ID=myroot' -e 'VAULT_DEV_LISTEN_ADDRESS=0.0.0.0:8200' -p 8200:8200 hashicorp/vault`