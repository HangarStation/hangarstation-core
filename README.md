# HangarStation Core
Enterprise Aircraft Maintenance Intelligence backend — domain-based Spring Boot API for managing fleet maintenance, compliance tracking, and technical records.

## Tech Stack
- **Runtime:** Java 17, Spring Boot 4.0.6
- **Database:** Oracle XE (via Docker), Liquibase for schema management
- **Cache:** Redis
- **CI/CD:** Jenkins, SonarQube

## Quick Start
```bash
docker compose up -d
./mvnw spring-boot:run
```
The application starts on http://localhost:8000.


## CI/CD Status
[Build Status](http://localhost:8060/job/hangarstation-core/)

## Project Structure
com.hangarstation/
├── common/ → Shared utilities, base entity, exceptions
├── config/ → Spring @Configuration classes
├── domain/
│ ├── security/ → Users, roles, authentication
│ ├── aircraft/ → Fleet and asset management
│ ├── maintenance/ → Work orders and tasks
│ ├── model/ → Aircraft model definitions
│ └── compliance/ → AD/SB tracking
└── integration/ → External system adapters (FAA, EASA, SAP)

## Sprint 1 Deliverables
- Spring Boot project with domain-based package structure
- Oracle XE connected with Liquibase migrations
- BaseEntity with audit fields and optimistic locking
- Roles table with 7 default system roles
- Jenkins CI/CD pipeline with SonarQube quality gate
- Docker Compose for local development
