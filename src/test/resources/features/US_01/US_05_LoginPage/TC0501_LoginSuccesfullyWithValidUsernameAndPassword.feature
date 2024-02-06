Feature: The user should be succesfuly login.

  Scenario: The user should be able to login successfully if the correct username and password are entered.

    Given The user goes to home page
    And The user click Login link
    And The user writes username
    And The user writes password
    And The user click submit button in login page
    And The user verify title Affiliate Dashboard – Antlara Dental Affiliate
    Then The user close window
