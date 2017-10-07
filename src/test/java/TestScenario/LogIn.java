package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {

		public void credentials(WebDriver driver,String username,String password)
		{
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("Login")).click();	
		}
		
}
