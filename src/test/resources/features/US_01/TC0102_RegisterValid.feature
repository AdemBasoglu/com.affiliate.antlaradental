@Smoke
Feature:The user should be not register

  Scenario:The user should be not register correct email and different password

    Given The user goes to the website
    Then The user should close to cookies pop up
    When The user waits on the Mein Konto button and clicks on the Starten Sie hier button
    When The user sees the text CHECK24 Kundenkonto anlegen,user enters her or his valid e-mail address in the input field
    Then The user clicks weiter button
    And The user enters a name in the Vorname field
    And The user enters a last name in the Nachname  field
    And The user enters a password in the Passwort field that consists of a minimum of 8 and a maximum of 50 characters.
    And The user enters the same password again in the Passwort wiederholen field.
    And The user clicks on the weiter button
    Then The should be sees the text on the page Überprüfen Ihrer Identität