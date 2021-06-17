Feature: Login

  Scenario: Test login with correct admin credentials
    Given I select "chrome"
    When user clicks login button
    Then user enters login name "gintare.kraulyte@stud.kitm.lt"
    Then user enters password "Testuotoja1"
    Then user clicks Next 2 buttons
    Then user clicks NO button in the do you want to stay logged in Modal
    #Then settings is shown
