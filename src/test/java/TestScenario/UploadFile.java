package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFile {

	WebDriver driver;
	public UploadFile(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By choosefile = By.id("file");
	By attach = By.id("Attach");
	By done = By.name("cancel");
	
	
	public void upload()
	{
		String workingDir = System.getProperty("user.dir") + "\\provarLogo.png";

		driver.findElement(choosefile).sendKeys(workingDir);
	}
	
	public void clickattach()
	{
		driver.findElement(attach).click();
	}
	
	public void clickDone()
	{
		driver.findElement(done).click();
	}
}
