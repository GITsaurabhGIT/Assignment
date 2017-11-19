package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class InlineEdit {
	
	WebDriver driver;
	
	public InlineEdit(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By title = By.id("con5_ileinner");
	By setTitle = By.id("con5");
	By inlineSave = By.name("inlineEditSave");
	
	public void titleDoubleClick()
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(title)).doubleClick().build().perform();	

	}
	
	public void setTitle(String title)
	{
		driver.findElement(setTitle).sendKeys(title);
	}
	
	public void inlineEditSave()
	{
		driver.findElement(inlineSave).click();
	}
}
