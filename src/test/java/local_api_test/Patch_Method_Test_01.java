package local_api_test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Patch_Method_Test_01 {
	
	@Test
	public void put_test_01() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("subjectId", 2);
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.patch("/users/4")
		.then()
				.statusCode(200)
				.log().all();
	}
}
