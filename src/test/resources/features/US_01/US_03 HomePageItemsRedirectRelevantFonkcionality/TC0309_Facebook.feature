Feature: As a user, when I click on the Facebook icon, I should be directed to the relevant page.

  Scenario: As a user, when I click on the Facebook icon, I should be directed to the relevant page.

    Given The user goes to home page
    And The user click to Facebook icon and goes to directed to the relevant page.
    And The user verifies that the page title contains Facebook
    Then The user close window
