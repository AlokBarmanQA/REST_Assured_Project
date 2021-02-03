package local_api_test;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Delete_method_Test_01 {

	@Test
	public void delete_test_01() {
		baseURI = "http://localhost:3000";
		given()
		.when()
				.delete("/users/9")
		.then()
				.statusCode(200)
				.log().all();
	}
}
