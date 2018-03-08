package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	
	//Page Objects
	
	@FindBy(name="username")
	WebElement Loginname;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement Signupbutton;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement CrmLogo;
	
	
	//Initializing PageObjects
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String ValidateLoginTitle()
	{
		return driver.getTitle();
	}
	
	public boolean ValidateCRMImage()
	{
			return CrmLogo.isDisplayed();
	}
	
	public HomePage Validatelogin(String Un, String Pwd)
	{
		Loginname.sendKeys(Un);
		Password.sendKeys(Pwd);
		 loginbutton.click();
		 return new HomePage();
		
	}


}
