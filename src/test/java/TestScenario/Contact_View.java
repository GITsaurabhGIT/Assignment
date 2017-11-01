package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact_View {
	
	WebDriver driver;
	
	public Contact_View(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By c_name = By.id("con2_ileinner");
	
	public String view_contact()
	{
		
		String name = driver.findElement(c_name).getText();
				
		return name;
		
	}
}
