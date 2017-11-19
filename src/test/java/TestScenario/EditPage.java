package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage {

	WebDriver driver;
	public EditPage(WebDriver driver)
	
	{
		this.driver = driver;
	}
	
	By fName = By.id("name_firstcon2");
	By saveEdit = By.name("save");
	
	public void setfirstNameEdit(String fnewName)
	{
		driver.findElement(fName).sendKeys(fnewName);
	}
	
	public void clickSaveEdit()
	{
		driver.findElement(saveEdit).click();
	}
}
