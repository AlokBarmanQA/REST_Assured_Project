package local_api_test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class Post_Method_Test_02 {

	@Test
	public void post_Test_01() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "manual");
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/subjects")
		.then()
				.statusCode(201)
				.log().all();
	}
	@Test
	public void post_Test_02() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "java");
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/subjects")
		.then()
				.statusCode(201)
				.log().all();
	}
	@Test
	public void post_Test_03() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "python");
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/subjects")
		.then()
				.statusCode(201)
				.log().all();
	}
	@Test
	public void post_Test_04() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "pearl");
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/subjects")
		.then()
				.statusCode(201)
				.log().all(); 
	}
	
	@Test
	public void post_Test_05() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "javaScript");
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/subjects")
		.then()
				.statusCode(201)
				.log().all();
	}
	
	@Test
	public void post_Test_06() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "c sharp");
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/subjects")
		.then()
				.statusCode(201)
				.log().all();
	}
	@Test
	public void post_Test_07() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "ruby");
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/subjects")
		.then()
				.statusCode(201)
				.log().all();
	}
	@Test
	public void post_Test_08() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "c plus plus");
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/subjects")
		.then()
				.statusCode(201)
				.log().all();
	}
	@Test
	public void post_Test_09() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "rpa");
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/subjects")
		.then()
				.statusCode(201)
				.log().all();
	}

}
