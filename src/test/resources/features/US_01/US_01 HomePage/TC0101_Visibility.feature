
Feature: When I enter the home page as a user, the buttons and links should be visible.

  Scenario: About Us, Dashboard, Login, Signup titles,How it Works, Privacy Policy,
            Contact Us Links,Facebook,Instagram, Twitter, LinkedIn,Youtube icons and Antlara Dental
            logo should be visible on the Home Page.

    Given The user goes to home page
    And The user should be verify that About Us, Dashboard, Login, Signup titles and Antlara Dental logo are visible
    And The user should be verify that How it Works, Privacy Policy,Contact Us Links are visible
    Then The user should be verify that Facebook,Instagram, Twitter, LinkedIn,Youtube icons and Antlara Dental logo are visible
    Then The user close window
