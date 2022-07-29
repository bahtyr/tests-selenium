Feature: TC1: Register User

  Scenario: Navigate to registration page
    Given Launch browser
    Given Navigate to url "http://automationexercise.com"
    Then Verify that home page is visible successfully
    Given Click on "Signup / Login" button
    Then Verify that "New User Signup!" is visible

  Scenario: Register a new user
    And Enter signup name and email
      | faker | faker |
    Then Click on "Signup" button
    Then Verify that "Enter Account Information" is visible
    Then Fill user details part1
      #title, name, password, day, year, month
      | Mr | Test | qazwsx1 | 1 | 1 | 1999 |
    Then Select checkbox "Sign up for our newsletter!"
    Then Select checkbox "Receive special offers from our partners!"
    Then Fill user details part2
      #faker
    Then Click on "Create Account" button
    Then Verify that "Account Created!" is visible
    Then Click on "Continue" button
    Then Verify that "Logged in as" is visible

  Scenario: Delete the user
    Then Click on "Delete Account" button
    Then Verify that "Account Deleted!" is visible
    Then Click on "Continue" button