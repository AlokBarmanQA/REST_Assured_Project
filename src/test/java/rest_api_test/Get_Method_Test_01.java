package rest_api_test;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get_Method_Test_01 {
	
	@Test
	public void test_01() {
		baseURI = "https://reqres.in";
		Response response = get("/api/users?page=2");
		System.out.println("Response: "+response.asString());
		System.out.println("Body: "+response.getBody().asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("Content-Type"));
		System.out.println(response.getTime());
		
		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(actualStatusCode, 200);
	}
}
