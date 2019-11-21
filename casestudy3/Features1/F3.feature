Feature: search functionality
Scenario: proceed to pay without adding to cart
Given Login page will open
When user enters lalitha as username and password123 as password and click on Login
And search the product
And proceed to pay without adding to cart
Then error message is displayed
