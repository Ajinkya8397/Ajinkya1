Feature: search functionality
Scenario: search for headphones by typing
Given login page is opened
When user enters lalitha as username and password123 as password
And searches for headphones in search field
Then user is able to purchase headphones