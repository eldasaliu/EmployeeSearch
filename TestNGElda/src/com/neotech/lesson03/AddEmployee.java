package com.neotech.lesson03;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.util.CommonMethods;

public class AddEmployee extends CommonMethods {
@FindBy(xpath="//span[text()='PIM']")
public WebElement pim;
@FindBy(id="menu_pim_addEmployee")
public WebElement addEmp;
@FindBy(xpath="//label[text()='Employee Full Name']")
public WebElement fullName;
@FindBy(xpath="//label[text()='Employee Id']")
public WebElement id;
@FindBy(xpath="//label[text()='Location']")
public WebElement location;
@FindBy(id="first-name-box")
public WebElement fname;

@FindBy(id="last-name-box")
public WebElement lname;
@FindBy(id="location")
public WebElement select;
@FindBy(id="modal-save-button")
public WebElement save;
@FindBy(xpath="//h4[text()='Personal Details']")
public WebElement details;
public AddEmployee(){
	PageFactory.initElements(driver, this);
}
}
