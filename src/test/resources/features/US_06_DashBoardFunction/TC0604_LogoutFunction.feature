@Smoke
Feature: The User should logout successfully

  Scenario: As a user, I should be able to log out successfully when I click on the logout tab in the dashboard.

    Given The user goes to home page
    And The user click Login link
    And The user writes username
    And The user writes password
    And The user click submit button in login page
    And The user clicks Logout link
    And The user goes to login page
    Then The user close window
