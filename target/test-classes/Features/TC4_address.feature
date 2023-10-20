Feature: Address Module API automation

  @Address
  Scenario Outline: verify add user address to the application through api
    Given User add header and bearer authorization for accessing address endpoint
    When User add request body for add new address "<firstname>","<lastname>","<moboil>","<apartment>","<state>","<city>","<country>","<zipcode>","<address>","<address_type>"
    And User send "POST" request for adduser address endpoint
    Then User should verify the status code is 200
    And User should verify the add user address response message matches "Address added Sucessfully"

    Examples: 
      | firstname | lastname | moboil     | apartment | state | city | country | zipcode | address | address_type |
      | madhubala | G        | 8297006560 | prince    |   123 |   11 |     101 |  600091 | chennai | home         |

  Scenario Outline: verify update user address to the application through api
    Given User add header and bearer authorization for accessing address endpoint
    When User add request body for update user address "<>","<firstname>","<lastname>","<moboil>","<apartment>","<state>","<city>","<country>","<zipcode>","<address>","<address_type>"with address id
    And User send "PUT" request for updateuser address endpoint
    Then User should verify the status code is 200
    And User should verify the add user address response message matches "Address updated Sucessfully"

    Examples: 
      | firstname | lastname | moboil     | apartment | state | city | country | zipcode | address | address_type |
      | madhubala | G        | 8297006560 | prince    |   123 |   11 |     101 |  600091 | chennai | home         |

  Scenario: Verify get user address to the application through api
    Given User add header and bearer authorization for accessing address endpoints
    When User send "GET" request for getUserAddress endpoint
    Then User should verify the status code is 200
    And User should verify the getUserAddress response message matches "Chennai" and saved city name

  Scenario: Verify delete user address to the application through api
    Given User add header and bearer authorization for accessing address endpoints
    When User add request body for delete the address with address id
    And User send "DELETE" request for deleteUserAddress endpoint
    Then User should verify the status code is 200
    And User should verify the deleteUserAddress response message matches "Address deleted successfully"
