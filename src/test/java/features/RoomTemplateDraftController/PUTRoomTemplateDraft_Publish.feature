Feature: Bulk publish RoomTemplateDrafts by ids

  Scenario Outline: Verify hotel score is returned for given atgHotelId
    Given Testing Environment
    When I pass Headers
      | Content-Type | application/json |
    And I set Authorization token
    And I pass body as "<payload>"
      | atgHotelId | 1014795 |
    And I perform "PUT" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON

    Examples:
      | status | resourceURL                  | payload |
      | 200    | putRoomTemplateDraft_Publish |         |