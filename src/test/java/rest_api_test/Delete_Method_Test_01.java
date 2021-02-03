package rest_api_test;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Delete_Method_Test_01 {
	
	@Test
	public void testDelete() {

		 baseURI = "https://reqres.in";

		 when()
		 		.delete("/api/users/156")
		 .then()
		 		.statusCode(204)
		 		.log().all();	 
	}
}
