Feature: Amazon Search

Scenario: Search a product

Given I have a search field on Amazon page
When I search a product with name " Apple Macbook pro" and price 1000
Then Product with name "Apple Macbook pro" should be displayed