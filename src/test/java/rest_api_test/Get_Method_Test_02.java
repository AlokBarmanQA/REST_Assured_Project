package rest_api_test;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class Get_Method_Test_02 {

	@Test
	public void test_02() {
		baseURI = "https://reqres.in";

		given()
				.get("/api/users?page=2").
		then()
				.statusCode(200)
				.body("data[0].id", equalTo(7))
				.log().all();
	}
}
