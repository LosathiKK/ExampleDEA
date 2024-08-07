# ExampleDEA

This repository contains the code for a Book Store Management System build using Spring Boot microservices. There are six services we're including to manage books, authors, publishers, cutomers, orders, and categories of books. 

Six Services:
  1. Book Service
  2. Author Service
  3. Publisher Service
  4. Category Service
  5. Order Service
  6. Customer Service

Appilcation Floder Structure:

yExampleDEA
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── yourproject
│   │   │               ├── YourProjectApplication.java
│   │   │               ├── config
│   │   │               │   └── SecurityConfig.java
│   │   │               ├── controller
│   │   │               │   ├── BookController.java
│   │   │               │   ├── CustomerController.java
│   │   │               │   ├── OrderController.java
│   │   │               │   ├── AuthorController.java
│   │   │               │   ├── PublisherController.java
│   │   │               │   └── CategoryController.java
│   │   │               ├── dto
│   │   │               │   ├── BookDTO.java
│   │   │               │   ├── CustomerDTO.java
│   │   │               │   ├── OrderDTO.java
│   │   │               │   ├── AuthorDTO.java
│   │   │               │   ├── PublisherDTO.java
│   │   │               │   └── CategoryDTO.java
│   │   │               ├── entity
│   │   │               │   ├── Book.java
│   │   │               │   ├── Customer.java
│   │   │               │   ├── Order.java
│   │   │               │   ├── Author.java
│   │   │               │   ├── Publisher.java
│   │   │               │   └── Category.java
│   │   │               ├── exception
│   │   │               │   ├── CustomException.java
│   │   │               │   └── GlobalExceptionHandler.java
│   │   │               ├── repository
│   │   │               │   ├── BookRepository.java
│   │   │               │   ├── CustomerRepository.java
│   │   │               │   ├── OrderRepository.java
│   │   │               │   ├── AuthorRepository.java
│   │   │               │   ├── PublisherRepository.java
│   │   │               │   └── CategoryRepository.java
│   │   │               └── service
│   │   │                   ├── BookService.java
│   │   │                   ├── CustomerService.java
│   │   │                   ├── OrderService.java
│   │   │                   ├── AuthorService.java
│   │   │                   ├── PublisherService.java
│   │   │                   └── CategoryService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── yourproject
│                       └── YourProjectApplicationTests.java
└── pom.xml
