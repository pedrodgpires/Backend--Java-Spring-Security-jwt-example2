# Backend--Java-Spring-Security-jwt-example2

This repository contains a backend application built with Java and Spring Boot, demonstrating the use of JWT (JSON Web
Tokens) for authentication and security.

A simple user registration and login system is implemented, with JWT-based authentication, a start point for an application that requires user authentication and authorization.

## Features

- User registration and login
- JWT-based authentication
- Role-based access control - TODO (not implemented yet)
- CORS configuration for development environment
- Integration with H2 databases for development

## Technologies Used

- Java 21
- Spring Boot 3.3.4
- Spring Security
- JWT (Java JWT library)
- H2 Database (for development)
- Maven

## Getting Started

### Prerequisites

- Java 21
- Maven

### Installation

1. Clone the repository.
2. Build the project:
    ```sh
    mvn clean install
    ```
3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

### API Endpoints

#### Authentication

```
POST /auth/login - User login
POST /auth/register - User registration
```

#### Protected API

```
GET /api/hello-world - Returns a success message if authenticated
```

### Application Properties
The application.properties file contains configuration for the H2 database and security for development purposes.
settings