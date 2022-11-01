Feature: Etsy search functionality

  User story: As a user, when I am on the etsy search page
  I should be able to search whatever I want and see relevant information

  @wip
  Scenario:Etsy Title Verification
    Given  User is on etsy homepage
    Then  User sees title is as expected.

  Scenario:  Etsy Search Functionality Title Verification (without parameterization)
    Given User is on etsy homepage
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title