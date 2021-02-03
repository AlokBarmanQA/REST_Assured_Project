package rest_api_test;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class Get_Method_Test_03 {

	@Test
	public void test_02() {
		baseURI = "https://reqres.in";

		given()
				.get("/api/users?page=2").
		then()
				.statusCode(200)
				.body("data[0].first_name", equalTo("Michael"))
				.body("data.first_name", hasItems("Rachel", "Lindsay"))
				.log().all();
	}
}
