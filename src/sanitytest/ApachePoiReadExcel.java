package sanitytest;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ApachePoiReadExcel 
{
	@Test
	public void readExcel()
	{try {
		String filePath="C:\\Users\\sanjaygajelli\\eclipse-workspace\\leena";
		String fileName="readwriteexel.xlsx";
		String sheetName="Sheet1";
		 File file =    new File(filePath+"\\"+fileName);
		 FileInputStream inputStream = new FileInputStream(file);
		 Workbook w = null;
		 w = new XSSFWorkbook(inputStream);
		 Sheet s = w.getSheet(sheetName);
		 int rowCount = s.getLastRowNum()-s.getFirstRowNum();
		 System.out.print("This is rows in Excel :"+rowCount);
	}
	catch(Exception e){
		System.out.println(e);
		
	}
	}
}
