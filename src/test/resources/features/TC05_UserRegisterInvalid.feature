Feature: TC5: Register a new user with existing email

  Scenario: Navigate to registration page
    Given Launch browser
    Given Navigate to url "http://automationexercise.com"
    Then Verify that home page is visible successfully
    Given Click on "Signup / Login" button
    Then Verify that "New User Signup!" is visible

  Scenario: Register with existing email
    And Enter signup name and email
      | name | francisco@yahoo.com |
    Then Click on "Signup" button
    Then Verify error "Email Address already exist!" is visible