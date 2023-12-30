@Smoke
Feature:The user should be not register

  Scenario:The user should be not register correct email but longer password

    Given The user goes to the website
    Then The user should close to cookies pop up
    When The user waits on the Mein Konto button and clicks on the Starten Sie hier button
    When The user sees the text CHECK24 Kundenkonto anlegen,user enters her or his valid e-mail address in the input field
    Then The user clicks weiter button
    And The user enters a name in the Vorname field
    And The user enters a last name in the Nachname  field
    And The user enters a password in the Passwort field that longer than 50 number.
    Then The should be sees the text on the page Achtung! Die Grenze von 50 Zeichen wurde erreicht!