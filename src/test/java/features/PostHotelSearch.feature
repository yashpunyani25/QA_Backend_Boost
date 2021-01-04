@Scenario2
Feature: PostHotelSearch

  Scenario Outline: 1) Verify Hotel search request is posted and associated details are fetched
    Given Testing Environment
    When I pass Headers
      | Content-Type | application/json |
    And I pass body "<resourceURL>"
      | checkin     | <checkin>     |
      | checkout    | <checkout>    |
      | destination | <destination> |
      | type1       | ADT           |
      | age1        |               |
      | type2       | ADT           |
      | age2        |               |
      | type3       | CHD           |
      | age3        |             3 |
      | type4       | ADT           |
      | age4        |               |
      | type5       | ADT           |
      | age5        |               |
      | placeId     | <placeId>     |
    And I perform "POST" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON
    And I verify response body contains
      | type               |
      | query              |
      | queryParameters    |
      | queryParametersObj |
      | sortBy             |
      | isGeo              |
      | hId                |
      | isCountry          |
      | placeId            |
      | types              |
      | isCountry          |
    And I validate below jsonpaths and values in response
      | type                         | hotel                       |
      | queryParametersObj.sortBy    | distanceScore               |
      | queryParametersObj.isGeo     |                           1 |
      | queryParametersObj.isCountry | false                       |
      | queryParametersObj.placeId   | ChIJD7fiBh9u5kcRYJSMaMOCCwQ |
      | isCountry                    | false                       |
@temp2
    Examples: 
      | status | resourceURL     | checkin    | checkout   | destination | placeId                     |
      |    200 | POSTHotelSearch | 26-10-2020 | 30-10-2020 | paris       | ChIJD7fiBh9u5kcRYJSMaMOCCwQ |

  Scenario Outline: 2) Validation Scenarios - PostHotelSearch : <scenario>
    Given Testing Environment
    When I pass Headers
      | Content-Type | application/json |
    And I pass body "<resourceURL>"
      | checkin     | <checkin>     |
      | checkout    | <checkout>    |
      | destination | <destination> |
      | type1       | ADT           |
      | age1        |               |
      | type2       | ADT           |
      | age2        |               |
      | type3       | CHD           |
      | age3        |             3 |
      | type4       | ADT           |
      | age4        |               |
      | type5       | ADT           |
      | age5        |               |
      | placeId     | <placeId>     |
    And I perform "POST" operation "POSTHotelSearch"
    Then I should get http status "<status>" in response
    And I verify response body contains
      | <errorTitle>  |
      | <errorDetail> |

    Examples: 
      | scenario                                | status | checkin    | checkout   | destination | placeId                     | errorTitle               | errorDetail                                            |
      | Pass checkin date greater than checkout |    400 | 01-10-2020 | 30-09-2020 | paris       | ChIJD7fiBh9u5kcRYJSMaMOCCwQ | [Gateway:``] Bad Request | The dates.checkout must be a date after dates.checkin. |
      | Pass invalid checkin date format        |    400 | 1-10-20    | 30-09-2020 | paris       | ChIJD7fiBh9u5kcRYJSMaMOCCwQ | [Gateway:``] Bad Request | The dates.checkin does not match the format d-m-Y.     |
      | Pass invalid checkout date format       |    400 | 01-10-2020 | 3-09-2020  | paris       | ChIJD7fiBh9u5kcRYJSMaMOCCwQ | [Gateway:``] Bad Request | The dates.checkout does not match the format d-m-Y.    |
      | Pass without destination                |    400 | 10-10-2020 | 30-10-2020 |             | ChIJD7fiBh9u5kcRYJSMaMOCCwQ | [Gateway:``] Bad Request | The destination field is required.                     |
