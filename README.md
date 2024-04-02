Report on Microservices Architecture Implementation

1. Design Choices:
For this project, we implemented a microservices architecture using Spring Boot, consisting of two separate services: BookService and OrderService. The BookService manages books, providing CRUD operations for the Book entity, while the OrderService communicates with the BookService to place orders based on user requests.

2. Validation:
We incorporated validation mechanisms at various levels to ensure data integrity and error handling. For example, in the BookService, we validate input parameters to prevent invalid data from being persisted to the database. Similarly, in the OrderService, we verify the existence of books in the BookService before placing orders.

3. Screenshots Using Postman:
Below are the screenshots showcasing the functionality tested using Postman:

GET Request to Retrieve All Books:

POST Request to Place an Order:

4. Swagger Implementation:
We integrated Swagger for API documentation. Swagger provides a user-friendly interface to explore and test the APIs. Here's how we implemented Swagger:

Defined Swagger configuration to document the REST APIs.
Accessed Swagger UI to visualize and interact with the documented APIs.
5. Test Coverage:
We achieved comprehensive test coverage for both the BookService and OrderService:

Unit tests were written for business logic and service layer components using JUnit and Mockito.
Integration tests were conducted to ensure proper interaction between microservices.
6. Solutions Implemented:
To address various requirements of the assignment, we implemented the following solutions:

Developed RESTful APIs in both services to facilitate communication.
Integrated H2 database for BookService and ensured data persistence.
Implemented CRUD operations for books in the BookService.
Implemented order placement functionality in the OrderService, checking book existence in the BookService.
Configured Swagger for API documentation to enhance developer experience.
Ensured proper error handling and validation mechanisms throughout the services.
Conclusion:
In conclusion, we successfully implemented a microservices architecture using Spring Boot, fulfilling the assignment's objectives. Our design choices focused on modularity, scalability, and maintainability. Validation, API documentation, test coverage, and error handling were diligently implemented to ensure the reliability and robustness of the services. Overall, this project demonstrates proficiency in microservices development with Spring Boot and adherence to best practices in software engineering.
