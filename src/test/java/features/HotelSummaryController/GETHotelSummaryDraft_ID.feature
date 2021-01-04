Feature: Get HotelSummaryDraft details for the given HotelSummaryDraft code

  Scenario Outline: 1) Verify details of given hotel id is fetched
    Given Testing Environment
    When I pass Headers
      | accept | application/json |
    And I set Authorization token
    And I pass pathparameter
      | id | <id> |
    And I perform "GET" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON
    And I verify response body contains
      | atgHotelId       |
      | chainBrandId     |
      | checkinBeginTime |
      | checkinEndTime   |
      | checkoutTime     |
      | createdAt        |
      | email            |
      | fax              |
      | floors           |
      | hotelChainId     |
      | hotelNameAr      |
      | hotelNameEn      |
      | hotelTagId       |
      | isActive         |
      | liveVersion      |
      | locationDraftId  |
      | phone            |
      | propertyTypeId   |
      | publishedAt      |
      | rank             |
      | rooms            |
      | starRating       |
      | thumbnailUrl     |
      | unknown          |
      | updatedAt        |
      | username         |
      | version          |
      | website          |

    Examples:
      | status | resourceURL             | id      | jsonpath          | numberOfRecords |
      | 200    | GETHotelSummaryDraft_ID | 1010102 | result.supplierId | 12              |
