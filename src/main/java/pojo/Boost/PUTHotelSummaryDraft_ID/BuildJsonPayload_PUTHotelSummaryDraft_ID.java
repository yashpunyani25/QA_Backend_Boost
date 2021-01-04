package pojo.Boost.PUTHotelSummaryDraft_ID;

import java.util.Iterator;
import java.util.Map;

public class BuildJsonPayload_PUTHotelSummaryDraft_ID {

    public static PUTHotelSummaryDraftIDParent putHotelSummaryDraftID(Map<String, String> payloadData) {

        PUTHotelSummaryDraftIDParent p = new PUTHotelSummaryDraftIDParent();

        if (payloadData.get("chainBrandId") != null) p.setChainBrandId(Integer.valueOf(payloadData.get("chainBrandId")));
        if (payloadData.get("checkinBeginTime") != null) p.setCheckinBeginTime(payloadData.get("checkinBeginTime"));
        if (payloadData.get("checkinEndTime") != null) p.setCheckinEndTime(payloadData.get("checkinEndTime"));
        if (payloadData.get("checkoutTime") != null) p.setCheckoutTime(payloadData.get("checkoutTime"));
        if (payloadData.get("email") != null) p.setEmail(payloadData.get("email"));
        if (payloadData.get("fax") != null) p.setFax(payloadData.get("fax"));
        if (payloadData.get("floors") != null) p.setFloors(Integer.valueOf(payloadData.get("floors")));
        if (payloadData.get("hotelChainId") != null) p.setHotelChainId(Integer.valueOf(payloadData.get("hotelChainId")));
        if (payloadData.get("hotelNameAr") != null) p.setHotelNameAr(payloadData.get("hotelNameAr"));
        if (payloadData.get("hotelNameEn") != null) p.setHotelNameEn(payloadData.get("hotelNameEn"));
        if (payloadData.get("hotelTagId") != null) p.setHotelTagId(Integer.valueOf(payloadData.get("hotelTagId")));
        if (payloadData.get("isActive") != null) p.setIsActive(Boolean.valueOf(payloadData.get("isActive")));
        if (payloadData.get("phone") != null) p.setPhone(payloadData.get("phone"));
        if (payloadData.get("propertyTypeId") != null) p.setPropertyTypeId(Integer.valueOf(payloadData.get("propertyTypeId")));
        if (payloadData.get("rank") != null) p.setRank(Integer.valueOf(payloadData.get("rank")));
        if (payloadData.get("rooms") != null) p.setRooms(Integer.valueOf(payloadData.get("rooms")));
        if (payloadData.get("starRating") != null) p.setStarRating(Integer.valueOf(payloadData.get("starRating")));
        if (payloadData.get("thumbnailUrl") != null) p.setThumbnailUrl(payloadData.get("thumbnailUrl"));
        if (payloadData.get("unknown") != null) p.setUnknown(Boolean.valueOf(payloadData.get("unknown")));
        if (payloadData.get("username") != null) p.setUsername(payloadData.get("username"));
        if (payloadData.get("website") != null) p.setWebsite(payloadData.get("website"));
        return p;
    }
}
