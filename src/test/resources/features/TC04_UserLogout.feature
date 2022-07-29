Feature: TC2: User logout

  #repeated steps
  Scenario: Navigate to login page
    Given Launch browser
    Given Navigate to url "http://automationexercise.com"
    Then Verify that home page is visible successfully
    Given Click on "Signup / Login" button
    Then Verify that "Login to your account" is visible

  #repeated steps
  Scenario: Valid login
    Given Enter login email and password
      | francisco@yahoo.com | 123456 |
    Given Click on "Login" button
    Then Verify that "Logged in as" is visible

  Scenario: Logout
    Given Click on "Logout" button
    Then Verify that user is navigated to "https://automationexercise.com/login"