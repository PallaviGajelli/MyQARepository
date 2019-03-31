package sanitytest;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;

//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;




public class readfile {

	    public static void main(String[] args) throws  IOException, BiffException {
		File f = new File("C:/Users/sanjaygajelli/eclipse-workspace/leena/DataDriven.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int rows = s.getRows();
		int columns = s.getColumns();
		System.out.println(rows);
		System.out.println(columns);

	}

}
