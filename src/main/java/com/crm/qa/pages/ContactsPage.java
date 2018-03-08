package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;
import com.crm.qa.utils.TestUtil;

public class ContactsPage extends TestBase	
{
	
	//Page Objects
	@FindBy(xpath="//legend[contains(text(),'Contact Information')]")
	WebElement ContactInfoLabel;
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement ContactLabel;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="surname")
	WebElement lastname;
	
	@FindBy(xpath="//input[@type='submit' and @class='button']")
	WebElement Submit;
	
	//Initializing
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public boolean VerifyContactInfoLabel()
	{
			return ContactInfoLabel.isDisplayed();
	}
	
	public boolean VerifyContactLabel()
	{
		return ContactLabel.isDisplayed();
	}
	
	/*public void CreateNewContact() throws Exception
	{
		String FN=TestUtil.ReadExcelData("Sheet1", 1, 0);
		String LN=TestUtil.ReadExcelData("Sheet1", 1, 1);
		firstname.sendKeys(FN);
		lastname.sendKeys(LN);
		Submit.click();
		
	}*/
	
	public void CreateNewContact(String FN, String LN)
	{
		firstname.sendKeys(FN);
		lastname.sendKeys(LN);
		Submit.click();
	}
	

}
