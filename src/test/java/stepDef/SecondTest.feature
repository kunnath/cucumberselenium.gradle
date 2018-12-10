Feature: Opening multiple pages

  Scenario Outline:
    Given I am on Home Page of "<url>"
    Then I'm taken to Home Page

    Examples:
      |url|
      |http://google.com/|
      |http://facebook.com/|