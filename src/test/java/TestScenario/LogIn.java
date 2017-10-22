package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogIn {

	WebDriver driver;
	
	public LogIn(WebDriver driver)
	{
		this.driver = driver;
	}
	
		By uname = By.id("username");
		By pass  = By.id("password");
		By login = By.id("Login");
		
		public void userName(String username)
		{
			driver.findElement(uname).sendKeys(username);					
		}
		
		public void passwordmeth(String password)
		{
			driver.findElement(pass).sendKeys(password);
		}
		
		public void loginclick()
		{
			driver.findElement(login).click();
		}
		
			
}
