Feature: User cannot register with a existed username

  Scenario: When I enter the correct information as a user and use an existing username, the signup process should fail.

    Given The user goes to home page
    And The user click sigup link
    And The user fill in the form with correct information and exist username
    And The user click agree box
    And The user click submit button in signup page
    And The user should receive the message Username is already taken.
    Then The user close window
