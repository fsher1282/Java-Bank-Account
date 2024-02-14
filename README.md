# Java Banking Application

## About
This project represents my first foray into Java programming, with a focus on applying Object-Oriented Programming (OOP) principles and abstraction. The application simulates a basic banking system, allowing the creation and management of various account types including business, checking, savings, and trust accounts. It demonstrates the use of Java's OOP features such as inheritance, polymorphism, and encapsulation to model real-world entities and their interactions within a banking context.

## Features
- Supports multiple account types: Business, Checking, Savings, and Trust accounts.
- Implements fundamental banking operations such as deposit, withdraw, and account closure.
- Uses abstraction to generalize account behaviors while allowing specific account types to implement their own rules.
- Demonstrates error handling for invalid operations like negative deposits or withdrawals exceeding account balances.

## Getting Started

### Prerequisites
- JDK 1.8 or newer
- Basic understanding of Java and OOP concepts

### Installation
1. Clone the repository to your local machine:
```bash
git clone https://github.com/fsher1282/Java-Bank-Account
```
2. Navigate to the project directory:
```bash
cd JavaBankingApplication
```

### Running the Application
Compile the Java files and execute the main class. Make sure to compile all other Java files in the project directory similarly.

## Design
The application is structured around a main class `DMPProg6Main` that orchestrates the creation and testing of various account types. Each account type is a subclass of `DMPPBaseAccount`, which abstracts common account behaviors and attributes. Specific account behaviors are implemented in subclasses such as `DMPPBusinessAccount`, `DMPPCheckingAccount`, `DMPPSavingAccount`, and `DMPPTrustAccount`.

## Usage
Upon execution, the application will simulate a series of banking operations across different account types, showcasing the deposit and withdrawal functionalities, error handling, and account closure procedures. The output demonstrates each account's response to the operations based on its specific rules and conditions.

## Contributing
Feel free to fork the repository and submit pull requests to contribute to this project. Whether it's adding new features, fixing bugs, or improving documentation, all contributions are welcome.

## License
This project is open source and available under the [MIT License](LICENSE.md).

## Acknowledgments
- Special thanks to Dr. Kovach for guiding me through my first Java project.
- Inspired by my coursework in CSC 310.
