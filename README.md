### Framework
---
### **Project Description**

This project presents a custom-built Selenium automation framework developed in **Java**, designed to test and validate the functionality of a web application. The framework was created from scratch and demonstrates a modular, scalable, and maintainable test structure using industry best practices.

The framework follows the **Page Object Model (POM)** design pattern to separate test logic from element locators, improving readability and making it easy to maintain and scale as the application grows.

Key features include:

* Centralized **Locators class** to store XPath expressions and element paths, reducing redundancy and simplifying maintenance.
* Use of **WebDriverWait** to handle dynamic elements and ensure stable test execution.
* Clean and well-organized code structure with reusable methods for better code efficiency.
* Designed for easy integration into CI/CD pipelines for automated regression testing.

This project serves as a strong foundation for future automation work and showcases good practices in building UI test frameworks from the ground up.

---

### **Technologies & Tools Used**

* **Programming Language:** Java
* **Automation Framework:** Selenium WebDriver
* **IDE:** IntelliJ IDEA
* **Build Tool:** Maven
* **Locator Strategy:** XPath (stored in centralized `Locators.java`)
* **Wait Strategy:** WebDriverWait
* **Design Pattern:** Page Object Model (POM)
* **Operating System:** Windows 10
