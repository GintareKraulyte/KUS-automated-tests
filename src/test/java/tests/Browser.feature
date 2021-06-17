Feature: Browser

  #@Ready
  Scenario Outline: Test different browser
    Given I select "<Browser>"
    Examples:
      |Browser       |
      |Chrome        |
      |Firefox       |
      |Edge          |