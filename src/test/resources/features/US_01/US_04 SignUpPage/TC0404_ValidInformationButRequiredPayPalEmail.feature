Feature: The user cannot succesfuly register with required paypal email.

  Scenario: When I enter the correct information as a user and use a reqiered paypal email, the signup process should fail.

    Given The user goes to home page
    And The user click sigup link
    And The user fill in the form with correct information but a required paypal email
    And The user click agree box
    And The user click submit button in signup page
    And The user should receive the message Required and must be a valid paypal email address
    Then The user close window
