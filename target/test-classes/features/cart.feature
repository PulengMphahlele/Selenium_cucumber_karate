Feature: Shopping Cart

  Background:
    Given I am on home page
    When I click home category button
    And I click shop now
    And I click first item
    And I click Add to cart

  Scenario: I should be able to remove an item
    When I remove an item
    Then item should be removed