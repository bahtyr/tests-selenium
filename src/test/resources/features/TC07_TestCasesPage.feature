Feature: Verify Test Cases Page

  #repeated steps
  Scenario: Navigate to home page
    Given Launch browser
    And Navigate to url "https://automationexercise.com/"
    Then Verify that home page is visible successfully

  Scenario: Navigate to test cases page
    Then Click on "Test Cases" button
    Then Verify that user is navigated to "https://automationexercise.com/test_cases"