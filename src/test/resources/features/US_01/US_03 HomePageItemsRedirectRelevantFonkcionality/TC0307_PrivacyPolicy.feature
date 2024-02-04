Feature: As a user, when I click on the Privacy Policy link, I should be directed to the relevant page.

  Scenario: As a user, when I click on the Privacy Policy link, I should be directed to the relevant page.

    Given The user goes to home page
    And The user click to Privacy Policy link and goes to directed to the relevant page.
    And The user verifies that the page title is Privacy Policy – Antlara Dental Affiliate
    Then The user close window
