package TestScenario;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Classic {

	WebDriver driver;
	String contactName=null;
	

	//generating a unique random number
	static double random_num_double = Math.random()*100 + 1;
	static int random_num = (int)(random_num_double);
	
	@BeforeTest
	public WebDriver launchBrowser()
	{
		LaunchingBrowser lb = new LaunchingBrowser();
		return this.driver = lb.launchBrowser();

	}	
	
		
	@Test(priority = 1)
	public void loginPage()
	{
		//LogIn lIn = new LogIn(driver);
		LogIn lIn=PageFactory.initElements(driver, LogIn.class);
		lIn.userName("sauraabh007@gmail.com");		
		lIn.passwordmeth("salesforce.com17");
		lIn.loginclick();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	@Test(priority = 2)
	public void clickOnContact()
	{
		HomePage contact = new HomePage(driver);
		contact.clickOnContact();
	}
	
	@Test(priority = 3)
	public void clickingNew()
	{
		Contact_Home ch = new Contact_Home(driver);
		ch.clickNewButton();
	}
	
	@Test(priority = 4)
	public void setValuesNewPage() throws InterruptedException
	{
		New_Contact nc = new New_Contact(driver);
		nc.save_Button();
		nc.error_message();
		nc.first_Name("Contact");
		nc.last_Name("Name");	
		nc.clickLookup();
		nc.save_Button();
	}
	
	String cName,id = null;
	@Test(priority = 5)
	public void read_Contact_Name()
	{
		Contact_View vcc = new Contact_View(driver);
		cName = vcc.view_contact().toString();
		vcc.verifyingCname(random_num);
		id = vcc.extractURL();
	}
	
	@Test(priority = 6)
	public void writeInSheet() throws IOException
	{
		String filePathString = System.getProperty("user.dir") + "\\Book1.xlsx";
		File file_path = new File(filePathString);
		WrittingValuesInExcel we = new WrittingValuesInExcel();
		we.writeDataIntoExcel(file_path, "Sheet1", cName,id);
	}
	
	@Test(priority = 7)
	public void readFromExcel() throws IOException
	{
		String filePathString = System.getProperty("user.dir") + "\\Book1.xlsx";
		File file_path = new File(filePathString);
		ReadingValuesFromExcel we = new ReadingValuesFromExcel();
		contactName = we.excelRead(file_path, "Sheet1");
	}
	
	@Test(priority = 8)
	public void clickOnContact2()
		{
			HomePage contact = new HomePage(driver);
			contact.clickOnContact();
		}
	
	@Test(priority = 9)
	public void clickingGoforListView()
	{
		Contact_Home ch = new Contact_Home(driver);
		ch.clickOnGo();
	}

	@Test(priority = 10)
	public void navigatingToRecord()
	{
		listView lv = new listView(driver);
		lv.navigatingToRecord(contactName);
}
	
	@Test(priority = 11)
	public void editPage()
	{
		Contact_View cv = new Contact_View(driver);
		cv.clickEdit();
		EditPage ep = new EditPage(driver);
		ep.setfirstNameEdit("ContactEdited");
		ep.clickSaveEdit();
	}
	
	@Test(priority = 12)
	public void inlineEditPage()
	{
		InlineEdit ie = new InlineEdit(driver);
		ie.titleDoubleClick();
		ie.setTitle("TestTitle");
		ie.inlineEditSave();
	}
	
	@Test(priority = 13)
	public void uploadFile()
	{
		Contact_View cv = new Contact_View(driver);
		cv.clickAttachFile();
		UploadFile uf = new UploadFile(driver);
		uf.upload();
		uf.clickattach();
		uf.clickDone();

	}
	
	@Test(priority = 14)
	public void clickOnContact3()
	{
		HomePage hp = new HomePage(driver);
		hp.clickExpand();
		hp.clickvf();
	}
	
	@Test(priority = 15)
	public void setVf()
	{
		VisulForce_Light vfobj = new VisulForce_Light(driver);
		vfobj.setDescLight("testDesc");
		vfobj.clickSave();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
}
