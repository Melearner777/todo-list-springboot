# To-Do List Application (Spring Boot + Thymeleaf + MySQL)

A simple to-do list web application built with Spring Boot, Thymeleaf, and MySQL.  
Features include adding, marking as done, deleting tasks, and dark mode toggle.

---

## Features
- Add tasks to your list
- Mark tasks as done
- Delete tasks
- Dark mode toggle
- MySQL database integration

---

## Requirements
- Java 17 or above
- Maven
- MySQL Server
- Git

---

## Setup Instructions

### 1. Clone the repository
```bash
git clone https://github.com/Melearner777/todo-list-springboot.git
cd todo-list-springboot

```
2. Configure MySQL Database

Create a database in MySQL:
```sql
CREATE DATABASE todo_db;
```
Update application.properties (in src/main/resources/) with your MySQL credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```
3. Build and Run the Application
```bash
mvn spring-boot:run
```
4. Access the Application

Open your browser and go to:
```Arduino
http://localhost:8081

```
---Project Structure---
```bash
src/
  main/
    java/com/jishan/todo/   # Java code (Controller, Service, Model, Repository)
    resources/
      templates/            # Thymeleaf templates (index.html)
      application.properties
```
