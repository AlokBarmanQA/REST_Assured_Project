package local_api_test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import io.restassured.http.ContentType;

public class Post_Method_Test_03 {
	
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

	@DataProvider(name="DataForPost")
	public Object[][] getExcelData() {
		File file = new File("C:/Users/alokb/OneDrive/Desktop/excelDataForPOST.xlsx");
		FileInputStream fis;
		XSSFWorkbook workbook = null;
		Sheet sheet = null;
		try {
			fis = new FileInputStream(file);
			try {
				workbook = new XSSFWorkbook(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			sheet = workbook.getSheet("Sheet1");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[rows][cells];
		DataFormatter formatter = new DataFormatter();
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cells; j++) {
				String cellData = formatter.formatCellValue(sheet.getRow(i).getCell(j));
				data[i][j] = cellData;
			}
		}
		return data;
	}
}
