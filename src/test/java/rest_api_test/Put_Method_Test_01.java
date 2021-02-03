package rest_api_test;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Put_Method_Test_01 {
	
	@Test
	public void testPut() {
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "Barman");
		map.put("job", "student");
		
		JSONObject request = new JSONObject(map);
		 baseURI = "https://reqres.in";
		 given()
		 		.header("Content-Type", "application/json")
		 		.contentType(ContentType.JSON)
		 		.accept(ContentType.JSON)
		 		.body(request.toJSONString())
		 .when()
		 		.put("/api/users/726")
		 .then()
		 		.statusCode(200)
		 		.log().all();	 
	}
}
