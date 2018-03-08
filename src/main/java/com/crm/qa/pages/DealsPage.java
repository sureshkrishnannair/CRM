package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.crm.qa.base.TestBase;

public class DealsPage extends TestBase {
	
	//Page Objects
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement DealsLogo;
	
	
	//Initiate PageObjects
	
	public DealsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public boolean VerifyDealsButton()
	{
		return DealsLogo.isDisplayed();
		
	}
	

}
