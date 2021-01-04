package utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import io.restassured.response.Response;
import mySQL.dbConfig;
import stepDefinations.CommonSteps;
import static io.restassured.RestAssured.given;

public class ReusableMethods {

	// Returns JsonPath variable used to traverse the response
	public static JsonPath stringToJson(String res) {
		JsonPath jsonPath = new JsonPath(res);
		return jsonPath;
	}
	
	//Returns complete json node from a list response for the unique jsonPath given in input
	public static List<String> getChildNodeFromJsonArray(String parentNode, String childNode, String value) throws JsonMappingException, JsonProcessingException{
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(CommonSteps.res.asString()).get(parentNode);
		
		List<String> requiredRecord = new ArrayList<String>();
		
		if(jsonNode.isArray()) {
			for(JsonNode temp : jsonNode) {
				if((temp.get(childNode) != null) && (temp.get(childNode).asText().equals(value))) {
					requiredRecord.add(temp.toString());
				}
			}
		}
		return requiredRecord;
	}

	// Returns the Authentication token
	public static String getAuthKey() {
		RestAssured.baseURI = CommonSteps.propConfig.getProperty("tokenUriForBoost");
		RestAssured.useRelaxedHTTPSValidation();
//		String userName = CommonSteps.propEnv.getProperty("userName_" + baseURI);
//		String password = CommonSteps.propEnv.getProperty("password_" + baseURI);
		Response res = given().auth().basic("admin", "123456")
				.header("Content-Type", "application/x-www-form-urlencoded")
				.header("Authorization", "Basic Y21zX3Jvb21fbWFwcGluZzp1c2Vy")
				.formParam("grant_type", "client_credentials").post("/auth-service/oauth/token");
//		res.prettyPrint();
		JsonPath jsonPath = ReusableMethods.stringToJson(res.asString());
		String x = jsonPath.getString("access_token");
		return x;
	}

	// to read payload from Json file
	public static String ReadPayloadFromJsonFile(String path) throws IOException {
		return new String(Files.readAllBytes(Paths.get(path)));
	}

	public static String generateRandomNumber() {
		String random;
		Random rnd = new Random();
		int r = rnd.nextInt(999999);
		// this will convert any number sequence into 6 character.
		random = String.format("%06d", r);
		return random;
	}

	public static dbConfig getDBConfigForBoost(String dbname) {
		String baseURL = "jdbc:mysql://boost-staging-instance.cgdrbvkghjok.eu-west-1.rds.amazonaws.com:3306/";
		String username = "tajawal";
		String password = "TVVZWDVvY3BXR1VwMTMwMgo=";
		return new dbConfig(baseURL, dbname, username, password);
	}

//	String postUrl = "http://hotels-auth-service.tajawal-dev.internal/auth-service/oauth/token";
//	Response response = RestAssured.given().config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().encodeContentTypeAs("x-www-form-urlencoded", ContentType.URLENC)))
//			.contentType("application/x-www-form-urlencoded; charset=UTF-8")
//			.formParam("grant_type", "password")
//			.formParam("username", "admin")
//			.formParam("password", BOOST_ADMIN_PASSWORD)
//			.header("Authorization", "Basic Y21zX3Jvb21fbWFwcGluZzp1c2Vy")
//			.header("Content-Type", "application/x-www-form-urlencoded")
//			.post(postUrl);
//	String accessToken = response.getBody().jsonPath().getString("access_token");
//	//System.out.println("Access token value is: " + accessToken);
//        return accessToken;
}
