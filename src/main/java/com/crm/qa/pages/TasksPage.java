package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.utils.TestUtil;

public class TasksPage extends TestBase

{
	
	//Page Objects
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement Task_button;
	
	@FindBy (xpath="//a[contains(text(),'New Task')]")
	WebElement NewTask_Button;
	@FindBy (xpath="//legend[contains(text(),'Task Information')]")
	WebElement Title_NewTask;
	
	@FindBy(xpath="//input[@name='title' and @id='title']")
	WebElement Title_Field;
	
	@FindBy(xpath="//img[@title='Date selector']")
	WebElement Calender_Selection;
	
	
	//Initialization
	public TasksPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public boolean VerifyTaskPage()
	{
		return Task_button.isDisplayed();
	}
	
	public void createnewTask() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(Task_button).build().perform();;
		//Thread.sleep(3000);
		NewTask_Button.click();
	}
	
	public void calenderselecttoday()
	{
		
	}
	
	
	

}
