package rest_api_test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test; 
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;

public class Post_Method_Test_02 {

	@Test
	public void testPost() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "alok");
		map.put("job", "qa");
		System.out.println(map);

		JSONObject request = new JSONObject(map);

		System.out.println(request.toJSONString());	
		
		baseURI = "https://reqres.in";
		given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.post("/api/users")
		.then()
			.statusCode(201)
			.log().all();
	}
}
