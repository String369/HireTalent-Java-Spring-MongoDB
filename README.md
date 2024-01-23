::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::HIRE TALENT:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

# Project Setup Guide

1. **IDE:** IntelliJ IDEA (Java)
2. **Database:** MongoDB

## MongoDB
- For scalability and replication, we use MongoDB (NoSQL) as it doesn't rely on tables but documents.
- Utilizing MongoDB Atlas, a cloud service, requires creating an account on MongoDB Atlas.

## Spring Boot
- Start your project at [start.spring.io](https://start.spring.io).
- Add dependencies, generate the project, and download the dependencies.
- Update the `spring-boot-starter-parent` version to 2.5.7 in the `pom.xml` file.
  <img width="1510" alt="Screenshot 2024-01-23 at 12 43 28 PM" src="https://github.com/String369/HireTalent-Java-Spring-MongoDB/assets/132102851/8401fc22-5d9a-43c2-ad58-3d7d28e53103">
  
## Swagger Integration
- Search for Swagger UI (version 2.9.2) and Swagger2 (version 2.9.2) on [mvn repository](https://mvnrepository.com/).
- Copy the dependencies to the `pom.xml` file.

## MongoDB Connection Setup
1. Connect your application to MongoDB, whether on your system or in the cloud.
2. Specify the database name, username, and password.
3. Update `application.properties`:

## Swagger Implementation
1. Add Swagger to the project by including code in the Joblisting application.
2. Enable Swagger in the Controller where you define methods for each POST operation.

## Controller and Models
1. Create different packages for controllers and models (POJO).
2. Models (POJO) are Java classes that map to documents in MongoDB.
