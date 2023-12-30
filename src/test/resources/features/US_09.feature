@US_09
Feature: a

  Scenario: Der Benutzer sollte die Merkzettelliste sehen können

    Given user goes the check24 home page
    Then cookies accept
    Then Click to Merkzettel
    Then Merkzettel is displayed
    And close page
