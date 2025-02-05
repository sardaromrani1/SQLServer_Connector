# SQLServer_Connector
# SQL Server JDBC Interaction Example
This repository contains a simple Java program demonstrating how to connect to a Microsoft SQL Server database and perform basic CRUD (Create, Read, Update, Delete) operations using JDBC.

## Description
This project provides a hands-on example of using JDBC (Java Database Connectivity) to interact with a SQL Server database. It showcases how to:
* Establish a connection to the database.
* Insert data into a table (CREATE).
* Retrieve data from a table (READ).
* Update existing data in a table (UPDATE).
* Delete data from a table (DELETE).

The code is designd to be easy to understand and adapt for your own projects. It is particularly useful for beginners learning how to work with databases in Java.

## Features
* Connects to a SQL Server database using JDBC.
* Demonstrates INSERT, SELECT, UPDATE, and DELETE operations.
* Uses 'PreparedStatement' to prevent SQL injection vulnerabilities.
* Includes error handling and resource management (closing connections, statements, and result sets).
* Uses 'try-with-resources' statement for automatic resource closure (Java 7+)
* Clear and well-commented code.

## Prerequisites
Before running this program, you need to have the following:
** Java Development Kit (JDK):** Version 8 or higher.
** Microsoft SQL Server:** A running instance of SQL Server (Express, Standard, or Enterprise).
** SQL Server JDBC Driver:** The Microsoft JDBC Driver for SQL Server must be downloaded and added to your project's classpath. You can download it from Microsoft website: [https://learn.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server-ver16](https://learn.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-ver16)

## Setup and Usage
1. **Clone the Repository:**
2. Add JDBC Driver to Classpath
3. Configure Database Connection
4. Create the Customers Table (If It Doesn't Exist)
5. Run the Java Program
6. Observe the Output

