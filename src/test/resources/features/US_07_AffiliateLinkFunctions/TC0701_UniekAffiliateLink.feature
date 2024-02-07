@Smoke
Feature: The user's affiliate link should be unique

  Scenario: The user's affiliate link should be unique

    Given The user goes to home page
    And The user click Login link
    And The user writes username
    And The user writes password
    And The user click submit button in login page
    And The user's affiliate link should include username
    Then The user close window
