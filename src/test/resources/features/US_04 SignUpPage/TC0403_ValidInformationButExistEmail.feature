@Smoke
Feature: User cannot register with a existed email

  Scenario: When I enter the correct information as a user and use an existing email, the signup process should fail.

    Given The user goes to home page
    And The user click sigup link
    And The user fill in the form with correct information and exist email
    And The user click agree box
    And The user click submit button in signup page
    And The user should receive the message  Email Address has already been used by another user
    Then The user close window
