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
		List<WebElement> listOfRecordsloc = driver.findElements(By.xpath("//table[@class='x-grid3-row-table']/tbody//td[4]//a"));
		
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
			if (flag == true)
			{ driver.findElement(next).click(); }
			else 
			{ break; }
		}
	}


	
}
