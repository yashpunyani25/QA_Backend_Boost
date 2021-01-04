Feature: Room template supplier details by source and supplier id


  Scenario Outline: 1) Verify details of room template supplier details are fetched by source and supplier id
    Given Testing Environment
    When I pass Headers
      | Content-Type | application/json |
    And I pass pathparameter
      | hotelId    | <hotelId>    |
      | source     | <source>     |
      | supplierId | <supplierId> |
    And I perform "GET" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON
    And I verify response body contains
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

    Examples:
      | status | resourceURL                             | hotelId | source  | supplierId |
      | 200    | GETSupplierDetailsBySupplierAndSourceId | 1010126 | EXPEDIA | 200247102  |

  Scenario Outline: 2) Validation Scenarios - <scenario>
    Given Testing Environment
    When I pass Headers
      | Content-Type | application/json |
    And I pass pathparameter
      | hotelId    | <hotelId>    |
      | source     | <source>     |
      | supplierId | <supplierId> |
    And I perform "GET" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON
    And I verify response body contains
      | 1003                             |
      | RoomTemplateSupplier not exists. |

    Examples:
      | scenario                                          | status | resourceURL                             | hotelId | source  | supplierId |
      | Pass invalid hotel id and supplier id combination | 200    | GETSupplierDetailsBySupplierAndSourceId | 1010126 | EXPEDIA | 232848492  |