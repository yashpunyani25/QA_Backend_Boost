package mySQL.database.hotelSummaryDraft;

import java.sql.Time;

public class HotelSummaryDraftModel {

    private Integer atg_hotel_id;
    private Integer location_id;
    private String chain_id;
    private String brand_id;
    private Integer property_type_id;
    private Integer hotel_tag_id;
    private String hotel_name_ar;
    private String hotel_name_en;
    private Integer star_rating;
    private String thumbnail_url;
    private Integer rank;
    private String phone;
    private String fax;
    private String email;
    private String website;
    private Integer floors;
    private Integer rooms;
    private String version;
    private Boolean unknown;
    private String live_version;
    private String created_at;
    private String updated_at;
    private String published_at;
    private Boolean is_active;
    private Time checkout_time;
    private Time checkin_end_time;
    private Time checkin_begin_time;
    private String username;
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Integer getAtg_hotel_id() {
        return atg_hotel_id;
    }

    public void setAtg_hotel_id(Integer atg_hotel_id) {
        this.atg_hotel_id = atg_hotel_id;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public String getChain_id() {
        return chain_id;
    }

    public void setChain_id(String chain_id) {
        this.chain_id = chain_id;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getProperty_type_id() {
        return property_type_id;
    }

    public void setProperty_type_id(Integer property_type_id) {
        this.property_type_id = property_type_id;
    }

    public Integer getHotel_tag_id() {
        return hotel_tag_id;
    }

    public void setHotel_tag_id(Integer hotel_tag_id) {
        this.hotel_tag_id = hotel_tag_id;
    }

    public String getHotel_name_ar() {
        return hotel_name_ar;
    }

    public void setHotel_name_ar(String hotel_name_ar) {
        this.hotel_name_ar = hotel_name_ar;
    }

    public String getHotel_name_en() {
        return hotel_name_en;
    }

    public void setHotel_name_en(String hotel_name_en) {
        this.hotel_name_en = hotel_name_en;
    }

    public Integer getStar_rating() {
        return star_rating;
    }

    public void setStar_rating(Integer star_rating) {
        this.star_rating = star_rating;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getUnknown() {
        return unknown;
    }

    public void setUnknown(Boolean unknown) {
        this.unknown = unknown;
    }

    public String getLive_version() {
        return live_version;
    }

    public void setLive_version(String live_version) {
        this.live_version = live_version;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public Time getCheckout_time() {
        return checkout_time;
    }

    public void setCheckout_time(Time checkout_time) {
        this.checkout_time = checkout_time;
    }

    public Time getCheckin_end_time() {
        return checkin_end_time;
    }

    public void setCheckin_end_time(Time checkin_end_time) {
        this.checkin_end_time = checkin_end_time;
    }

    public Time getCheckin_begin_time() {
        return checkin_begin_time;
    }

    public void setCheckin_begin_time(Time checkin_begin_time) {
        this.checkin_begin_time = checkin_begin_time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
