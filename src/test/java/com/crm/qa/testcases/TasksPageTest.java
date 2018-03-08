package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;
import com.crm.qa.utils.TestUtil;

public class TasksPageTest extends TestBase 
{
	LoginPage login;
	HomePage homepage;
	TasksPage task;
	
	
	public TasksPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		login=new LoginPage();
		//TestUtil.switchframe();
		login.Validatelogin(prop.getProperty("Username"), prop.getProperty("Password"));
		homepage=new HomePage();
		task=new TasksPage();
		
	}
	
	@Test(priority=2,enabled=false)
	public void VerifyTaskPageTest()
	{
		TestUtil.switchframe();
		task.VerifyTaskPage();
	}
	
	@Test(priority=1,enabled=true)
	public void createnewTaskTest() throws InterruptedException
	{
		TestUtil.switchframe();
		//task.createnewTask();
		homepage.ClickonNewTaskLink();
		
		Thread.sleep(3000);
		
		task.calenderselecttoday();
	}
	
	@Test(priority=3,enabled=false)
	public void calenderselecttodayTest()
	{
		task.calenderselecttoday();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}


}
