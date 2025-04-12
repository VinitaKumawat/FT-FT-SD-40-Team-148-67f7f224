# 🔐 Login Functionality Test Plan

This repository contains the **manual and automated testing framework** for validating the login functionality of the website [The Internet Herokuapp](https://theinternet.herokuapp.com/login). The goal is to ensure that login mechanisms work as expected and are robust against various input scenarios.

---

## 📌 Introduction

This test plan defines the overall approach to validate the login functionality using both **manual and automated testing** strategies. Automation is implemented using **Selenium WebDriver with Java**, structured via the **Page Object Model (POM)** and **Cucumber BDD** for clarity and maintainability.

---

## 🎯 Objectives

- ✅ Verify successful and unsuccessful login flows.
- ✅ Ensure UI elements and field behaviors meet expected standards.
- ✅ Validate error messages for incorrect and blank credentials.
- ✅ Automate test scenarios using maintainable POM and Cucumber BDD.
- ✅ Generate detailed and clean test reports using Extent or Allure.

---

## 📦 Scope

### ✅ In-Scope:
- Functional testing (manual + automation) for login page.
- Positive and negative login scenarios.
- Field validation and error message verification.
- UI validation (password masking, placeholder, etc.).
- Report generation with Extent/Allure.

### ✅  Out of Scope:
- Performance or load testing.

---

## 🔍 Testable Features

- Username and password input fields.
- Login button functionality.
- Error message display.
- Successful navigation to the secure area.
- Logout functionality post-login.
- Field validation for blank and invalid entries.

---

## 🧪 Testing Approach

### 🖐️ Manual Testing:
- Prepare detailed test cases in spreadsheet format.
- Execute and record results.
- Validate UI and end-to-end user flow.
- Log bugs and issues in **Jira**.

### 🤖 Automation Testing:
- Use **Selenium WebDriver** with **Java**.
- Apply **POM** for reusable code structure.
- Write **Cucumber feature files** in Gherkin syntax.
- Implement step definitions mapped to page actions.
- Execute on multiple browsers (cross-browser validation).
- Generate reports using **Extent Reports** or **Allure**.

---

## 👥 Roles and Responsibilities

| Role  | Responsibility |
|-------|----------------|
| **Vinita** | Manual test case creation, automation implementation, bug reporting |
| **Palak** | POM structure, Cucumber features, automation reports |

---

## 📄 Test Deliverables

- ✅ Test Plan Document  
- ✅ Manual Test Case Spreadsheet  
- ✅ Bug Report Document  
- ✅ Cucumber Feature Files (`.feature`)  
- ✅ Step Definition Classes  
- ✅ Page Object Model Classes  
- ✅ Runner Files (TestNG or JUnit)  
- ✅ Execution Report (Extent or Allure)  
- ✅ Final Summary Report  

---

## 🚦 Entry & Exit Criteria

### Entry Criteria:
- Test environment is ready and accessible.
- Login page is functional and stable.
- All required tools and dependencies installed.
- Manual test cases reviewed and approved.

### Exit Criteria:
- Manual test case execution completed.
- All critical bugs fixed and retested.
- Automation pass rate ≥ 95%.
- Reports and final summary submitted.

---

## ✅ Approvals

**Approved By:**  
🧑‍💼 *Shiva Kumar MG* — Head of QA

---



