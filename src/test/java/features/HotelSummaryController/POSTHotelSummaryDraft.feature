Feature: POSTHotelSummaryDraft

#  whenever i post any new hotel, why does isActive is saved as false even if i am sending true

#  ATG id should be unique every time
  Scenario Outline: 1) Verify details of given hotel id is updated
    Given Testing Environment
    When I pass Headers
      | accept | application/json |
    And I set Authorization token
    And I pass body "<resourceURL>"
      | atgHotelId       | <atgHotelId>       |
      | chainBrandId     | <chainBrandId>     |
      | checkinBeginTime | <checkinBeginTime> |
      | checkinEndTime   | <checkinEndTime>   |
      | checkoutTime     | <checkoutTime>     |
      | countryCode      | <countryCode>      |
      | email            | <email>            |
      | fax              | <fax>              |
      | floors           | <floors>           |
      | hotelChainId     | <hotelChainId>     |
      | hotelNameAr      | <hotelNameAr>      |
      | hotelNameEn      | <hotelNameEn>      |
      | isActive         | <isActive>         |
      | latitude         | <latitude>         |
      | longitude        | <longitude>        |
      | phone            | <phone>            |
      | propertyTypeId   | <propertyTypeId>   |
      | rank             | <rank>             |
      | rooms            | <rooms>            |
      | starRating       | <starRating>       |
      | thumbnailUrl     | <thumbnailUrl>     |
      | tvHotelId        | <tvHotelId>        |
      | username         | <username>         |
      | website          | <website>          |
    And I perform "POST" operation "<resourceURL>"
    Then I should get http status "<status>" in response
    And I verify response content type is JSON
#    And I validate below jsonpaths and values in response
    @temp
    Examples:
      | status | resourceURL           | atgHotelId | chainBrandId | checkinBeginTime | checkinEndTime | checkoutTime | countryCode | email          | fax            | floors | hotelChainId | hotelNameAr          | hotelNameEn            | isActive | latitude  | longitude   | phone          | propertyTypeId | rank | rooms | starRating | thumbnailUrl                                                                                            | tvHotelId | username | website              |
      | 200    | POSTHotelSummaryDraft |            | 49           | 15:00            | 18:00          | 12:00        | AE          | test@gmail.com | 1-360-895-8088 | 10     | 71           | كومفرت إن أون ذا باي | Comfort Inn On the Bay | true     | 47.542831 | -122.629782 | 1-360-895-2666 | 18             | 5    | 50    | 0          | https://hotelcmsimages.s3-eu-west-1.amazonaws.com/hotel/hotels/1000000/50000/43300/43284/ff2ae107_z.jpg | 18        | system   | www.boostTesting.com |
      | 200    | POSTHotelSummaryDraft |            | 49           | 15:00            | 18:00          | 12:00        | AE          | test@gmail.com | 1-360-895-8088 | 10     | 71           | كومفرت إن أون ذا باي | Comfort Inn On the Bay | true     | 47.542831 | -122.629782 | 1-360-895-2666 | 18             | 5    | 50    | 0          | https://hotelcmsimages.s3-eu-west-1.amazonaws.com/hotel/hotels/1000000/50000/43300/43284/ff2ae107_z.jpg | 18        | system   | www.boostTesting.com |

