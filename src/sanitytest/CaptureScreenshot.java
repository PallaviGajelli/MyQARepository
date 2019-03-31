package sanitytest;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot {

	
	@Test
	 public static void captureScreenMethod() 
	{
		try
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\sanjaygajelli\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://en-gb.facebook.com/");
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotFile, new File("C:\\Users\\sanjaygajelli\\eclipse-workspace\\leena\\src\\sanitytest\\Screenshot.png"));
		 driver.close();
		 driver.quit(); 
		 }
	
		catch (Exception ex)
		{
			System.out.println("Something went wrong." + ex);
		}
  }
}
