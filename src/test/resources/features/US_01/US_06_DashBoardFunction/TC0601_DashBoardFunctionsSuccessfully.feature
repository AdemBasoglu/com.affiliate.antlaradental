Feature: Dashboard functions succesfully work

  Scenario: Dashboard links, tabs, buttons should be visiable and clickable

    Given The user goes to home page
    And The user click Login link
    And The user writes username
    And The user writes password
    And The user click submit button in login page
    And The user verify title Affiliate Dashboard – Antlara Dental Affiliate
    And The user verify Home, LinksBanner, Acoount,Payments,Logout links are visiable and clickable
    And The user verify My Affiliate Link,My Affiliate Copy Link,Current Balance,Estimated Next Payout are visiable
    And The user verifyClicks,Conversions,Revenue,Commission Rate,Commissions,Voids,Avg. Earns Per Click are visiable
    Then The user close window
