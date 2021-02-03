package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadDataUtils {
	
	XSSFWorkbook workbook;
	Sheet sheet;
	DataFormatter formatter = new DataFormatter();
	int rows = sheet.getPhysicalNumberOfRows();
	public ReadDataUtils() {
		
		File file = new File("C:/Users/alokb/OneDrive/Desktop/excelDataForPOST.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("Sheet1");
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@DataProvider(name="DataForPost")
	public Object[][] getExcelData() {
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[rows][cells];
		DataFormatter formatter = new DataFormatter();
		for(int i=1; i<rows; i++) {
			for(int j=0; j<cells; j++) {
				String cellData = formatter.formatCellValue(sheet.getRow(i).getCell(j));
				data[i][j] = cellData;
			}
		}
		return data;
	}
}
