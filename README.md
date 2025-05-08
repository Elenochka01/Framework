### Framework
---
### **Project Description**

This project presents a custom Selenium automation framework developed in **Java**, designed to test and validate the functionality of a web application. The framework is structured for scalability, maintainability, and clarity, making it suitable for both small test suites and enterprise-level testing.

The project follows the **Page Object Model (POM)** design pattern, where each web page is represented as a separate class under the `pageObjects` package. This approach ensures that locators and page actions are logically organized and easy to maintain as the application evolves.

Key features include:

* Modular structure with dedicated packages for **page objects**, **test cases**, **test data**, and **utilities**.
* Use of `WebDriverWait` to handle dynamic content and improve test stability.
* A shared **BaseClass** that manages WebDriver setup, teardown, and reusable configuration.
* Integration-ready design for CI/CD pipelines and reporting tools like **ExtentReports**.
* Well-organized test scripts for specific use cases (e.g., `CPB15`, `CPB16`, `CPB49CloneProduct`) under `testCases`.

This framework serves as a solid foundation for automated testing in Agile teams, supporting continuous delivery with reliable UI validation.

---

### **Technologies & Tools Used**

* **Programming Language:** Java
* **Automation Framework:** Selenium WebDriver
* **IDE:** IntelliJ IDEA
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Wait Strategy:** WebDriverWait
* **Reporting:** ExtentReports
* **Operating System:** Windows 10
