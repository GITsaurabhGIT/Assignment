package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class clickingContactObjectLight {

	WebDriver driver;
	public clickingContactObjectLight(WebDriver driver)
	{
		this.driver =  driver;
	}
	By appMenu = By.xpath("//nav[@class='appLauncher slds-context-bar__icon-action']");
	By contactObj = By.xpath("//a[@title='Contacts']/span/span");
	By findBox = By.xpath("//input[@placeholder='Find an app or item']");
	By vf = By.xpath("//a[@title='visualForce']/span/span");
	
	public void clickAppMenuBtn()
	{
		driver.findElement(appMenu).click();
	}
	
	public void clickContactObj()
	{
		driver.findElement(contactObj).click();
	}
	
	public void findElement(String val)
	{
		driver.findElement(findBox).sendKeys(val);
	}
	
	public void clickVf()
	{
		driver.findElement(vf).click();
	}
}
