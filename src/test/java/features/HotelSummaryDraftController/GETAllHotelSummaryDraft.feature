Feature: Get All Active HotelSummaryDraft

#  Should it get summary for all hotels or only active one?

  Scenario Outline: 1) Verify summary of All Active HotelSummaryDraft is fetched
    Given Testing Environment
    When I pass Headers
      | accept | application/json |
    And I set Authorization token
    And I pass queryparameter
      | pageNo   | <pageNo>   |
      | pageSize | <pageSize> |
    And I perform "GET" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON
    And I verify response body contains
      | count            |
      | numberOfPages    |
      | result           |
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
      | total            |
    And I verify number of records in body for jsonpath "<jsonpath>" is "<numberOfRecords>"
    And I fetch a single record using jsonPath "<jsonpath>" and value "<atgHotelId>" from response
    And I verify data from DB "<atgHotelId>"
    
    Examples:
      | status | resourceURL             | pageNo | pageSize | jsonpath          | numberOfRecords |atgHotelId|
      | 200    | GETAllHotelSummaryDraft |        |          | result.atgHotelId | 50              | 1010102         |
#      | 200    | GETAllHotelSummaryDraft | 1      | 15       | result.atgHotelId | 15              |1010102|
