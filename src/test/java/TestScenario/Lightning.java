package TestScenario;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Lightning {
	
	WebDriver driver;
	String contactName=null;
	
	static double random_num_double = Math.random()*100 + 1;
	static int random_num = (int)(random_num_double);
	
	@BeforeTest
	public void launchBrowser()
	{
		Classic classic =new Classic();
		this.driver= classic.launchBrowser();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority = 1)
	public void loggingIn()
	{
		LogIn lIn = new LogIn(driver);
		//LogIn lIn=PageFactory.initElements(driver, LogIn.class);
		lIn.userName("sauraabh007@gmail.com");		
		lIn.passwordmeth("salesforce.com17");
		lIn.loginclick();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 2)
	public void navigatingToobject()
	{	
		clickingContactObjectLight cco = new clickingContactObjectLight(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		cco.clickAppMenuBtn();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		cco.clickContactObj();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	@Test(priority = 3)
	public void clickNew()
	{
		Contact_Home_Light chl = new Contact_Home_Light(driver);
		chl.clickNewButton();
	}
	
	@Test(priority = 4)
	public void setValuesNewPage() throws InterruptedException
	{
		New_Contact_Light nc = new New_Contact_Light(driver);
		
		nc.save_Button();
		nc.error_message();
		//nc.salu("Mr.");
		nc.first_Name("Contact");
		nc.last_Name("Name");
		nc.setTitle("test");
		nc.clickLookup();
		nc.save_Button();
	}
	
	String cName,id = null;
	@Test(priority = 5)
	public void read_Contact_Name()
	{
		Contact_View_Light vc = new Contact_View_Light(driver);
		cName = vc.view_contact().toString();
		vc.verifyingCname(random_num);
		id = vc.extractURL();
	}
	
	@Test(priority = 6)
	public void writeInSheet() throws IOException
	{
		String filePathString = System.getProperty("user.dir") + "\\Book2.xlsx";
		File file_path = new File(filePathString);
		WrittingValuesInExcel we = new WrittingValuesInExcel();
		we.writeDataIntoExcel(file_path, "Sheet1", cName,id);
	}
	
	@Test(priority = 7)
	public void readFromExcel() throws IOException
	{
		String filePathString = System.getProperty("user.dir") + "\\Book2.xlsx";
		File file_path = new File(filePathString);
		ReadingValuesFromExcel we = new ReadingValuesFromExcel();
		contactName = we.excelRead(file_path, "Sheet1");
	}
	
	@Test(priority = 8)
	public void navigatingToObject2()
	{	
		clickingContactObjectLight cco = new clickingContactObjectLight(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		cco.clickAppMenuBtn();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		cco.clickContactObj();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	@Test(priority = 9)
	public void navigatingToRecord()
	{
		listView_Light lv = new listView_Light(driver);
		lv.navigatingToRecord(contactName);
	}
	
	@Test(priority = 10)
	public void editPage()
	{
		Contact_View_Light cv = new Contact_View_Light(driver);
		cv.clickEditButton();
		EditPage_Light ep = new EditPage_Light(driver);
		ep.setfirstNameEdit("Edited");
		ep.clickSaveEdit();
		
	}
	
	@Test(priority = 11)
	public void uploadFile() throws AWTException
	{

		UploadFile_Light uf = new UploadFile_Light(driver);
		uf.upload();
		uf.done();
		
	}
	
	@Test(priority = 12)
	public void inlineEditPage()
	{
		InlineEdit_Light ie = new InlineEdit_Light(driver);
		ie.clickdetails();		
		ie.titleDoubleClick();
		ie.setTitle("EditedInline");
		ie.inlineEditSave();
		
	}
	
	@Test(priority = 13)
	public void navigatingToobject3()
	{	
		clickingContactObjectLight cco = new clickingContactObjectLight(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		cco.clickAppMenuBtn();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		cco.findElement("visualForce");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		cco.clickVf();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
	}
	
	@Test(priority = 14)
	public void setVf()
	{
		VisulForce_Light vfobj = new VisulForce_Light(driver);
		vfobj.setDesc("testDesc");
		vfobj.clickSave();
	}
	
	@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}
}
