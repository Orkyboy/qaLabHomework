Feature: MainPage feature

  Scenario: Logo redirects to main page
    Given customer is on page with url: http://www.ebay.com/rpp/GBD-DCP-Electronics-Main
    When customer clicks on logo from header
    Then main page is displayed

