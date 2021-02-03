package local_api_test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import io.restassured.http.ContentType;
import utilities.ReadDataUtils;
public class Post_Method_Test_04 extends ReadDataUtils {

	// "C:/Users/alokb/OneDrive/Desktop/excelDataForPOST.xlsx"
	
	@Test(dataProvider="DataForPost")
	public void post_Test_01(Object fname, Object lname, Object subId) {
		
		baseURI = "http://localhost:3000";
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("firstName", fname);
		map.put("lastName", lname);
		map.put("subjectId", subId);
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
