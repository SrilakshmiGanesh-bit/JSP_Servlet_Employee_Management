# JSP Servlet Employee Management System

## Project Overview

The Employee Management System is a web-based application developed using Java, JSP, Servlets, JDBC, and MySQL. It helps manage employee information by providing employee registration, retrieval, updating, deletion, and department-based search functionalities.

## Features

### 1. Employee Registration
- Register new employees with Employee ID, Name, Age, Department, Salary, and Email.
- Store employee details in a MySQL database using JDBC.

### 2. Display All Employees
- Retrieve all employee records from the database.
- Display employee details in an HTML table.
- Provide options to update and delete employee records.

### 3. Update Employee Details
- Retrieve existing employee details using Employee ID.
- Update employee department and salary.
- Save the modified information in the MySQL database.

### 4. Delete Employee Details
- Delete employee records using Employee ID.
- Display a confirmation message before deletion.
- Redirect users to the employee list after successful deletion.

### 5. Search Employees by Department
- Search employees using their department name.
- Retrieve matching employee records from the MySQL database.
- Display the search results in an HTML table.

## Technologies Used

- **Programming Language:** Java
- **Frontend:** JSP, HTML, BOOTSTRAP
- **Backend:** Java Servlets
- **Database Connectivity:** JDBC
- **Database:** MySQL
- **Server:** Apache Tomcat
- **IDE:** Eclipse

## Project Architecture

The application follows the MVC (Model-View-Controller) architecture to separate application responsibilities.

- **Model:** Handles employee data and database connectivity.
- **View:** JSP pages provide the user interface.
- **Controller:** Servlets handle HTTP requests and coordinate application operations.
- **Service:** Contains business logic and database operations.

## Database Structure

**Database:** `empdatas`

**Table:** `empdata`

| Column Name | Description |
|---|---|
| empId | Employee ID |
| empName | Employee Name |
| empAge | Employee Age |
| empDepartment | Employee Department |
| empSalary | Employee Salary |
| empEmail | Employee Email |

## Application Workflow

1. Users enter employee details through the registration form.
2. Servlets receive the submitted form data.
3. JDBC connects the application to the MySQL database.
4. Employee records are inserted, retrieved, updated, or deleted.
5. Users can search and view employees based on their department.

## How to Run the Project

1. Clone or download this repository.
2. Import the project into Eclipse IDE.
3. Configure the MySQL database and create the required employee table.
4. Update the database connection URL, username, and password.
5. Configure Apache Tomcat in Eclipse.
6. Add the MySQL JDBC driver to the project.
7. Run the application on the Tomcat server.
8. Open the application in your browser.

## Learning Outcomes

- Understanding JSP and Servlet-based web application development.
- Implementing MVC architecture.
- Establishing database connectivity using JDBC.
- Performing CRUD operations using SQL queries.
- Handling HTTP requests and form submissions.
- Retrieving and displaying database records.
- Implementing department-based search functionality.

## Author

**Srilakshmi G**

Java Backend Developer 
