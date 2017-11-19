package TestScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class listView_Light {
	
	WebDriver driver;
	
	public listView_Light(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By name = By.xpath("/th/span/a");
	String temp= null;
	Boolean flag = true;

	
	public void navigatingToRecord(String value)
	{
		List<WebElement> listOfRecordsloc = driver.findElements(By.xpath("(//table[contains(@class,'uiVirtualDataTable')]/tbody)[2]//tr/th/span/a"));
		
		while(flag = true)
		{
		for(WebElement tempRecord :listOfRecordsloc)
		{
			//By record = (By) tempRecord;
			temp = tempRecord.getText();
			//String sub = temp.substring(0, temp.indexOf(","));
			//String tempRecordvalue= tempRecord.findElement(name).toString();
			
			if(value.equals(temp) && flag == true)
			{ 
				  try{
					   Thread.sleep(5000);
					  }catch (InterruptedException ie1) {
					    ie1.printStackTrace();
					  }
				tempRecord.sendKeys(Keys.ENTER);
				//driver.findElement(tempRecord).click(); 
				flag = false;
				break;
			}
		}
			break;
		}
	}
	
	
}
