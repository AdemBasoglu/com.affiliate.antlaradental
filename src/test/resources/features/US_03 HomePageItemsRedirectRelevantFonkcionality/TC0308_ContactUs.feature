@Smoke
Feature: As a user, when I click on the Contact Us link, I should be directed to the relevant page.

  Scenario: As a user, when I click on the Contact Us link, I should be directed to the relevant page.

    Given The user goes to home page
    And The user click to Contact Us link and goes to directed to the relevant page.
    And The user verifies that the page title is Contact – Antlara Dental Affiliate
    Then The user close window
