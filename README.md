#  Java Banking Application

A comprehensive **Banking Management System** developed in Java. This project simulates real-world banking operations while demonstrating core **Object-Oriented Programming (OOP)** principles.

# Key Features
* **Account Types**: Supports both **Savings** and **Checking** accounts with specific attributes.
* **Automated Account Generation**: Generates a unique account number using the last two digits of the SSN and a random 5-digit ID.
* **Savings Account Perks**: Includes a unique **Safety Deposit Box ID** and **Key**.
* **Checking Account Tools**: Provides an automated **Debit Card Number** and **PIN**.
* **Dynamic Interest Rates**: Implements an interface to fetch a base rate and adjusts it based on the account type.

# Technologies Used
* **Language**: Java
* **Data Structures**: `ArrayList` for account management.
* **Core Concepts**: Abstraction, Inheritance, Polymorphism, and Interfaces.

# File Description
* `Account.java`: Base abstract class for common fields.
* `Savings.java`: Child class for savings-specific features.
* `Checking.java`: Child class for checking-specific features.
* `IRateBase.java`: Interface for interest rate management.
* `BankAccountApp.java`: Main driver class to run the application.
