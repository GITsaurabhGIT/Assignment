package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage_Light {
		
	WebDriver driver;
	public EditPage_Light(WebDriver driver)
	
	{
		this.driver = driver;
	}
	
	By fName = By.xpath("//input[@placeholder='First Name']");
	By saveEdit = By.xpath("//button[@title='Save']");
	
	public void setfirstNameEdit(String fnewName)
	{
		driver.findElement(fName).sendKeys(fnewName);
	}
	
	public void clickSaveEdit()
	{
		driver.findElement(saveEdit).click();
	}
	
}
