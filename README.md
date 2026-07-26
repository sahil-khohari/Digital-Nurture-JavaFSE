# Digital-Nurture-JavaFSE

This repository contains all the mandatory hands-on exercises completed for the **Cognizant Digital Nurture 5.0 - Java Full Stack Engineer (FSE)** deep-skilling program.

## Table of Contents
- [Week 1: Fundamentals, PL/SQL, & Testing](#week-1-fundamentals-plsql--testing)
- [Week 2: Spring Core, Maven, & Spring Data JPA](#week-2-spring-core-maven--spring-data-jpa)
- [Week 3: Spring REST using Spring Boot 3](#week-3-spring-rest-using-spring-boot-3)
- [Week 4: Microservices with Spring Boot 3 & Spring Cloud](#week-4-microservices-with-spring-boot-3--spring-cloud)

---

## Week 1: Fundamentals, PL/SQL, & Testing

### Module 1: Design Patterns and Principles
- **Ex01:** Implemented the Singleton Pattern.
- **Ex02:** Implemented the Factory Method Pattern.

### Module 2: Algorithms & Data Structures
- **Ex02:** E-commerce Platform Search Function (Binary & Linear search algorithms).
- **Ex07:** Financial Forecasting (Recursion and Big O analysis).

### Module 3: PL/SQL Programming
- **Ex01:** Control Structures (If-else, Loops, Cursors).
- **Ex03:** Stored Procedures (Data insertion, validation, and manipulation).

### Module 4: TDD using JUnit5, Mockito, and SLF4J
- **Ex01:** Basic JUnit 5 assertions, setup/teardown methods, and the Arrange-Act-Assert (AAA) pattern.
- **Ex03:** Mockito mocking, stubbing, and verifying interactions with external dependencies.
- **Ex06:** SLF4J implementation for robust error and warning level logging.

---

## Week 2: Spring Core, Maven, & Spring Data JPA

### Module 5: Spring Core and Maven
- **Ex01:** Setup a basic Spring Application utilizing standard `applicationContext.xml`.
- **Ex01 (Part 2):** Implemented Constructor and Setter Dependency Injection.
- **Ex04:** Configured Maven `pom.xml` configurations for Spring dependencies.

### Module 6: Spring Data JPA with Hibernate
- **Ex01:** Bootstrapped Spring Data JPA with H2 Database.
- **Ex02:** Defined Entity classes and mapped them using JPA annotations (`@Entity`, `@Table`, `@Id`).
- **Ex03:** Set up the Repository Layer extending `CrudRepository`.
- **Ex04:** Executed complete CRUD operations (Finding, Adding, Deleting) on employee data via a `CommandLineRunner`.

---

## Week 3: Spring REST using Spring Boot 3

### Module 7: Spring REST
- **Ex01:** Created a standard Spring Web Project using Maven.
- **Ex02:** Loaded application context models from a generic XML file.
- **Ex03:** Bootstrapped a Hello World REST controller using `@RestController`.
- **Ex04:** Created a robust Country Web Service providing full RESTful access to Country models.
- **Ex05:** Implemented parameter fetching to Get Country By Code.
- **Ex06:** Secured endpoints using an Authentication Service implementing JWT tokens.

---

## Week 4: Microservices with Spring Boot 3 & Spring Cloud

### Module 8: Microservices Architecture
- **Ex01:** Scaffolded base independent `Account` and `Loan` Microservices.
- **Ex02:** Configured and launched a centralized **Eureka Discovery Server**.
- **Ex03:** Refactored the `Account` Microservice to act as an active Eureka Client.
- **Ex04:** Refactored the `Loan` Microservice to act as an active Eureka Client.
- **Ex05:** Implemented a Spring Cloud **API Gateway** leveraging WebFlux to intelligently route external traffic across the microservice ecosystem.

---

## How to Run

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/sahil-khohari/Digital-Nurture-JavaFSE.git
   ```
2. Navigate to any specific Exercise directory.
3. For Maven projects, build and compile using the standard lifecycle commands:
   ```bash
   mvn clean compile
   ```
4. Execute via standard IDE runners or by packaging a JAR file and executing it.

---

## Week 5: React
- [x] Ex01: myfirstreact (SPA Basics)
- [x] Ex02: studentapp (Class Components)
- [x] Ex03: scorecalculatorapp (Functional Components & CSS)
- [x] Ex04: blogapp (Lifecycle Hooks & Fetch API)
- [x] Ex05: cohortdetails (CSS Modules)
- [x] Ex09: cricketapp (Conditional Rendering)
- [x] Ex10: counterapp (State Management)
- [x] Ex11: eventexamplesapp (Event Handling)
- [x] Ex12: ticketbookingapp (Complex Conditional Rendering)
- [x] Ex13: bloggerapp (Multiple Conditional Rendering Techniques)

---

## Week 6: M11 React Additional
- [x] Ex06_Trainerapp: React Router Implementation
- [x] Ex07_Shoppingapp: React Props and Component Composition
- [x] Ex08_Counterapp: React Component State Management
- [x] Ex14_Contextapp: Advanced React Context API
- [x] Ex15_Ticketraisingapp: Controlled Forms & State Binding
- [x] Ex16_Mailregisterapp: Complex Form Validation
- [x] Ex17_Fetchuserapp: Asynchronous REST API Fetching (componentDidMount)

