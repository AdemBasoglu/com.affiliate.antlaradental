@Smoke
Feature:The user should be not register

  Scenario:The user should be not register with existed email

    Given The user goes to the website
    Then The user should close to cookies pop up
    When The user waits on the Mein Konto button and clicks on the Starten Sie hier button
    When The user sees the text CHECK24 Kundenkonto anlegen,user enters her or his invalid e-mail address in the input field
    Then The should be enabled the anmelden button on the page.
