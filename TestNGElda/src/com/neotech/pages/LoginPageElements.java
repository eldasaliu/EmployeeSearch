package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.util.CommonMethods;

public class LoginPageElements extends CommonMethods{

	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(css="button[type='submit']")
	public WebElement logInButton;

	@FindBy(xpath="//div[@class='toast-message']")
	public WebElement invalidCredentials;
	
	@FindBy(id="txtPassword-error")
	public WebElement ErrorMessage;
	
	public LoginPageElements()
	{
		PageFactory.initElements(driver, this);
	}
	
}
