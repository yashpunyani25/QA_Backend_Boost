Feature: Get all Score for agents

  Scenario Outline: Verify hotel score is returned for given atgHotelId
    Given Testing Environment
    When I pass Headers
      | Content-Type | application/json |
    And I set Authorization token
    And I pass pathparameter
      | atgHotelId | 1014795 |
    And I perform "GET" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON

    Examples:
      | status | resourceURL   |
      | 200    | getHotelScore |