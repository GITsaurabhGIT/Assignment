package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact_Home {
	
	WebDriver driver;
	
	public Contact_Home(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By click_New = By.xpath("(//input[@name='new'])");
	By go = By.name("go");
	
	public void clickNewButton()
	{
		driver.findElement(click_New).click();
	}

	public void clickOnGo()
	{
		driver.findElement(go).click();		
	}
	
}
