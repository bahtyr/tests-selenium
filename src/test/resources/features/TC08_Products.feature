Feature: TC08: Verify All Products and product detail page

  #repeated steps
  Scenario: Navigate to home page
    Given Launch browser
    And Navigate to url "https://automationexercise.com/"
    Then Verify that home page is visible successfully

  Scenario: Navigate to test cases page
    Then Click on "Products" button
    Then Verify that user is navigated to "https://automationexercise.com/products"
    Then Verify that the products list is visible

  Scenario: View and verify a product
    Then Dismiss bottom Ad
    Then Click on "View Product" button
    Then Verify that user is navigated to "https://automationexercise.com/product_details/1"
    Then Verify that product details are visible