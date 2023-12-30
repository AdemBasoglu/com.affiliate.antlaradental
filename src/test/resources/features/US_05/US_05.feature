@Smoke
Feature:The user clicks on the Nachhaltigkeit button
  Scenario:The user should see Nachhaltige Unternehmensführung title

    Given The user goes to the website
    Then The user should close to cookies pop up
    And The user clicks on the Nachhaltigkeit link
    And The page should have the title  “Nachhaltige Unternehmensführung”.
    And Close app

  Scenario:The user should see Ausgezeichnetes Engagement title

    Given The user goes to the website
    Then The user should close to cookies pop up
    And The user clicks on the Nachhaltigkeit link
    And The page should have the title  “Ausgezeichnetes Engagement”.
    And Close app