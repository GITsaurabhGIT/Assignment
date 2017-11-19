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
	By clickExpandObjLight = By.xpath("//a[contains(@title,'More Tabs Menu')]/..");
	By clickvf = By.xpath("//li[contains(@class,'visualForce')]/a");
	
	public void clickOnContact()
	{
		driver.findElement(clickContact).click();
	}
	
	public void clickExpand()
	{
		driver.findElement(clickExpandObjLight).click();
	}
	
	public void clickvf()
	{
		driver.findElement(clickvf).click();
	}
}
