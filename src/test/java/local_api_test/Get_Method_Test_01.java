package local_api_test;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Get_Method_Test_01 {
	
	@Test
	public void get_Test_01() {
		baseURI = "http://localhost:3000";
		given()
		.when()
				.get("/subjects/1/users")
		.then()
				.statusCode(200)
				.log().all();
	}
	
	@Test
	public void get_Test_02() {
		baseURI = "http://localhost:3000";
		given()
		.when()
				.get("/subjects")
		.then()
				.statusCode(200)
				.log().all();
	}
	
	@Test
	public void get_Test_03() {
		baseURI = "http://localhost:3000";
		given()
		.when()
				.get("/subjects/1")
		.then()
				.statusCode(200)
				.log().all();
	}
	
	@Test
	public void get_Test_04() {
		baseURI = "http://localhost:3000";
		given()
		.when()
				.get("/subjects?name=devOps")
		.then()
				.statusCode(200)
				.log().all();
	}
	
	@Test
	public void get_Test_05() {
		baseURI = "http://localhost:3000";
		given()
		.when()
				.get("/users")
		.then()
				.statusCode(200)
				.log().all();
	}
	
	@Test
	public void get_Test_06() {
		baseURI = "http://localhost:3000";
		given()
		.when()
				.get("/users/1")
		.then()
				.statusCode(200)
				.log().all();
	}
}
