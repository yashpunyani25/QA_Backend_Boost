package mySQL.database.hotelSummaryDraft;



import mySQL.dbConnector;
import utilities.ReusableMethods;

import java.sql.SQLException;

public class HotelSummaryDraftDbConnector extends dbConnector {
//    private static ConfigProperties config = new ConfigProperties();


    private static String collection_name = "hotel_summary_draft";

    public HotelSummaryDraftDbConnector() {
        super(ReusableMethods.getDBConfigForBoost("boost"));
    }

    // Querying hotel_summary_draft table
    public HotelSummaryDraftModel queryHotelSummaryDraftTableByAtgHotelId(String atg_hotel_id) throws SQLException {
        String sql = "SELECT * FROM " + collection_name + " where atg_hotel_id=?";
        System.out.println("Querying collection : " + collection_name + " with atg_hotel_id = " + atg_hotel_id);
        return query(sql, HotelSummaryDraftModel.class, atg_hotel_id);
    }
    public HotelSummaryDraftModel queryHotelSummaryDraftTableForCount() throws SQLException {
        String sql = "SELECT count(*) total FROM " + collection_name;
        System.out.println("Querying collection : " + collection_name + " to get count of number of records");
        return query(sql, HotelSummaryDraftModel.class);
    }
}
