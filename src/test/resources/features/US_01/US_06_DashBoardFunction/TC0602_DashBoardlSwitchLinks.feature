Feature: Dashboard functions succesfully work

  Scenario: Dashboard links, tabs, buttons should be visiable and clickable

    Given The user goes to home page
    And The user click Login link
    And The user writes username
    And The user writes password
    And The user click submit button in login page
    And The user switch succesfully LinksBanner link
    And The user verify Text Tag,Banners Tag and Banners image are visible and clickable
    And The user switch succesfully Acoount link
    And The user switch succesfully Payments link
    And The user switch succesfully Logout link
    Then The user close window
