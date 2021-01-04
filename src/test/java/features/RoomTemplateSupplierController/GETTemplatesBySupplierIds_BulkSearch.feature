Feature: Get All templates for a supplier by specific supplier IDs

  Scenario Outline: 1) Verify All templates for a supplier by specific supplier IDs fetched (bulk search)
    Given Testing Environment
    When I pass Headers
      | Content-Type | application/json |
    And I pass pathparameter
      | hotelId     | <hotelId>     |
      | source      | <source>      |
      | supplierIds | <supplierIds> |
    And I perform "GET" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON
    And I verify response body contains
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
      | count               |
      | total               |
      | numberOfPages       |

    Examples:
      | status | resourceURL                          | hotelId | source  | supplierIds                                                          |
      | 200    | GETTemplatesBySupplierIds_BulkSearch | 1031961 | EXPEDIA | 918594,232848490,232848491,918625,918632,918640,918647,918655,918663 |


