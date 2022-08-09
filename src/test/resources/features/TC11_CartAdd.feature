Feature: Add Products in Cart

  Scenario: Add product
    Given Launch browser
    And Navigate to url "https://automationexercise.com/"
    Then Verify that home page is visible successfully
    Given Click on "Products" button
    Then Dismiss bottom Ad
    Then Click on Add to Cart on product 1
    Then Click on "Continue Shopping" button
    Then Click on Add to Cart on product 2
    Given Click on 'View Cart' button
    Then Verify that cart contains 2 products
    Then Verify that added products are the same in cart
