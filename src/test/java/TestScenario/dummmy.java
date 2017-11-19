package TestScenario;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dummmy {

	WebDriver driver;
	String contactName=null;
	
	public dummmy(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//generating a unique random number
	/*static double random_num_double = Math.random()*100 + 1;
	static int random_num = (int)(random_num_double);*/
	
	@BeforeTest
	public void launchBrowser()
	{
		LaunchingBrowser lb = new LaunchingBrowser();
		this.driver = lb.launchBrowser();
	}	
	
		
	/*@Test(priority = 1)
	public void loginPage()
	{
		//LogIn logIn = new LogIn(driver);
		LogIn lIn=PageFactory.initElements(driver, LogIn.class);
		lIn.userName("sauraabh007@gmail.com");		
		lIn.passwordmeth("salesforce.com17");
		lIn.loginclick();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	}
	
	@Test(priority = 2)
	public void clickOnContact()
	{
		HomePage contact = new HomePage(driver);
		contact.clickOnContact();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	}
	
	@Test(priority = 3)
	public void clickingNew()
	{
		Contact_Home ch = new Contact_Home(driver);
		ch.clickNewButton();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	}
	
	String cName,id = null;
	@Test(priority = 5)
	public void read_Contact_Name()
	{
		Contact_View vc = new Contact_View(driver);
		cName = vc.view_contact().toString();
		vc.verifyingCname(random_num);
		id = vc.extractURL();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	}
	
	@Test(priority = 6)
	public void writeInSheet() throws IOException
	{
		File file_path = new File("C:\\Users\\Provar\\Desktop\\Book1.xlsx");
		WrittingValuesInExcel we = new WrittingValuesInExcel();
		we.writeDataIntoExcel(file_path, "Sheet1", cName,id);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	}
	
	@Test(priority = 7)
	public void readFromExcel() throws IOException
	{
		File file_path = new File("C:\\Users\\Provar\\Desktop\\Book1.xlsx");
		ReadingValuesFromExcel we = new ReadingValuesFromExcel();
		contactName = we.excelRead(file_path, "Sheet1");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	}
	
	@Test(priority = 8)
	public void clickOnContact2()
		{
			HomePage contact = new HomePage(driver);
			contact.clickOnContact();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		}
	
	@Test(priority = 9)
	public void clickingGoforListView()
	{
		Contact_Home ch = new Contact_Home(driver);
		ch.clickOnGo();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	}

	@Test(priority = 10)
	public void navigatingToRecord()
	{
		listView lv = new listView(driver);
		lv.navigatingToRecord(contactName);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	}
	
	@Test(priority = 11)
	public void editPage()
	{
		Contact_View cv = new Contact_View(driver);
		cv.clickEdit();
		EditPage ep = new EditPage(driver);
		ep.setfirstNameEdit("ContactEdited");
		ep.clickSaveEdit();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	}
	
	@Test(priority = 12)
	public void inlineEditPage()
	{
		InlineEdit ie = new InlineEdit(driver);
		ie.titleDoubleClick();
		ie.setTitle("TestTitle");
		ie.inlineEditSave();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);

	}
	
	
	//@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}*/
}
