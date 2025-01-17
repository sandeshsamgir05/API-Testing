# 🚀 API Testing with RestAssured

Welcome to the **API Testing with RestAssured** repository! This project showcases how to perform API testing using the powerful RestAssured library in Java. Designed for both beginners and experienced testers, this repository demonstrates best practices in automation, structured test cases, and integration with CI/CD pipelines.

---

## 🌟 Features

- **Comprehensive REST API Testing**:
  - CRUD operations (GET, POST, PUT, DELETE).
  - Query and path parameters, headers, and body validation.
- **Assertions**: Validate status codes, response bodies, headers, and more.
- **JSON and XML Parsing**: Extract and assert data from API responses.
- **Reusable Framework**: Modular code for easy scalability.
- **CI/CD Integration**: Seamlessly integrate with GitHub Actions or Jenkins.
- **Reports**: Generate detailed test execution reports using Allure or ExtentReports.

---

## 🛠️ Technologies Used

- **Language**: Java 11+
- **Build Tool**: Maven
- **Testing Framework**: TestNG
- **Library**: RestAssured
- **Reporting**: Allure/ExtentReports (optional)
- **CI/CD**: GitHub Actions (or Jenkins)

---

## 📂 Project Structure

```plaintext
📦 your-repo-name
├── 📁 src
│   ├── 📁 test
│   │   ├── 📁 java
│   │   │   ├── TestCases.java     # Test cases
│   │   │   ├── BaseTest.java      # Setup and teardown
│   │   │   ├── Utils.java         # Utility methods
│   │   ├── 📁 resources
│   │       ├── config.properties  # Configuration details
│   │       ├── testdata.json      # Sample test data
├── 📁 docs
│   ├── API_Testing_Demo.gif       # Demo file
│   ├── TestExecutionReport.pdf    # Sample report
├── README.md
├── pom.xml                        # Maven dependencies
└── .gitignore                     # Ignored files
