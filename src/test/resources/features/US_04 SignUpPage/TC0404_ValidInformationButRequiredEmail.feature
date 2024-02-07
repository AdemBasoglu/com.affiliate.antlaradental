@Smoke
Feature: User cannot register with a required email

  Scenario: When I enter the correct information as a user and use a required email, the signup process should fail.

    Given The user goes to home page
    And The user click sigup link
    And The user fill in the form with correct information and required email
    And The user should receive the message Required and must be a valid email address
    Then The user close window
