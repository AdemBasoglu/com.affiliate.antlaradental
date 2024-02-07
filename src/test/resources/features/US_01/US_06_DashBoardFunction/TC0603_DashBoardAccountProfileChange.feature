Feature: Dashboard Account Profile succesfully change

  Scenario: As a user, I should be able to successfully change my profile information
            by going to the account tab in the dashboard.

    Given The user goes to home page
    And The user click Login link
    And The user writes username
    And The user writes password
    And The user click submit button in login page
    And The user clicks Acoount link
    And The user changes Paypal email
    And The user clicks save profile button
    And The user verify succesfully saved
    Then The user close window
