package datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static String[][] getData() throws IOException {
		// .properties
		FileInputStream file = new FileInputStream("D:\\Selenium\\TestData\\EmpData.xlsx");		
		XSSFWorkbook workbook = new XSSFWorkbook(file);	
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		String [][] empData=new String[rowcount][colcount];
		for(int i=0;i<rowcount;i++) { // row iterator	
			for(int j=0;j<colcount;j++) { //column iterator		
				empData[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
			System.out.println();
		}
		return empData;
	}
}
