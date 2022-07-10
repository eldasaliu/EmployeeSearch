package com.neotech.seleniumLesson14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.util.BaseClass;

public class LoginPageUsingFactory {
	@FindBy(id = "txtUsername")
	public WebElement username;
	@FindBy(name = "txtPassword")
    public WebElement password;
	@FindBy(xpath="//span[@id='txtPassword-error']")
    public WebElement WrongPasw;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginBtn;
	@FindBy(id="toast-container")
	public WebElement invalidpsw;


	public LoginPageUsingFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	}


}
