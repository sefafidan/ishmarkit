@test2
Feature: Test 2
  Background:Before Test
    Given user navigates to dotnetfiddle page

  Scenario: Scenario 1
    Given I click on Save button
    Then verify that the Log in window appeared
