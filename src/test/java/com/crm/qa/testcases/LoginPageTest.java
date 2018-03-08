package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtil;

public class LoginPageTest extends TestBase

{
	LoginPage login;
	HomePage homepage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		 login=new LoginPage();
	}
	
	@Test(priority=1)
	public void ValidateLoginTitleTest()
	{
		try{
			
		String Title=login.ValidateLoginTitle();
		Assert.assertEquals(Title,"#1 Free CRM for Any Business: Online Customer Relationship Software");
		TestUtil.Capturescreenshot("ValidateLoginTitleTest");
		
		}
		catch(Exception e){
			TestUtil.Capturescreenshot("ValidateLoginTitleTest_Failed");
		}
	}
	
	@Test(priority=2)
	public void ValidateCRMImageTest()
	{
		boolean flag=login.ValidateCRMImage();
		Assert.assertTrue(flag, "Invalid Image");
		TestUtil.Capturescreenshot("ValidateCRMImageTest");
	}
	
	
	@Test(priority=3)
	public void ValidateloginTest()
	{
		homepage=login.Validatelogin(prop.getProperty("Username"), prop.getProperty("Password"));
		//login.Validatelogin("Username", "Password")	;
		TestUtil.Capturescreenshot("ValidateloginTest");
	}
	
		
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
}
