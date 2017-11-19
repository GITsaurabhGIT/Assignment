package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VisualForce {
	
	WebDriver driver;
	public VisualForce(WebDriver driver)
	{
		this.driver =  driver;
	}
	
	By desc = By.xpath("//*[text()='Description']/../..//textarea");
	By save = By.xpath("(//input[@value='Save'])[1]");
	
	public void setDesc(String descval)
	{
		WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@name,'vfFrameId')]"));

		driver.switchTo().frame(iframe);
		driver.findElement(desc).sendKeys(descval);
	}
	
	public void clickSave()
	{
		driver.findElement(save).click();
	}
	
}
