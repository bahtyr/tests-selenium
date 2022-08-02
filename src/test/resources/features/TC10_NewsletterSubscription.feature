Feature: Newsletter Subscription

  Background: Navigate to home page
    Given Launch browser
    And Navigate to url "https://automationexercise.com/"
    Then Verify that home page is visible successfully

  Scenario: Subscribe from home page
    Then Verify that "Subscription" is visible
    Given Enter email "test@email.com" to subscribe
    Given Click on "subscribe" button
    Then Verify that "You have been successfully subscribed!" is visible

  Scenario: Subscribe from cart page
    And Click on 'Cart' button
    Then Verify that "Subscription" is visible
    Given Enter email "test@email.com" to subscribe
    Given Click on "subscribe" button
    Then Verify that "You have been successfully subscribed!" is visible