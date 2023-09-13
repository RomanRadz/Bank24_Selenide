# Automated Testing for Banking Application with Selenide

## Overview

Welcome to the repository for automated testing of a banking application using the Selenide framework. This project is dedicated to ensuring the quality and reliability of various banking functionalities, including car loans and mobile phone replenishment, through automated testing.

## Project Structure

The project structure is organized as follows:

- `src/main/java`: Contains the main source code for the automation framework.
  - `common`: Includes utility classes such as `CommonActions.java`, `Config.java`, and `Listener.java`.
  - `constants`: Holds constant values used throughout the project in `Constant.java`.
  - `pages`: Consists of page objects organized by functionality.
    - `base`: Contains the `BasePage.java` class for common page interactions.
    - `loans`: Includes page objects related to car loans, such as `CarLoansPage.java`.
    - `telecommunications`: Includes page objects for mobile phone replenishment, like `MobilePhoneReplenishmentPage.java`.
- `src/main/resources`: Contains additional resources for the project, including WebDriver executables and configuration files.
- `src/test/java/tests`: Holds test classes organized by functionality.
  - `base`: Contains the `BaseTest.java` class for common test configurations.
  - `Listener.java`: Custom test listener for reporting.
  - `loans/positive`: Test classes for positive scenarios related to car loans.
  - `telecommunications/positive`: Test classes for positive scenarios related to mobile phone replenishment.
- `src/test/resources`: Contains testing-related resource files, such as configuration properties.

## Getting Started

To get started with this automated testing framework, follow these steps:

1. Clone this repository to your local machine.
2. Configure the project based on your testing environment and requirements using `Config.java` and other configuration files.
3. Install the necessary dependencies specified in `pom.xml` using Maven.
4. Run the desired test cases to perform automated testing of the banking application with Selenide.

## Dependencies

This project relies on the following dependencies:

- Selenide
- Java
- JUnit
- Allure Reporting

## Contributing

Contributions to enhance the framework and test coverage are highly encouraged. If you have improvements or bug fixes to contribute, please fork the repository and submit pull requests.

## License

This project is licensed under the MIT License.
