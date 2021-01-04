package pojo.Boost.POSTHotelSummaryDraft;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "atgHotelId",
        "chainBrandId",
        "checkinBeginTime",
        "checkinEndTime",
        "checkoutTime",
        "countryCode",
        "email",
        "fax",
        "floors",
        "hotelChainId",
        "hotelNameAr",
        "hotelNameEn",
        "isActive",
        "latitude",
        "longitude",
        "phone",
        "propertyTypeId",
        "rank",
        "rooms",
        "starRating",
        "thumbnailUrl",
        "tvHotelId",
        "username",
        "website"
})
public class POSTHotelSummaryDraftParent {

    @JsonProperty("atgHotelId")
    private Integer atgHotelId;
    @JsonProperty("chainBrandId")
    private Integer chainBrandId;
    @JsonProperty("checkinBeginTime")
    private String checkinBeginTime;
    @JsonProperty("checkinEndTime")
    private String checkinEndTime;
    @JsonProperty("checkoutTime")
    private String checkoutTime;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("email")
    private String email;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("floors")
    private Integer floors;
    @JsonProperty("hotelChainId")
    private Integer hotelChainId;
    @JsonProperty("hotelNameAr")
    private String hotelNameAr;
    @JsonProperty("hotelNameEn")
    private String hotelNameEn;
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("propertyTypeId")
    private Integer propertyTypeId;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("rooms")
    private Integer rooms;
    @JsonProperty("starRating")
    private Integer starRating;
    @JsonProperty("thumbnailUrl")
    private String thumbnailUrl;
    @JsonProperty("tvHotelId")
    private Integer tvHotelId;
    @JsonProperty("username")
    private String username;
    @JsonProperty("website")
    private String website;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("atgHotelId")
    public Integer getAtgHotelId() {
        return atgHotelId;
    }

    @JsonProperty("atgHotelId")
    public void setAtgHotelId(Integer atgHotelId) {
        this.atgHotelId = atgHotelId;
    }

    @JsonProperty("chainBrandId")
    public Integer getChainBrandId() {
        return chainBrandId;
    }

    @JsonProperty("chainBrandId")
    public void setChainBrandId(Integer chainBrandId) {
        this.chainBrandId = chainBrandId;
    }

    @JsonProperty("checkinBeginTime")
    public String getCheckinBeginTime() {
        return checkinBeginTime;
    }

    @JsonProperty("checkinBeginTime")
    public void setCheckinBeginTime(String checkinBeginTime) {
        this.checkinBeginTime = checkinBeginTime;
    }

    @JsonProperty("checkinEndTime")
    public String getCheckinEndTime() {
        return checkinEndTime;
    }

    @JsonProperty("checkinEndTime")
    public void setCheckinEndTime(String checkinEndTime) {
        this.checkinEndTime = checkinEndTime;
    }

    @JsonProperty("checkoutTime")
    public String getCheckoutTime() {
        return checkoutTime;
    }

    @JsonProperty("checkoutTime")
    public void setCheckoutTime(String checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("fax")
    public String getFax() {
        return fax;
    }

    @JsonProperty("fax")
    public void setFax(String fax) {
        this.fax = fax;
    }

    @JsonProperty("floors")
    public Integer getFloors() {
        return floors;
    }

    @JsonProperty("floors")
    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    @JsonProperty("hotelChainId")
    public Integer getHotelChainId() {
        return hotelChainId;
    }

    @JsonProperty("hotelChainId")
    public void setHotelChainId(Integer hotelChainId) {
        this.hotelChainId = hotelChainId;
    }

    @JsonProperty("hotelNameAr")
    public String getHotelNameAr() {
        return hotelNameAr;
    }

    @JsonProperty("hotelNameAr")
    public void setHotelNameAr(String hotelNameAr) {
        this.hotelNameAr = hotelNameAr;
    }

    @JsonProperty("hotelNameEn")
    public String getHotelNameEn() {
        return hotelNameEn;
    }

    @JsonProperty("hotelNameEn")
    public void setHotelNameEn(String hotelNameEn) {
        this.hotelNameEn = hotelNameEn;
    }

    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("propertyTypeId")
    public Integer getPropertyTypeId() {
        return propertyTypeId;
    }

    @JsonProperty("propertyTypeId")
    public void setPropertyTypeId(Integer propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("rooms")
    public Integer getRooms() {
        return rooms;
    }

    @JsonProperty("rooms")
    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    @JsonProperty("starRating")
    public Integer getStarRating() {
        return starRating;
    }

    @JsonProperty("starRating")
    public void setStarRating(Integer starRating) {
        this.starRating = starRating;
    }

    @JsonProperty("thumbnailUrl")
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    @JsonProperty("thumbnailUrl")
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    @JsonProperty("tvHotelId")
    public Integer getTvHotelId() {
        return tvHotelId;
    }

    @JsonProperty("tvHotelId")
    public void setTvHotelId(Integer tvHotelId) {
        this.tvHotelId = tvHotelId;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}