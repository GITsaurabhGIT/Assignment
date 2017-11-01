package TestScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class listView {
	
	WebDriver driver;
	
	public listView(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By name = By.xpath("//td[4]/div/a");
	String temp= null;
	Boolean flag = true;
	By next = By.xpath("//*[@text()='Next']");
	
	public void navigatingToRecord(String value)
	{
		List<WebElement> listOfRecordsloc = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr//td[4]/div/a"));
		
		while(flag = true)
		{
		for(WebElement tempRecord :listOfRecordsloc)
		{
			//By record = (By) tempRecord;
			temp = tempRecord.getText();
			String sub = temp.substring(0, temp.indexOf(","));
			//String tempRecordvalue= tempRecord.findElement(name).toString();
			
			if(value.contains(sub) && flag == true)
			{ 
				tempRecord.sendKeys(Keys.ENTER);
				//driver.findElement(tempRecord).click(); 
				flag = false;
				break;
			}
		}
			driver.findElement(next).click();
		}
	}
	
}
