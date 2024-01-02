@US_10

Feature: Wenn der Nutzer auf den Nachhaltigkeits-Button klickt, soll er die Überschrift "CHECK24 hilft Kindern" sehen und sich weiter informieren können

  Scenario:
    Given Given user goes the check24 home page
    Then Der Nutzer klickt auf die Schaltfläche "Nachhaltigkeit" oben rechts auf der Homepage
    Then Der Nutzer scrollt zur Mitte der Seite und überprüft, ob der Text " CHECK24 hilft Kindern" sichtbar ist
    And Klickt dann auf den Button "mehr erfahren"
    And close  page

