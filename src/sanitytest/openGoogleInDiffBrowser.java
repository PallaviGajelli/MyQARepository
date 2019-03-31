package sanitytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;



public class openGoogleInDiffBrowser {
	@Test
	public void browsers() {
		
		 String baseUrl = "https://www.google.com/";					
		// Open in chrome
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\sanjaygajelli\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver chrome = new ChromeDriver(); chrome .get(baseUrl);
		  System.out.println("chrome works");	
		  
		
		  
		
         //open in firefox
		  System.setProperty("webdriver.gecko.driver",
		"C:\\Users\\sanjaygajelli\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		  WebDriver firefox = new FirefoxDriver(); 
		  firefox.get(baseUrl);
		  System.out.println("firefox works");
		 
		
			  // open in IE
		  System.setProperty("webdriver.ie.driver",
		  "C:\\Users\\sanjaygajelli\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe"
		  ); WebDriver ie = new InternetExplorerDriver(); ie.get(baseUrl);
		  System.out.println("IE works");
		 
		 
	}
}


