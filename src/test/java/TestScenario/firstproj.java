package TestScenario;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstproj {

	@Test
	public void wedDriver()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/* why is it opening up new browser
		 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		*/ 
		driver.get("https://login.salesforce.com");
		
		LogIn logIn = new LogIn();
		logIn.credentials(driver,"sauraabh007@gmail.com", "salesforce.com17");		
		
	}
			
}
