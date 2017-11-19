package TestScenario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import junit.framework.Assert;

public class Contact_View {
	
	WebDriver driver;
	
	public Contact_View(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By c_name = By.id("con2_ileinner");
	By edit = By.name("edit");
	WebElement attachFilebutton = driver.findElement(By.xpath("//div[contains(@id,'RelatedNoteList') and (@class='bRelatedList')]//div[@class='pbHeader']//td[@class='pbButton']//input[@value='Attach File']"));

	By attachFile = By.xpath("//div[contains(@id,'RelatedNoteList') and (@class='bRelatedList')]//div[@class='pbHeader']//td[@class='pbButton']//input[@value='Attach File']");
	String name = null;
	
	public String view_contact()
	{
		
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
	
	public void clickEdit()
	{
		driver.findElement(edit).click();
	}
	
	public void clickAttachFile()
	{
		/*WebElement attachfileButton = driver.findElement(attachFile);
		Actions ob = new Actions(driver);
		ob.moveToElement(attachfileButton);
		ob.click(attachfileButton);
		Action action  = ob.build();
		action.perform();*/
		/*JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript(attachFilebutton.scrollIntoView());*/
		driver.findElement(attachFile).click();
		

	}
}
