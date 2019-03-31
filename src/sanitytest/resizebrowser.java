package sanitytest;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resizebrowser {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjaygajelli\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
 		 
         // Launch the application
     	 driver.get("https://www.guru99.com/");
     	 
     	Dimension d = new Dimension(300,1080);
     	//Resize current window to the set dimension
     	   driver.manage().window().setSize(d);
     	        
     	 //To Delay execution for 10 sec. as to view the resize browser
     	 Thread.sleep(10000);
     	       
     	 //Close the browser
     	 driver.quit();
	}

}
