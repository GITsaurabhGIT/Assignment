package TestScenario;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstproj {

	public String baseUrl = "https://login.salesforce.com";
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		 
		driver.get(baseUrl);
	}
	
	
	@Test(priority = 1)
	public void loginPage()
	{
		//LogIn logIn = new LogIn(driver);
		LogIn lIn=PageFactory.initElements(driver, LogIn.class);
		lIn.userName("sauraabh007@gmail.com");		
		lIn.passwordmeth("salesforce.com17");
		lIn.loginclick();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	}
	
	@Test(priority = 2)
	public void clickOnContact()
	{
		HomePage contact = new HomePage(driver);
		contact.clickOnContact();
	}
	
	//@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
}
