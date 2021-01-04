package stepDefinations;

import io.cucumber.java.en.And;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import mySQL.database.hotelSummaryDraft.HotelSummaryDraftDbConnector;
import mySQL.database.hotelSummaryDraft.HotelSummaryDraftModel;
import org.junit.Assert;
import utilities.ReusableMethods;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class HotelSummaryDraftSteps {

    public static HotelSummaryDraftDbConnector hotelSummaryDraftDbConnector;
    public static HotelSummaryDraftModel hotelSummaryDraftModel;
    public DateFormat dateFormat ;
    public Date date;




    @And("^I verify data from DB \"([^\"]*)\"$")
    public void verifyHotelSummaryDraftDatafromDB(String hotelId) throws Throwable {
        hotelSummaryDraftDbConnector = new HotelSummaryDraftDbConnector();
        hotelSummaryDraftModel = hotelSummaryDraftDbConnector.queryHotelSummaryDraftTableByAtgHotelId(hotelId);

        JsonPath jsonPath = ReusableMethods.stringToJson(CommonSteps.singleRecordFromJsonResponse);

        hotelSummaryDraftModel.getAtg_hotel_id();
        Assert.assertEquals(hotelSummaryDraftModel.getAtg_hotel_id(),jsonPath.get("[0].atgHotelId"));
        Assert.assertEquals(hotelSummaryDraftModel.getVersion(),jsonPath.get("[0].version"));
        Assert.assertEquals(hotelSummaryDraftModel.getLive_version(),jsonPath.get("[0].liveVersion"));
        Assert.assertEquals(hotelSummaryDraftModel.getBrand_id(),jsonPath.get("[0].chainBrandId"));
        Assert.assertEquals(hotelSummaryDraftModel.getChain_id(),jsonPath.get("[0].hotelChainId"));
        Assert.assertEquals(hotelSummaryDraftModel.getLocation_id(),jsonPath.get("[0].locationDraftId"));
        Assert.assertEquals(hotelSummaryDraftModel.getProperty_type_id(),jsonPath.get("[0].propertyTypeId"));
        Assert.assertEquals(hotelSummaryDraftModel.getHotel_tag_id(),jsonPath.get("[0].hotelTagId"));
        Assert.assertEquals(hotelSummaryDraftModel.getHotel_name_ar(),jsonPath.get("[0].hotelNameAr"));
        Assert.assertEquals(hotelSummaryDraftModel.getHotel_name_en(),jsonPath.get("[0].hotelNameEn"));
        Assert.assertEquals(hotelSummaryDraftModel.getStar_rating(),jsonPath.get("[0].starRating"));
        Assert.assertEquals(hotelSummaryDraftModel.getThumbnail_url(),jsonPath.get("[0].thumbnailUrl"));
        Assert.assertEquals(hotelSummaryDraftModel.getRank(),jsonPath.get("[0].rank"));
        Assert.assertEquals(hotelSummaryDraftModel.getPhone(),jsonPath.get("[0].phone"));
        Assert.assertEquals(hotelSummaryDraftModel.getFax(),jsonPath.get("[0].fax"));
        Assert.assertEquals(hotelSummaryDraftModel.getEmail(),jsonPath.get("[0].email"));
        Assert.assertEquals(hotelSummaryDraftModel.getWebsite(),jsonPath.get("[0].website"));
        Assert.assertEquals(hotelSummaryDraftModel.getFloors(),jsonPath.get("[0].floors"));
        Assert.assertEquals(hotelSummaryDraftModel.getRooms(),jsonPath.get("[0].rooms"));
        Assert.assertEquals(hotelSummaryDraftModel.getCheckin_begin_time(),jsonPath.get("[0].checkinBeginTime"));
        Assert.assertEquals(hotelSummaryDraftModel.getCheckin_begin_time(),jsonPath.get("[0].checkinBeginTime"));
        Assert.assertEquals(hotelSummaryDraftModel.getCheckin_end_time(),jsonPath.get("[0].checkinEndTime"));
        Assert.assertEquals(hotelSummaryDraftModel.getCheckout_time(),jsonPath.get("[0].checkoutTime"));
        Assert.assertEquals(hotelSummaryDraftModel.getCheckout_time(),jsonPath.get("[0].checkoutTime"));
        Assert.assertEquals(hotelSummaryDraftModel.getUsername(),jsonPath.get("[0].username"));

        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        date = dateFormat.parse(hotelSummaryDraftModel.getCreated_at());
        Assert.assertEquals(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(date),jsonPath.get("[0].createdAt"));
        date = dateFormat.parse(hotelSummaryDraftModel.getUpdated_at());
        Assert.assertEquals(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(date),jsonPath.get("[0].updatedAt"));
        date = dateFormat.parse(hotelSummaryDraftModel.getPublished_at());
        Assert.assertEquals(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(date),jsonPath.get("[0].publishedAt"));

        Assert.assertEquals(hotelSummaryDraftModel.getIs_active(),jsonPath.get("[0].isActive"));
        Assert.assertEquals(hotelSummaryDraftModel.getUnknown(),jsonPath.get("[0].unknown"));

        hotelSummaryDraftModel = hotelSummaryDraftDbConnector.queryHotelSummaryDraftTableForCount();
        int total = hotelSummaryDraftModel.getTotal();
        Assert.assertEquals("Records Mismatch in DB and Response",total,CommonSteps.res.getBody().jsonPath().getInt("total"));
    }
}
