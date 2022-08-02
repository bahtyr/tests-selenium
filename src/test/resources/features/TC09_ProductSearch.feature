Feature: TC09: Product Search

  #repeated steps
  Scenario: Navigate to products page
    Given Launch browser
    And Navigate to url "https://automationexercise.com/"
    Then Verify that home page is visible successfully
    Then Click on "Products" button
    Then Verify that "All Products" is visible

  Scenario: Search a product
    Given Search for "tshirt" in products
    Then Click on "submit_search" button
    Then Verify that "Searched Products" is visible
    Then Verify "tshirt" exists in product search results