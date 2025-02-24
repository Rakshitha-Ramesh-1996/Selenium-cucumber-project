## Selenium Cucumber Project Using Maven & TestNG
This repository contains a Selenium automation framework that leverages Cucumber for Behavior-Driven Development (BDD), Maven for dependency management, and TestNG as the testing framework. It is designed for easy configuration and scalability.

# Table of Contents
Prerequisites
Folder Structure
Installation
Running Tests
Reporting
Contributing
License

# Prerequisites
Before running the project, ensure you have the following installed on your system:  

Java JDK 8+  
Maven 3.x  
An IDE such as IntelliJ IDEA or Eclipse  
Chrome Browser (or any browser of your choice; adjust the WebDriver accordingly)  
TestNG Plugin (if your IDE doesn’t already include it)  
Folder Structure  
# Below is an example of the project folder structure:
```
selenium-cucumber-project/
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   └── helper
    │   │       └── DriverManager.java      // Manages the WebDriver instance
    │   └── resources
    │       └── config.properties            // Configuration files (if any)
    └── test
        ├── java
        │   ├── hooks
        │   │   └── Hooks.java               // Cucumber hooks for before/after scenarios
        │   ├── pages
        │   │   └── LoginPage.java           // Page Object Model for Login page
        │   ├── stepDefinitions
        │   │   └── LoginSteps.java          // Step definitions for Cucumber scenarios
        │   └── runners
        │       └── TestRunner.java          // TestNG runner to trigger Cucumber tests
        └── resources
            ├── features
            │   └── Login.feature            // Cucumber feature file(s)
            └── testng.xml                   // TestNG configuration file

```

# Folder Structure Details

- pom.xml: Maven configuration file that handles dependencies and build settings.
- src/main/java: Contains production code, such as helper classes (e.g., DriverManager.java).
- src/test/java: Holds test code including:
  - hooks: Contains Cucumber hooks (Hooks.java) that run before and after scenarios (e.g., for screenshots and video recording).
  - pages: Implements Page Object Model (POM) classes such as LoginPage.java.
  - stepDefinitions: Contains step definitions that map Gherkin steps to Java code.
  - runners: Holds the TestNG runner class (TestRunner.java) to run Cucumber tests.
  - src/test/resources: Contains test resources like:
  - features: Cucumber feature files written in Gherkin.
  - testng.xml: TestNG suite configuration.
```
Installation
Clone the Repository:
git clone https://github.com/yourusername/selenium-cucumber-project.git
cd selenium-cucumber-project
Install Dependencies: Maven will automatically download the necessary dependencies when you build the project.

mvn clean install
Running Tests
Using Maven
You can run your TestNG suite with Maven using the following command:

mvn clean test
Using TestNG XML
Alternatively, you can run tests by executing the testng.xml file from your IDE or via Maven Surefire Plugin configured in pom.xml.

Using an IDE
Open the project in your IDE.
Locate the TestRunner.java in the runners package.
Right-click and choose Run 'TestRunner'.
Reporting
This project integrates with reporting tools such as Allure to generate detailed test reports. After test execution, you can generate and view the Allure report:

Generate the Allure Report:
allure serve target/allure-results
Video and Screenshot Attachments: The Cucumber hooks capture screenshots and video recordings on test failures. These are attached to the report for easier debugging.
Contributing
Contributions are welcome! Please follow these steps:

Fork the repository.
Create a new branch for your feature or bug fix.
Commit your changes and push the branch.
Open a pull request with a clear description of your changes.
