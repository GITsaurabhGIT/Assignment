package TestScenario;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class New_Contact {
	
	private static final boolean String = false;
	WebDriver driver;
	
	public New_Contact(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By f_Name = By.id("name_firstcon2");
	By l_Name = By.id("name_lastcon2");
	By save = By.name("save");
	By err = By.xpath("//*[contains(text(),'You must enter a value')]");
	By lookUp = By.id("con4_lkwgt");
	By searchBox = By.id("lksrch");
	By go = By.xpath("//input[@name='go']");
	By recordRow = By.xpath("//tr[@class='dataRow even first']/th/a");
	
	public void first_Name(String fname)
	{
		driver.findElement(f_Name).sendKeys(fname);		
	}
	
	public void last_Name(String lname)
	{
		driver.findElement(l_Name).sendKeys(lname+firstproj.random_num);
	}
	
	public void save_Button()
	{
		driver.findElement(save).click();
	}
	
	public void error_message()
	{	
		Assert.assertEquals(driver.findElement(err).getText(), "Error: You must enter a value","assertion failed");
	}
	
	public void clickLookup() throws InterruptedException
	{
		driver.findElement(lookUp).click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String con_new = driver.getWindowHandle();	//parent	
		
		Set<String> child = driver.getWindowHandles(); //list of windows child
		
		String str1="";
		for(String str:child){
			str1=str;
			}
		
		
		driver.switchTo().window(str1);		
		
		/*Iterator<String> i1= child.iterator();
		String lookup = i1.next();
		driver.switchTo().window(lookup);*/
				
		WebElement iframeElement = driver.findElement(By.xpath("//frameset/frame[@id='searchFrame']"));
		
		driver.switchTo().frame(iframeElement);
		
		driver.findElement(searchBox).sendKeys("United");
		driver.findElement(go).click();
		
		driver.switchTo().defaultContent();
		
		WebElement iframeElement2 = driver.findElement(By.xpath("//frameset/frame[@id='resultsFrame']"));
		driver.switchTo().frame(iframeElement2);
		driver.findElement(recordRow).click();
		
		driver.switchTo().window(con_new);
		
		
	}
}
