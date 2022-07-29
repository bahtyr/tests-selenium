Feature: TC3: User deletes their account

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

  Scenario: Delete the user
    Then Click on "Delete Account" button
    Then Verify that "Account Deleted!" is visible
    Then Click on "Continue" button