package local_api_test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class Post_Method_Test_01 {

	@Test
	public void post_Test_01() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("firstName", "nilav");
		map.put("lastName", "roy");
		map.put("subjectId", 1);
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/users")
		.then()
				.statusCode(201)
				.log().all();
	}
	
	@Test
	public void post_Test_02() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("firstName", "goutam");
		map.put("lastName", "roy");
		map.put("subjectId", 1);
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/users")
		.then()
				.statusCode(201)
				.log().all();
	}
	
	@Test
	public void post_Test_03() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("firstName", "ananya");
		map.put("lastName", "sarkar");
		map.put("subjectId", 1);
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/users")
		.then()
				.statusCode(201)
				.log().all();
	}
	
	@Test
	public void post_Test_04() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("firstName", "nilav");
		map.put("lastName", "roy");
		map.put("subjectId", 2);
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/users")
		.then()
				.statusCode(201)
				.log().all();
	}
	
	@Test
	public void post_Test_05() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("firstName", "goutam");
		map.put("lastName", "roy");
		map.put("subjectId", 2);
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/users")
		.then()
				.statusCode(201)
				.log().all();
	}
	
	@Test
	public void post_Test_06() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("firstName", "ananya");
		map.put("lastName", "sarkar");
		map.put("subjectId", 2);
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/users")
		.then()
				.statusCode(201)
				.log().all();
	}
	
	@Test
	public void post_Test_07() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("firstName", "alok");
		map.put("lastName", "kumar");
		map.put("subjectId", 2);
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/users")
		.then()
				.statusCode(201)
				.log().all();
	}
	
	@Test
	public void post_Test_08() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("firstName", "nrityam");
		map.put("lastName", "argha");
		map.put("subjectId", 2);
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/users")
		.then()
				.statusCode(201)
				.log().all();
	}
	
	@Test
	public void post_Test_09() {
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("firstName", "deepa");
		map.put("lastName", "barman");
		map.put("subjectId", 2);
		JSONObject request = new JSONObject(map);
		given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
		.when()
				.post("/users")
		.then()
				.statusCode(201)
				.log().all();
	}
}
