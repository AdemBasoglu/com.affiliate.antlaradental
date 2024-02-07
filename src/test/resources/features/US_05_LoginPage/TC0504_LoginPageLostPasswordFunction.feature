@Smoke
Feature: The user should request if lost password

  Scenario: The user should request if lost password.

    Given The user goes to home page
    And The user click Login link
    And The user clicks lost password link
    And The user verify title Request a Password Reset
    And The user writes valid email or username in the input
    And The user clicks Request Password Reset Button
    And The user should see Successfully requested password reset message
    Then The user close window
