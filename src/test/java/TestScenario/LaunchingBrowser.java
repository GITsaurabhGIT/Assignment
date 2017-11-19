package TestScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchingBrowser {

	WebDriver driver;
	public String baseUrl = "https://login.salesforce.com";

	
	/*LaunchingBrowser(WebDriver driver)
	{
		this.driver = driver;
	}*/
	
	public WebDriver launchBrowser()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		 
		driver.get(baseUrl);
		
		return driver;
	}
}
