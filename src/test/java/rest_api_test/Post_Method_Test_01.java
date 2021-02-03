package rest_api_test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Post_Method_Test_01 {

	@Test
	public void test_01() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "alok");
		map.put("job", "qa");
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		System.out.println(request.toJSONString());	
	}
}
