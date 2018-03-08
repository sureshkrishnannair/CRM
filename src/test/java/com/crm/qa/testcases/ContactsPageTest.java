package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtil;

public class ContactsPageTest extends TestBase
{
	TestUtil testutil;
	LoginPage login;
	HomePage homepage;
	ContactsPage contactpage;
	SoftAssert soft;
	public ContactsPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		 initialization();
		 testutil=new TestUtil();
		 soft=new SoftAssert();
		 contactpage=new ContactsPage();
		 login=new LoginPage();
		 homepage=login.Validatelogin(prop.getProperty("Username"), prop.getProperty("Password"));
		 testutil.switchframe();
		 contactpage= homepage.ClickonContactLink();
		 testutil.Implicitwait();
		 Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void VerifyContactLabelTest()
	{
			soft.assertTrue(contactpage.VerifyContactLabel(), "Test failed for ContactLabel");

	}
	
	
	@Test(priority=2)
	public void VerifyContactInfoLabelTest() throws InterruptedException
	{
		homepage.ClickonNewContactLink();
		//testutil.Implicitwait();
		Thread.sleep(3000);
		contactpage.VerifyContactInfoLabel();
	}
	
	@Test(priority=3)
	public void CreateNewContactTest() throws Exception
	{
		homepage.ClickonNewContactLink();
		contactpage.CreateNewContact(TestUtil.ReadExcelData("Sheet1", 1, 0),TestUtil.ReadExcelData("Sheet1", 1, 1));
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	

}
