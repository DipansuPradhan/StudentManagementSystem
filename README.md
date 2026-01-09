# Student Management System (Java + MySQL)

A console-based Student Management System developed using Core Java, JDBC, and MySQL.  
The application performs full CRUD (Create, Read, Update, Delete) operations and stores data permanently in a MySQL database.  
This project was built for interview preparation (TCS Prime).

## Features
- Add student  
- View all students  
- Search student by roll number  
- Update student details  
- Delete student record  

## Technologies Used
- Java (JDK 17)
- JDBC
- MySQL
- VS Code
- MySQL Connector/J

## Project Structure
StudentManagementSystem
├── src
│ ├── Main.java
│ ├── Student.java
│ ├── StudentDAO.java
│ ├── StudentService.java
│ └── DatabaseConnection.java
├── lib
│ └── mysql-connector-j-9.5.0.jar
└── README.md

## Database Setup
```sql
CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    roll INT UNIQUE,
    department VARCHAR(50),
    marks INT
);

## How to Run?

Start MySQL Server

Update MySQL username and password in DatabaseConnection.java

Compile and run:
javac src/*.java
java -cp "lib/*;src" Main
OR run Main.java directly from VS Code.

Author
Dipansu Pradhan
GitHub: https://github.com/DipansuPradhan

---

