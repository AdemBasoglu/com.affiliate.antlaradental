Feature: US02-Check24 Test
Scenario:Der Benutzer sollte die Möglichkeit haben, im SearchBox zu suchen.
  Given Der Benutzer geht zur Website
  And Der Benutzer wartet 2 sekunden
  When Cookies werden angeklickt.
  And Der Benutzer sucht nach "staubsauger-roboter Dreame D10 Plus" im SearchBox
  And Der Benutzer wartet 3 sekunden
  Then Überprüft, ob die Seitenuberschrift "staubsauger-roboter Dreame D10 Plus" enthält
  And Der Benutzer schließt die Webseite









