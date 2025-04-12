# Introduction
This test plan outlines the strategy for validating the login functionality of the website https://theinternet.herokuapp.com/login. It includes both manual and automated testing approaches. The automation will follow the Page Object Model (POM) and Cucumber BDD framework using Selenium and Java.

# Objectives

•	Ensure the login functionality works as intended for valid and invalid user credentials.

•	Validate UI elements, error messages, and field validations.

•	Automate the login test scenarios using a maintainable POM structure with Cucumber for BDD-style test cases.

•	Deliver clean and comprehensive test reports.


# 	Scope
## In-Scope:

•	Functional testing of login page manually and through automation.

•	Positive and negative login scenarios.

•	Field validation and error message testing.

•	UI validation (input field behaviour, password masking, etc.).

•	Reporting using Extent/Allure.

## Out of Scope

•	Performance testing


# 	Testable Features

•	Username and password input fields.

•	Login button functionality.

•	Error message display for invalid or empty input.

•	Successful login flow and navigation to secure area.

•	Logout option post-login.

•	Field validations (blank, incorrect inputs).


# Testing Approach

## Manual Testing

•	Prepare test cases in spreadsheet format.

•	Execute each test case and record actual results.

•	Validate UI behaviour and user flow.

•	Log and track bugs using Jira.

## Automation Testing

•	Use Selenium with Java.

•	Follow Page Object Model (POM) structure for reusable page components.

•	Use Cucumber for writing human-readable feature files.

•	Map steps to definitions and implement actions via page classes.

•	Generate reports using Extent.

•	Execute test scripts on multiple browsers.

# 	Roles and Responsibilities
## Role                 	Responsibility
Vinita	          Write and execute manual test cases, automate scenarios, and report bugs
Palak	             Implement POM, write Cucumber features, generate reports

# 	Test Deliverables
•	Test Plan Document

•	Manual Test Case Sheet

•	Bug Report

•	Cucumber Feature Files

•	Step Definition Classes

•	Page Object Classes

•	TestNG/JUnit Runner Files

•	Execution Report (Extent or Allure)

•	Final Summary Report


# Entry and Exit Criteria
## Entry Criteria:
•	Test environment is set up and accessible.

•	Login page is functional.

•	Required tools and dependencies are installed.

•	Manual test cases are reviewed and approved.

## Exit Criteria:
•	All manual test cases executed with pass/fails status.

•	All critical defects resolved and retested.

•	Automation scripts show 95%+ pass rate.

•	Test summary and reports submitted.

# Approvals

This project has been reviewed and approved by Shiva Kumar MG (Head).
