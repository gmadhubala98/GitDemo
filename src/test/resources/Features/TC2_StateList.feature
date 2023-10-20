@state
Feature: State Module API automation

  Scenario: Verify user Get stateList through api
    Given User add headers for to stateList
    When User send "GET" request for stateList endpoint
    Then User should verify the status code is 200
    And User should verify the stateList response message matches "Tamil Nadu" and saved stateId.
