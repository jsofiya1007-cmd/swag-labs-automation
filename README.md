# Swag Labs Automation

## Project Description
This project is an automation framework for testing the Swag Labs application using Java, Selenium, and TestNG. The framework is designed to facilitate automated testing of the application's functionalities and ensure the quality of the code.

## Setup Instructions
1. **Clone the Repository**  
   Run the following command to clone the repository:
   ```bash
   git clone https://github.com/jsofiya1007-cmd/swag-labs-automation.git
   ```
2. **Install Dependencies**  
   Navigate to the project directory and install the required dependencies. Make sure you have Maven installed, and run:
   ```bash
   mvn install
   ```
3. **Set Up WebDriver**  
   Download the appropriate WebDriver (ChromeDriver or GeckoDriver) and add it to your system's PATH.

## Usage Guide
To run the tests, use the following Maven command:
```bash
mvn test
```

You can also run specific test classes by specifying the class name:
```bash
mvn -Dtest=YourTestClassName test
```

Make sure to update the WebDriver path in the project configuration if needed.