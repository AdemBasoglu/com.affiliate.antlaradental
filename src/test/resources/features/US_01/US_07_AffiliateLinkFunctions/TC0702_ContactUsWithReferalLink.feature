@Smoke
Feature: The user should be able to save on the Contact Us page using an affiliate link

  Scenario: The user should be able to save on the Contact Us page using an affiliate link

    Given The user goes to Contact Us page with a referral link
    And The user writes name
    And The user writes a required email address
    And The user writes a valid phone number
    And The user clicks submit button
    And The user verifies that entered Contact information has been successfully saved
    Then The user close window
