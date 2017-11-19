package TestScenario;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class New_Contact_Light {
	
	private static final boolean String = false;
	WebDriver driver;
	
	public New_Contact_Light(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By salutation = By.xpath("//a[@aria-label='Salutation']");
	By f_Name = By.xpath("//input[@placeholder='First Name']");
	By l_Name = By.xpath("//input[@placeholder='Last Name']");
	By save = By.xpath("//button[@title='Save']");
	By err = By.xpath("//*[contains(text(),'These required fields must be completed')]");
	By accName = By.xpath("//input[@placeholder='Search Accounts...']");
	By searchAction = By.xpath("(//input[@placeholder='Search Accounts...']/..//span)[1]");
	By recordRow = By.xpath("(//table[contains(@class,'VirtualDataGrid')]//a[contains(@class,'output')])[1]");
	By title = By.xpath("//*[text()='Title']/../../input");
    JavascriptExecutor js = (JavascriptExecutor)driver;		

	
	
	public void salu(String sal)
	{
		driver.findElement(salutation).sendKeys(sal);		
	}
	
	public void first_Name(String fname)
	{
		driver.findElement(f_Name).sendKeys(fname);		
	}
	
	public void last_Name(String lname)
	{
		driver.findElement(l_Name).sendKeys(lname+Lightning.random_num);
	}
	
	public void save_Button()
	{
		driver.findElement(save).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void error_message()
	{	
		Assert.assertEquals(driver.findElement(err).getText(), "These required fields must be completed: Last Name");
	}
	
	public void clickLookup() throws InterruptedException
	{
		driver.findElement(accName).sendKeys("Un");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		
		driver.findElement(searchAction).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		String con_new = driver.getWindowHandle();	//parent	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Set<String> child = driver.getWindowHandles(); //list of windows child
		
		String str1="";
		for(String str:child){
			str1=str;
			}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().window(str1);		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.switchTo().defaultContent();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(recordRow).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.switchTo().window(con_new);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}	
	
	public void setTitle(String tt)
	{
		driver.findElement(title).sendKeys(tt);
	}
}
