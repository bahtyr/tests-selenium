Feature: TC6: Contact Us Form

  Scenario: Navigate to registration page
    Given Launch browser
    Given Navigate to url "https://automationexercise.com"
    Then Verify that home page is visible successfully
    Given Click on "Contact us" button
    Then Verify that "Get In Touch" is visible

  Scenario: Fill & submit form
    Then Enter contact form details
    Then Upload a file to contact form
    Then Click on "Submit" button
    Then Accept alert
    Then Verify that 'Success! Your details have been submitted successfully.' is visible

  Scenario: Return home
    Then Click on "Home" button
    Then Verify that user is navigated to "https://automationexercise.com/"
