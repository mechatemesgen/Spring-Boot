# 🌱 Spring Boot Weekly Assignment

This is a Spring Boot project created as part of the Weekly Assignment. The project follows standard Spring Boot conventions and implements essential functionalities as specified in the assignment requirements.

## Project Structure

```
├── src
│   ├── main
│   │   ├── java
│   │   │    └── com.example.assignment
│   │   │          ├── controller
│   │   │          ├── service
│   │   │          ├── repository
│   │   │          └── model
│   │   └── resources
│   │         ├── application.properties
│   │         └── templates
└── pom.xml
```

## Features

- RESTful API endpoints
- CRUD operations
- Exception handling
- Data persistence using JPA
- Input validation

## Requirements

- Java 17+
- Maven 3.8+
- Spring Boot 3.x

## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/your-repo/spring-assignment.git
    cd spring-assignment
    ```

2. Build the project:

    ```bash
    mvn clean install
    ```

3. Run the application:

    ```bash
    mvn spring-boot:run
    ```

## Configuration

Modify `application.properties` for database and other configurations:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/yourdb
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
```

## API Endpoints

| Method | Endpoint         | Description         |
|--------|------------------|---------------------|
| GET    | /api/items       | Get all items      |
| GET    | /api/items/{id}  | Get item by ID     |
| POST   | /api/items       | Create new item    |
| PUT    | /api/items/{id}  | Update item by ID  |
| DELETE | /api/items/{id}  | Delete item by ID  |

## Testing

Run the tests using:

```bash
mvn test
```

## License

This project is for educational purposes only as part of the Weekly Assignment.

