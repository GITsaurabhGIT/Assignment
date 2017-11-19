package TestScenario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Contact_View_Light {
	
	WebDriver driver;
	
	public Contact_View_Light(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By c_name = By.xpath("//*[text()='Contact']/..//span");
	By edit =  By.xpath("//div[@class='active oneContent']//header[@role='banner']//a[@title='Edit']/..");

	String name = null;
	
	public String view_contact()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		name = driver.findElement(c_name).getText();
		System.out.println(name);		
		return name;
		
	}
	
	public void verifyingCname(int random_num)
	{
		String ch = Integer.toString(random_num);
		Assert.assertTrue(name.contains(ch));

	}
	
	public String extractURL()
	{
		String id = null;
		String url = driver.getCurrentUrl();
		Pattern p = Pattern.compile("[0-9A-Za-z]{15}");
		Matcher m = p.matcher(url);
		if(m.find())
		{
			id = m.group(0);
		}
		
		return id;
	}
	
	public void clickEditButton()
	{
		WebElement editButton = driver.findElement(edit);
		Actions ob = new Actions(driver);
		ob.moveToElement(editButton);
		ob.click(editButton);
		Action action  = ob.build();
		action.perform();
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 

		driver.findElement(edit).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} */
	}
	
	
}
