package utilities;

import io.restassured.specification.RequestSpecification;
import pojo.Boost.POSTHotelSummaryDraft.BuildJsonPayload_POSTHotelSummaryDraft;
import pojo.Boost.PUTHotelSummaryDraft_ID.BuildJsonPayload_PUTHotelSummaryDraft_ID;
import pojo.Boost.PostHotelSearch.BuildJsonPayload_POSTHotelSearch;
import pojo.Boost.POSTHotelSummaryDraft.Root;
import stepDefinations.CommonSteps;

import java.util.Map;

public class GenerateRequestBody {

    public void setBody(String payloadName, Map<String, String> payloadData) throws Throwable {

        switch (payloadName) {

            case "POSTHotelSearch":
                CommonSteps.requestSpecs = CommonSteps.requestSpecs.body(BuildJsonPayload_POSTHotelSearch.postHotelSearch(payloadData));
                break;

            case "PUTHotelSummaryDraft_ID":
                CommonSteps.requestSpecs = CommonSteps.requestSpecs.body(BuildJsonPayload_PUTHotelSummaryDraft_ID.putHotelSummaryDraftID(payloadData));
                break;

            case "POSTHotelSummaryDraft":
                CommonSteps.requestSpecs = CommonSteps.requestSpecs.body(BuildJsonPayload_POSTHotelSummaryDraft.postHotelSummaryDraft(payloadData));
                break;
            default:
                System.err.println("Payload method " + payloadName + " not found");
                break;
        }
    }
}
