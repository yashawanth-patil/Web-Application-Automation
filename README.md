# `Web-Application-Automation`

```markdown
# Enterprise Web Application Automation Framework

An automated UI testing framework built with Java, Selenium WebDriver, and TestNG. Implements the **Page Object Model (POM)** design pattern to ensure modularity, high test maintainability, robust dynamic synchronisation, and CI/CD readiness.

---

## 🛠️ Tech Stack & Dependencies

* **Language:** Java 17 / 11
* **Automation Engine:** Selenium WebDriver (v4)
* **Design Pattern:** Page Object Model (POM)
* **Test Runner:** TestNG
* **Build Tool:** Apache Maven
* **Browser Management:** Selenium Manager / WebDriverManager
* **Reporting:** TestNG Surefire / ExtentReports / Allure

---

## 📂 Framework Architecture

```text
Web-Application-Automation
├── src/main/java
│   ├── pages/                  # Page Object classes (Locators and Page Actions)
│   └── utils/                  # ConfigReader, WebDriverFactory, ExplicitWaitHelper
├── src/test/java
│   ├── base/                   # BaseTest (Driver initialisation, setup, teardown)
│   └── tests/                  # TestNG test classes containing test validations
├── src/test/resources
│   ├── config.properties       # Environment settings (Browser, URLs, Timeouts)
│   └── testdata/               # Externalized test datasets
├── testng.xml                  # Suite configuration (Parallel runs, groups)
└── pom.xml                     # Maven project dependencies
