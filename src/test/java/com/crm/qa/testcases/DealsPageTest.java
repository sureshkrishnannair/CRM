package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtil;

public class DealsPageTest extends TestBase
{
	LoginPage login;
	HomePage homepage;
	TestUtil testutil;
	SoftAssert soft;
	DealsPage dealspage;
	
	
	public DealsPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		 initialization();
		 login=new LoginPage();
		 homepage=login.Validatelogin(prop.getProperty("Username"), prop.getProperty("Password"));
		 testutil=new TestUtil();
		 soft=new SoftAssert();
		 dealspage=new DealsPage();
		 testutil.switchframe();
		 dealspage=homepage.ClickonDealsLink();
		 
	}
	
	@Test(priority=1)
	public void VerifyDealsButtonTest()
	{
		soft.assertTrue(dealspage.VerifyDealsButton(), "IssueDealsButton");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
