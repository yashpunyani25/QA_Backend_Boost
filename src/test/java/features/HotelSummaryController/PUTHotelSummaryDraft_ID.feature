Feature: PUTHotelSummaryDraft_ID - Update HotelSummaryDraft with the provided details

  Scenario Outline: 1) Verify details of given hotel id is updated
    Given Testing Environment
    When I pass Headers
      | accept | application/json |
    And I set Authorization token
    And I pass pathparameter
      | id | <id> |
    And I pass body as "<resourceURL>"
      | chainBrandId     | <chainBrandId>     |
      | checkinBeginTime | <checkinBeginTime> |
      | checkinEndTime   | <checkinEndTime>   |
      | checkoutTime     | <checkoutTime>     |
      | email            | <email>            |
      | fax              | <fax>              |
      | floors           | <floors>           |
      | hotelChainId     | <hotelChainId>     |
      | hotelNameAr      | <hotelNameAr>      |
      | hotelNameEn      | <hotelNameEn>      |
      | hotelTagId       | <hotelTagId>       |
      | isActive         | <isActive>         |
      | phone            | <phone>            |
      | propertyTypeId   | <propertyTypeId>   |
      | rank             | <rank>             |
      | rooms            | <rooms>            |
      | starRating       | <starRating>       |
      | thumbnailUrl     | <thumbnailUrl>     |
      | unknown          | <unknown>          |
      | username         | <username>         |
      | website          | <website>          |
    And I perform "PUT" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON
    And I validate below jsonpaths and values in response
      | chainBrandId     | <chainBrandId>     |
      | checkinBeginTime | <checkinBeginTime> |
      | checkinEndTime   |                    |
      | checkoutTime     |                    |
      | email            |                    |
      | fax              |                    |
      | floors           |                    |
      | hotelChainId     |                    |
      | hotelNameAr      |                    |
      | hotelNameEn      |                    |
      | hotelTagId       |                    |
      | isActive         |                    |
      | phone            |                    |
      | propertyTypeId   |                    |
      | rank             |                    |
      | rooms            |                    |
      | starRating       |                    |
      | thumbnailUrl     |                    |
      | unknown          |                    |
      | username         |                    |
      | website          |                    |

    Examples:
      | status | resourceURL             | id      | chainBrandId | checkinBeginTime | checkinEndTime | checkoutTime | email          | fax    | floors | hotelChainId | hotelNameAr     | hotelNameEn     | hotelTagId | isActive | phone  | propertyTypeId | rank | rooms | starRating | thumbnailUrl | unknown | username | website |
      | 200    | PUTHotelSummaryDraft_ID | 1010102 |              | NA               | NA             | NA           | test@gmail.com | 123456 | NA     | NA           | testhotelNameAr | testhotelNameEn | NA         | true     | 123456 | 28             | 0    | 0     | 0          | NA           | false   |          |         |

  Scenario Outline: 1) Verify details of given hotel id is updated
    Given Testing Environment
    When I pass Headers
      | accept | application/json |
    And I set Authorization token
    And I pass pathparameter
      | id | <id> |
    And I pass body "<resourceURL>"
      | chainBrandId     | <chainBrandId>     |
      | checkinBeginTime | <checkinBeginTime> |
      | checkinEndTime   | <checkinEndTime>   |
      | checkoutTime     | <checkoutTime>     |
      | email            | <email>            |
      | fax              | <fax>              |
      | floors           | <floors>           |
      | hotelChainId     | <hotelChainId>     |
      | hotelNameAr      | <hotelNameAr>      |
      | hotelNameEn      | <hotelNameEn>      |
      | hotelTagId       | <hotelTagId>       |
      | isActive         | <isActive>         |
      | phone            | <phone>            |
      | propertyTypeId   | <propertyTypeId>   |
      | rank             | <rank>             |
      | rooms            | <rooms>            |
      | starRating       | <starRating>       |
      | thumbnailUrl     | <thumbnailUrl>     |
      | unknown          | <unknown>          |
      | username         | <username>         |
      | website          | <website>          |
    And I perform "PUT" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON
    And I validate below jsonpaths and values in response
      | chainBrandId     | <chainBrandId>     |
      | checkinBeginTime | <checkinBeginTime> |
      | checkinEndTime   | <checkinEndTime>   |
      | checkoutTime     | <checkoutTime>     |
      | email            | <email>            |
      | fax              | <fax>              |
      | floors           | <floors>           |
      | hotelChainId     | <hotelChainId>     |
      | hotelNameAr      | <hotelNameAr>      |
      | hotelNameEn      | <hotelNameEn>      |
      | hotelTagId       | <hotelTagId>       |
      | isActive         | <isActive>         |
      | phone            | <phone>            |
      | propertyTypeId   | <propertyTypeId>   |
      | rank             | <rank>             |
      | rooms            | <rooms>            |
      | starRating       | <starRating>       |
      | thumbnailUrl     | <thumbnailUrl>     |
      | unknown          | <unknown>          |
      | username         | <username>         |
      | website          | <website>          |

    Examples:
      | status | resourceURL             | id      | chainBrandId | checkinBeginTime | checkinEndTime | checkoutTime | email          | fax    | floors | hotelChainId | hotelNameAr     | hotelNameEn     | hotelTagId | isActive | phone  | propertyTypeId | rank | rooms | starRating | thumbnailUrl | unknown | username | website  |
      | 200    | PUTHotelSummaryDraft_ID | 1010102 |              |                  |                |              | test@gmail.com | 123456 |        |              | testhotelNameAr | testhotelNameEn |            | true     | 123456 | 28             | 0    | 0     | 0          |              | false   | system   | test.com |


