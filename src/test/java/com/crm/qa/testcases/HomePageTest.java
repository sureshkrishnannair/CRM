package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtil;

public class HomePageTest extends TestBase
{
	
	LoginPage login;
	HomePage homepage;
	//TestUtil testutil;
	SoftAssert soft;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		 initialization();
		 login=new LoginPage();
		 homepage=login.Validatelogin(prop.getProperty("Username"), prop.getProperty("Password"));
		 soft=new SoftAssert();		 
	}
	
	@Test(priority=1,enabled=false)
	public void ValidateHomeTitleTest()
	{
		String Title=homepage.ValidateHomeTitle();
		Assert.assertEquals(Title, "CRMPRO");
		TestUtil.Capturescreenshot("ValidateHomeTitleTest");
	}
	
	@Test(priority=2,enabled=false)
	public void ClickonContactLinkTest()
	{
		TestUtil.switchframe();
		homepage.ClickonContactLink();
		TestUtil.Capturescreenshot("ClickonContactLinkTest");
	}
	
	@Test(priority=3,enabled=false)
	public void ClickonNewContactLinkTest() {
		TestUtil.switchframe();
		homepage.ClickonNewContactLink();
		TestUtil.Capturescreenshot("ClickonNewContactLinkTest");
	}
	
	@Test(priority=4,enabled=false)
	public void verifyusernameLabelTest()
	{
		TestUtil.switchframe();
		//Assert.assertTrue(homepage.verifyusernameLabel());
		soft.assertTrue(homepage.verifyusernameLabel(), "Test fail");
		TestUtil.Capturescreenshot("verifyusernameLabelTest");
	}
	
	@Test(priority=5,enabled=true)
	public void CalenderHomeselection() throws IOException
	{
		TestUtil.switchframe();
		homepage.CalenderHomeselection();
	}
	
	/*@AfterMethod
	public void teardown()
	{
		driver.close();
	}*/

}
