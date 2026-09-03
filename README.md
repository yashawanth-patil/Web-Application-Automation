# Enterprise Web Application Automation Framework

An automated UI testing framework built with **Java**, **Selenium WebDriver**, and **TestNG**. Implements the **Page Object Model (POM)** design pattern to ensure modularity, high test maintainability, robust dynamic synchronization, and CI/CD readiness.

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
│   ├── base/                   # BaseTest (Driver initialization, setup, teardown)
│   └── tests/                  # TestNG test classes containing test validations
├── src/test/resources
│   ├── config.properties       # Environment settings (Browser, URLs, Timeouts)
│   └── testdata/               # Externalized test datasets
├── testng.xml                  # Suite configuration (Parallel runs, groups)
└── pom.xml                     # Maven project dependencies
```

---

## ✨ Key Framework Features

* **Page Object Model (POM):** Complete separation between web page elements, business actions, and test assertions.
* **Smart Synchronization:** Zero static sleeps; built entirely with `WebDriverWait` and `ExpectedConditions` to eliminate flaky tests.
* **Cross-Browser & Headless Support:** Ready for local and headless browser runs (Chrome, Firefox, Edge) for CI/CD environments.
* **Parallel Test Execution:** Configured via `testng.xml` thread pools to accelerate execution cycles.
* **Automated Failure Screenshots:** Automatically captures and attaches failure state screenshots to reports via TestNG listeners.

---

## 🚀 How to Set Up and Run Locally

### Prerequisites
* JDK 11 or higher installed
* Maven installed and configured in system PATH

### 1. Clone the repository
```bash
git clone [https://github.com/yashawanth-patil/Web-Application-Automation.git](https://github.com/yashawanth-patil/Web-Application-Automation.git)

cd Web-Application-Automation
```

### 2. Execute tests via Maven
Run the default test suite:
```bash
mvn clean test
```

Run tests with specific parameters (e.g., custom browser or headless mode):
```bash
mvn clean test -Dbrowser=chrome -Dheadless=true
```

---

## 📊 Reports
After the test run completes, HTML execution reports can be viewed under:
* `target/surefire-reports/emailable-report.html`
