@suite @google @device_Mac @author_RiazAhmed
Feature: Google Homepage Functional Tests

  Background:
    Given I am on the Google homepage

  Scenario: Verify Google search functionality
    When I search for "Selenium WebDriver"
    Then I should see results related to "Selenium WebDriver"
