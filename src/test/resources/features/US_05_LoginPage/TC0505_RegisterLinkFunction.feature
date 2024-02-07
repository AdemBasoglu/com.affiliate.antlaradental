@Smoke
Feature: The user should use register link function

  Scenario: The user should use register link function

    Given The user goes to home page
    And The user click Login link
    And The user clicks register link
    And The user verify title Affiliate Signup
    Then The user close window
