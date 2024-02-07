@Smoke
Feature: When I enter a valid email as a user, I should be able to go to the signup form page.

  Scenario:As a user When I enter a valid email as a user and click submit button, I should be able to go to the signup form page.

    Given The user goes to home page
    And The user write a valid email
    And The user click submit button
    And The user should be verifying that user sees the Affiliate Sign Up banner.
    Then The user close window
