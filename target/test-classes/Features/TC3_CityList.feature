@city
Feature: City Module API automation

  Scenario: Verify user Get city List through  api
    Given User need header for to get citylist
    When User add request body state id for get city list
    And User send "POST" request for citylist endpoint
    Then User should verify the status code is 200
    And User  verify the citylist response message matches "AdiKaratti" and saved cityId.
