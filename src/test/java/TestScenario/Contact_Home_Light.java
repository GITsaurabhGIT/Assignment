package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact_Home_Light {
	
WebDriver driver;
	
	public Contact_Home_Light(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By click_New = By.xpath("//*[text()='New']");
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
