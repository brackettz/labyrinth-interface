# The Amazing Labyrinth - API Contracts

This repository contains the API specifications and generated models for "The Amazing Labyrinth". It defines the interfaces for game communication (real-time) and server management (REST).

## Structure

* `/docs` - Contains the API specifications (Single Source of Truth).
    * `GameServer_asyncapi.yml`: WebSocket protocol for the game flow.
    * `GameManagementServer_openapi.yml`: REST API for server discovery and lifecycle management.
* `/models/async` - Contains the Java models generated from the AsyncAPI (Jackson-annotated).
* `/management.api` - Implementation of the management server (see its own README).

## Specifications

### Game Interaction API (AsyncAPI)
Defines the event-driven real-time communication between client and game server via WebSockets.
* **Protocol:** WebSocket
* **Format:** JSON (using `type` as discriminator)
* **File:** `docs/GameServer_asyncapi.yml`

### Game Management API (OpenAPI)
Defines the REST interface for registering and discovering game servers.
* **Protocol:** HTTP REST
* **File:** `docs/GameManagementServer_openapi.yml`

## Generating Models

The Java models in the `/models/async` folder are generated directly from the AsyncAPI specification.

Prerequisite: [AsyncAPI CLI](https://www.asyncapi.com/tools/cli)

Run the following command in the root directory to update the models:

```bash
asyncapi generate models java docs/GameServer_asyncapi.yml \
    -o ./models/async \
    --packageName=labyrinth.contracts.model \
    --javaJackson