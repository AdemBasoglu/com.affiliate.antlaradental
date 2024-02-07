@Smoke
Feature: Dashboard counter functions succesfully work

  Scenario:  Dashboard counter functions succesfully work

    Given The user goes to home page
    And The user click Login link
    And The user writes username
    And The user writes password
    And The user click submit button in login page
    And The user verify clicks counter bigger then zero
    And The user verify clicks conversions bigger then zero
    And The user verify revenue counter bigger then zero
    And The user verify commissions counter bigger then zero
    And The user verify avg earns per click counter bigger then zero
    Then The user close window
