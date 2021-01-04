package pojo.Boost.POSTHotelSummaryDraft;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import org.json.JSONArray;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BuildJsonPayload_POSTHotelSummaryDraft {

    public static List<POSTHotelSummaryDraftParent> postHotelSummaryDraft(Map<String, String> payloadData) {


        POSTHotelSummaryDraftParent p = new POSTHotelSummaryDraftParent();

        p.setAtgHotelId(Integer.valueOf(ReusableMethods.generateRandomNumber()));
        if (payloadData.get("chainBrandId") != null) p.setChainBrandId(Integer.valueOf(payloadData.get("chainBrandId")));
        if (payloadData.get("checkinBeginTime") != null) p.setCheckinBeginTime(payloadData.get("checkinBeginTime"));
        if (payloadData.get("checkinEndTime") != null) p.setCheckinEndTime(payloadData.get("checkinEndTime"));
        if (payloadData.get("checkinBeginTime") != null) p.setCheckinBeginTime(payloadData.get("checkinBeginTime"));
        if (payloadData.get("checkoutTime") != null) p.setCheckoutTime(payloadData.get("checkoutTime"));
        if (payloadData.get("countryCode") != null) p.setCountryCode(payloadData.get("countryCode"));
        if (payloadData.get("email") != null) p.setEmail(payloadData.get("email"));
        if (payloadData.get("fax") != null) p.setFax(payloadData.get("fax"));
        if (payloadData.get("floors") != null) p.setFloors(Integer.valueOf(payloadData.get("floors")));
        if (payloadData.get("hotelChainId") != null) p.setHotelChainId(Integer.valueOf(payloadData.get("hotelChainId")));
        if (payloadData.get("hotelNameAr") != null) p.setHotelNameAr(payloadData.get("hotelNameAr"));
        if (payloadData.get("hotelNameEn") != null) p.setHotelNameEn(payloadData.get("hotelNameEn"));
        if (payloadData.get("isActive") != null) p.setIsActive(Boolean.valueOf(payloadData.get("isActive")));
        if (payloadData.get("latitude") != null) p.setLatitude(Double.valueOf(payloadData.get("latitude")));
        if (payloadData.get("longitude") != null) p.setLongitude(Double.valueOf(payloadData.get("longitude")));
        if (payloadData.get("phone") != null) p.setPhone(payloadData.get("phone"));
        if (payloadData.get("propertyTypeId") != null) p.setPropertyTypeId(Integer.valueOf(payloadData.get("propertyTypeId")));
        if (payloadData.get("rank") != null) p.setRank(Integer.valueOf(payloadData.get("rank")));
        if (payloadData.get("rooms") != null) p.setRooms(Integer.valueOf(payloadData.get("rooms")));
        if (payloadData.get("starRating") != null) p.setStarRating(Integer.valueOf(payloadData.get("starRating")));
        if (payloadData.get("thumbnailUrl") != null) p.setThumbnailUrl(payloadData.get("thumbnailUrl"));
        if (payloadData.get("tvHotelId") != null) p.setTvHotelId(Integer.valueOf(payloadData.get("tvHotelId")));
        if (payloadData.get("username") != null) p.setUsername(payloadData.get("username"));
        if (payloadData.get("website") != null) p.setWebsite(payloadData.get("website"));

List<POSTHotelSummaryDraftParent> temp = new ArrayList<>();
temp.add(p);
        return temp;
    }

//    public static List<POSTHotelSummaryDraftParent> postHotelSummaryDraftList(List<Map<String, String>> payloadData) {
//        List<POSTHotelSummaryDraftParent> p = new ArrayList<>();
//        payloadData.stream().forEach(payLoad->{
//            p.add(postHotelSummaryDraft(payLoad));
//        });
//        return p;
//    }
}

