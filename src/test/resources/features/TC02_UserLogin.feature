Feature: TC2: User Login valid and invalid

  Scenario: Navigate to login page
    Given Launch browser
    Given Navigate to url "http://automationexercise.com"
    Then Verify that home page is visible successfully
    Given Click on "Signup / Login" button
    Then Verify that "Login to your account" is visible

  Scenario: Invalid login
    Given Enter login email and password
      | francisco@yahoo.com | 1234567890 |
    Given Click on "Login" button
    Then Verify error "Your email or password is incorrect!" is visible

  Scenario: Valid login
    Given Enter login email and password
      | francisco@yahoo.com | 123456 |
    Given Click on "Login" button
    Then Verify that "Logged in as" is visible