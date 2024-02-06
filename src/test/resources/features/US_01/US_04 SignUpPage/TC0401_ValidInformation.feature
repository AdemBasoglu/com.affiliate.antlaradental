Feature: The user should be succesfuly register.

  Scenario: When the user correct data is entered and the registration button is clicked, you should be redirected
  to the verification page and receive a "Thanks for Signing Up to Our Affiliate Program!" message should appear in the middle.

    Given The user goes to home page
    And The user click sigup link
    And The user fill in the form with correct information
    And The user click agree box
    And The user click submit button in signup page
    And The user verify Thanks for Signing Up to Our Affiliate Program!
    Then The user close window
