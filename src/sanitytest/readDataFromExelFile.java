package sanitytest;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readDataFromExelFile {

	public static void main(String[] args) 
	{
		    public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
		    
			File file = new File("C:\\Users\\sanjaygajelli\\Desktop\\testing\\ClicQA\\Selenium Training Plan.xlsx");
		    FileInputStream inputStream = new FileInputStream(file);
		    Workbook Workbook1 = null;
		    String fileExtensionName = fileName.substring(fileName.indexOf("."));
            if(fileExtensionName.equals(".xlsx")){
            Workbook1 = new XSSFWorkbook(inputStream);
            }

		    }
		    else if(fileExtensionName.equals(".xls")){
		        Workbook1 = new HSSFWorkbook(inputStream);
		    }
		    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
		    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
            for (int i = 0; i < rowCount+1; i++) {
                Row row = guru99Sheet.getRow(i);
                for (int j = 0; j < row.getLastCellNum(); j++) {
		            System.out.print(row.getCell(j).getStringCellValue()+"|| ")
		        }
		        System.out.println();
		    } 
		    }  

	       public static void main(String...strings) throws IOException{
		    ReadGuru99ExcelFile objExcelFile = new ReadGuru99ExcelFile();
            String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
		    objExcelFile.readExcel(filePath,"ExportExcel.xlsx","ExcelGuru99Demo");


	}

}
