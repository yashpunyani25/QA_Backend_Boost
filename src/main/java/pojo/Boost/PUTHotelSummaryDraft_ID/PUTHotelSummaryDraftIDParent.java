package pojo.Boost.PUTHotelSummaryDraft_ID;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "chainBrandId",
        "checkinBeginTime",
        "checkinEndTime",
        "checkoutTime",
        "email",
        "fax",
        "floors",
        "hotelChainId",
        "hotelNameAr",
        "hotelNameEn",
        "hotelTagId",
        "isActive",
        "phone",
        "propertyTypeId",
        "rank",
        "rooms",
        "starRating",
        "thumbnailUrl",
        "unknown",
        "username",
        "website"
})
public class PUTHotelSummaryDraftIDParent {

    @JsonProperty("chainBrandId")
    private Integer chainBrandId;
    @JsonProperty("checkinBeginTime")
    private String checkinBeginTime;
    @JsonProperty("checkinEndTime")
    private String checkinEndTime;
    @JsonProperty("checkoutTime")
    private String checkoutTime;
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
    @JsonProperty("hotelTagId")
    private Integer hotelTagId;
    @JsonProperty("isActive")
    private Boolean isActive;
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
    @JsonProperty("unknown")
    private Boolean unknown;
    @JsonProperty("username")
    private String username;
    @JsonProperty("website")
    private String website;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("hotelTagId")
    public Integer getHotelTagId() {
        return hotelTagId;
    }

    @JsonProperty("hotelTagId")
    public void setHotelTagId(Integer hotelTagId) {
        this.hotelTagId = hotelTagId;
    }

    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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

    @JsonProperty("unknown")
    public Boolean getUnknown() {
        return unknown;
    }

    @JsonProperty("unknown")
    public void setUnknown(Boolean unknown) {
        this.unknown = unknown;
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