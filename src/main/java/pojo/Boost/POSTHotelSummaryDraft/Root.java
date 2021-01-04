package pojo.Boost.POSTHotelSummaryDraft;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Root {
    List<POSTHotelSummaryDraftParent> myArray;
//    @JsonProperty("POSTHotelSummaryDraftParent")

    public List<POSTHotelSummaryDraftParent> getMyArray() {
        return this.myArray; }
    public void setMyArray(List<POSTHotelSummaryDraftParent> myArray) {
        this.myArray = myArray; }


}
