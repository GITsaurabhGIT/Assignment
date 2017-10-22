package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By clickContact = By.id("Contact_Tab");
	
	public void clickOnContact()
	{
		driver.findElement(clickContact).click();
	}
}
