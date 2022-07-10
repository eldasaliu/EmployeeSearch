package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.util.BaseClass;

public class DashboardPageUsingFactory {

	@FindBy(xpath = "//div[@id='ohrm-small-logo']")
	public WebElement logo;

	@FindBy(id = "account-name")
	public WebElement name;

	public DashboardPageUsingFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
