Feature: ModuliuApklausos;

  Background:
    Given I select "chrome"
    When user clicks login button
    Then user enters login name "gintare.kraulyte@stud.kitm.lt"
    Then user enters password "Testuotoja1"
    Then user clicks Next 2 buttons
    Then user clicks NO button in the do you want to stay logged in Modal

    Scenario: Išsiunčiama modulio apklausos anketa
      Given paspaudžiama ant modulio apklausa
      When paspaudžiama ant pasirinkto modulio
      Then spaudžiama Užpildyti
      #Then supildoma anketa
      Then spaudžiama submit
      #Then anketa išsiųsta

  Scenario: Rodomas informacinis langelis
    Given paspaudžiama ant modulio apklausa
    When paspaudžiama ant pasirinkto modulio
    Then spaudžiama Užpildyti
    Then supildoma dalinai anketa
    Then spaudžiama submit
    #Then matoma informacinė žinutė
