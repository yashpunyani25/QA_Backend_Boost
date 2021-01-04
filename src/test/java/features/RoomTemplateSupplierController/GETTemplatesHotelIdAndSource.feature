Feature: Get All templates for a hotel and source

  Scenario Outline: 1) Verify All templates for a hotel and source are fetched
    Given Testing Environment
    When I pass Headers
      | Content-Type | application/json |
    And I pass pathparameter
      | hotelId | <hotelId> |
      | source  | <source>  |
    And I pass queryparameter
      | pageNo   | <pageNo>   |
      | pageSize | <pageSize> |
    And I perform "GET" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON
    And I verify response body contains
      | count               |
      | numberOfPages       |
      | result              |
      | createdAt           |
      | descriptionAr       |
      | descriptionEn       |
      | roomCapacity        |
      | roomSize            |
      | source              |
      | supplierId          |
      | templateCode        |
      | templateHashCode    |
      | templateNameForCode |
      | templateTitle       |
      | updatedAt           |
      | total               |
    And I verify number of records in body for jsonpath "<jsonpath>" is "<numberOfRecords>"

    Examples:
      | status | resourceURL                  | hotelId | pageNo | pageSize | jsonpath          | numberOfRecords | source  |
      | 200    | GETTemplatesHotelIdAndSource | 1010126 | 1      | 12       | result.supplierId | 12              | EXPEDIA |

  Scenario Outline: 2) Validation Scenarios - <scenario>
    Given Testing Environment
    When I pass Headers
      | Content-Type | application/json |
    And I pass pathparameter
      | hotelId | <hotelId> |
      | source  | <source>  |
    And I pass queryparameter
      | pageNo   | <pageNo>   |
      | pageSize | <pageSize> |
    And I perform "GET" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON
    And I verify response body contains
      | 1002                                                                                  |
      | The parameter 'hotelId' of value '<hotelId>' could not be converted to type 'Integer' |


    Examples:
      | scenario              | status | resourceURL                  | hotelId | source  |
      | Pass invalid hotel id | 200    | GETTemplatesHotelIdAndSource | 101012@ | EXPEDIA |

