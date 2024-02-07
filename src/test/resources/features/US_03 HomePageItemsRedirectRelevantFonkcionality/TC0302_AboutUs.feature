@Smoke
Feature: As a user, when I click on the AboutUs link, I should be directed to the relevant page.

  Scenario: As a user, when I click on the AboutUs link, I should be directed to the relevant page.

    Given The user goes to home page
    And The user click to AboutUs link and goes to directed to the relevant page.
    And The user verifies that the page title is  About Healthy Teeth,Dental care in Turkey|Antlara Dental Antalya
    Then The user close window
