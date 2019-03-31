package sanitytest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentReportJunit {
	
	
	static ExtentReports report;
	static ExtentTest test;
   
	
	  @BeforeMethod 
	  public static void startTest() { 
			//locating place for report
		   report = new ExtentReports("C:\\Users\\sanjaygajelli\\eclipse-workspace\\leena\\leenaReports\\ExtentReportResults.html");
		   //update  your logs in report
		   test = report.startTest("pallavi");}
	 
	
	@Test
	public void extentReportsDemo()
	{
	     
	     System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\sanjaygajelli\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	if(driver.getTitle().equals("Google"))
	{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
	}
	 else
    {
	test.log(LogStatus.FAIL, "Test Failed");
	}
	}
	
	  @AfterMethod
	  public static void endTest() {
		  report.endTest(test);
		  report.flush();
	  
	  }
	}
	 
	/*
	 * test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+
	 * "Test Failed");
	 * 
	 * public static String capture(WebDriver driver) throws IOException { File
	 * scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); File
	 * Dest = new File("src/../ErrImages/" + System.currentTimeMillis()+ ".png");
	 * String errflpath = Dest.getAbsolutePath(); FileUtils.copyFile(scrFile, Dest);
	 * return errflpath; }
	 */
  

