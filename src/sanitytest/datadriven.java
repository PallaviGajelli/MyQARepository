package sanitytest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.util.WorkbookUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class datadriven {
	
	private static String sfolderpath="C:\\Users\\sanjaygajelli\\eclipse-workspace\\leena";
    private static String sfilenameXlsx="readwriteexel.xlsx";
    private static String sfilenameXls = "DataDriven.xls";
    private static String ssheetname="Sheet1";
			
	
	
	  WebDriver driver;
	 @Test
	  public void login() throws InvalidFormatException, IOException
	  { 
		 
		  readExcel(); 
	  }
	 @BeforeTest
	 public void BeforeTest()
	 {
		 System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\sanjaygajelli\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("http://www.gcrit.com/build3/admin/");
	 }
	  public void DataDrivenTest(String sUserName, String sPassword) throws InterruptedException
		{
			  driver.findElement(By.name("username")).sendKeys(sUserName);
			  driver.findElement(By.name("password")).sendKeys(sPassword);
			  driver.findElement(By.id("tdb1")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.name("username")).clear();
			  driver.findElement(By.name("password")).clear();
			  
			  
			 // Assert.assertEquals("http://www.gcrit.com/build3/admin/index.php", driver.getCurrentUrl()); 
			  
		}
	
	  @AfterTest
	  public void AfterTest() throws IOException
	  {
		  driver.close();
	      Runtime rt =Runtime.getRuntime();
		  Process proc = rt.exec("taskkill /im geckodriver.exe /f /t");
			 
	  }

	public void readExcel() throws InvalidFormatException, IOException 
	{
			File file= new File(sfolderpath+"\\"+sfilenameXlsx);
			FileInputStream inputstream= new FileInputStream(file);
		    try {			
			 		
			XSSFWorkbook myworkbook = new XSSFWorkbook(file);
			 
			Sheet mysheet= myworkbook.getSheetAt(0);
			int rowcount=mysheet.getLastRowNum()-mysheet.getFirstRowNum();
			for (int i=1;i<rowcount+1;i++) 
			{
				String sUserName = "";
				String sPassword = "";
				Row myrow= mysheet.getRow(i);
				for (int j=0;j<myrow.getLastCellNum();j++) 
				{
					if(j==0)
						sUserName = myrow.getCell(j).getStringCellValue();
					else
						sPassword = myrow.getCell(j).getStringCellValue();
					
					System.out.println(myrow.getCell(j).getStringCellValue()+"||");
				}
				
				DataDrivenTest( sUserName,  sPassword);
				myworkbook.close();
			}
		 }
		 catch(Exception e)
		 {
			 System.out.print("Error here :"+e.getMessage());
			 
		 }
		
	}


}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

