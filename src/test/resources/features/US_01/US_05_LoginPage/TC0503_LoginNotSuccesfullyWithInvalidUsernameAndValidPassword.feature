Feature: The user should not succesfuly login.

  Scenario: The user should not login successfully if the invalid username and valid password are entered.

    Given The user goes to home page
    And The user click Login link
    And The user writes invalid username
    And The user writes valid password
    And The user click submit button in login page
    And The user should see error message
    Then The user close window
