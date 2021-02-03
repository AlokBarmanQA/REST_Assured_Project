package rest_api_test;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Patch_Method_Test_01 {
	
	@Test
	public void testPatch() {
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("first_name", "alok");
		map.put("last_name", "qa");
		
		JSONObject request = new JSONObject(map);
		 baseURI = "https://reqres.in";
		 given()
		 		.header("Content-Type", "application/json")
		 		.contentType(ContentType.JSON)
		 		.accept(ContentType.JSON)
		 		.body(request.toJSONString())
		 .when()
		 		.patch("/api/users/2")
		 .then()
		 		.statusCode(200)
		 		.log().all();	 
	}
}
