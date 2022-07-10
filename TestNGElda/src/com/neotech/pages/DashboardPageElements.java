package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.util.CommonMethods;

public class DashboardPageElements extends CommonMethods{

	@FindBy(xpath="//span[@id='account-name']")
	public WebElement accountName;
	
	
	public DashboardPageElements()
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
