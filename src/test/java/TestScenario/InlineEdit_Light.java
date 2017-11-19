package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class InlineEdit_Light {

	WebDriver driver;
	
	public InlineEdit_Light(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By title = By.xpath("//button[contains(@title,'Edit Title')]");
	By setTitle = By.xpath("//*[text()='Title']/../../input");
	By inlineSave = By.xpath("//button[@title='Save']");
	By details = By.xpath("//a[contains(@data-tab-name,'Details')]//*[text()='Details']");
	
	
	public void titleDoubleClick()
	{
		try{
			Thread.sleep(3000);
		}
		catch(Exception  e){
			
		}
		driver.findElement(title).click();

	}
	
	public void setTitle(String title)
	{
		driver.findElement(setTitle).sendKeys(title);
	}
	
	public void clickdetails()
	{
		try{
			Thread.sleep(10000);
		}
		catch(Exception  e){
			
		}
		driver.findElement(details).click();
		try{
			Thread.sleep(10000);
		}
		catch(Exception  e){
			
		}
	}
	
	public void inlineEditSave()
	{
		driver.findElement(inlineSave).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
