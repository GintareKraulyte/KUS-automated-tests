Feature: ModuliuValdymas;

  Background:
    Given I select "chrome"
    When user clicks login button
    Then user enters login name "user e-mail"
    Then user enters password "user password"
    Then user clicks Next 2 buttons
    Then user clicks NO button in the do you want to stay logged in Modal

  Scenario: Atidaromas Modulio Valdymas
    Given Matomas modulių valdymas
    When Spaudžiama ant Modulių Valdymas
    Then Matomas puslapio pavadinimas
