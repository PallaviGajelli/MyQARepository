package sanitytest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class headLessBrowserfantomjsDriver 
{
		@Test
		 public void phantomJSDriver() 
		{
			try
			{
		
		 //Set the path of the phantomjs.exe file in the properties
		 System.setProperty("phantomjs.binary.path", 
				 "C:\\Drivers\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		 // To declare and initialize PhantomJSDriver
		 WebDriver driver = new PhantomJSDriver();
		 // Download link is http://phantomjs.org/download.html
		 // Set implicit wait 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 // Open "Google.com and search SoftwareTestingMaterial.com"
		 driver.get("https://www.google.com");
		 // To locate the searchbox using its name
		 WebElement element = driver.findElement(By.name("q"));
		 // To enter text "softwaretestingmaterial.com"
		 element.sendKeys("softwaretestingmaterial.com");
		 // To submit
		 element.submit();
		 //Click on Software Testing Material link
		 driver.findElement(By.linkText("Software Testing Material")).click();
		 // Get the title of the site and store it in the variable Title
		 String Title = driver.getTitle();
		 // Print the title
		 System.out.println("I am at " +Title);
		    }
			catch (Exception ex)
			{
				System.out.println("Something went wrong \n" + ex);
			}
		}		 
			
}
