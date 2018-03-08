package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;
import com.crm.qa.utils.TestUtil;

public class HomePage extends TestBase
{
	
	//PageObjects
	
	@FindBy(xpath="//a [contains(text(),'Contacts')]")
	WebElement ContactsLink;
	
	@FindBy(xpath="//a [contains(text(),'New Contact')]")
	WebElement NewContactsLink;
	
	@FindBy(xpath="//a [contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath="//a [contains(text(),'Task')]")
	WebElement TaskLink;
	
	@FindBy(xpath="//a[contains(text(),'New Task')]")
	WebElement NewTaskLink;
	
	@FindBy(xpath="//td[contains(text(),'User: SURESH KRISHNAN')]")
	WebElement UsernameLabel;
	
//Public HePage
	
	public HomePage()
	{
		
	PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public String ValidateHomeTitle()
	{
		return driver.getTitle();
		
	}
	
	public ContactsPage  ClickonContactLink()
	{
		ContactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage  ClickonDealsLink()
	{
		DealsLink.click();
		return new DealsPage(); 
	}
	
	public TasksPage  ClickonTaskLink()
	{
		TaskLink.click();
		return new TasksPage();
	}
	
	public boolean verifyusernameLabel()
	{
		return UsernameLabel.isDisplayed();
	}
	
	
	
	public void ClickonNewContactLink()
	{		
		Actions action=new Actions(driver);
		action.moveToElement(ContactsLink).build().perform();
		NewContactsLink.click();
		
	}
	
	public void ClickonNewTaskLink()
	{		
		Actions action=new Actions(driver);
		action.moveToElement(TaskLink).build().perform();
		NewTaskLink.click();
		
	}
	
	public void CalenderHomeselection() throws IOException
	{		
		TestUtil.calender_Home();
		
	}

}
