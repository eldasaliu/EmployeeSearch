package com.neotech.lesson03;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class HomeWork2 extends CommonMethods{
@BeforeMethod
public void openBrowser()throws IOException {
	setUp();
}
	@AfterMethod
public void quitBrowser() {
	tearDown();
	}	
	
	@Test
public void addEmployee() {
	sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
	sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
	click(driver.findElement(By.xpath("//button[@type='submit']")));
	wait(2);

	AddEmployee add = new AddEmployee();
	click(add.pim);
	wait(5);
	click(add.addEmp);
	wait(10);
	
	SoftAssert soft=new SoftAssert();
	WebElement fullName=driver.findElement(By.xpath("//label[text()='Employee Full Name']"));
boolean emmpNameDisplayed=fullName.isDisplayed();
soft.assertTrue(emmpNameDisplayed,"Full Name not displayed");

boolean idDisplayed=add.id.isDisplayed();
soft.assertTrue(idDisplayed,"Employee Id is not displayed");

boolean locationDisplayed=add.location.isDisplayed();
soft.assertTrue(locationDisplayed,"Employee location is not displayed");

soft.assertAll();
wait(2);
sendText(add.fname, "James");
wait(1);
sendText(add.lname, "Dray");
wait(1);
selectDropDown(add.select,"London Office");
wait(1);
click(add.save);
waitForVisibility(add.details);
boolean confirm=add.details.isDisplayed();
Assert.assertTrue(confirm,"Employee is not be added");
wait(2);
//	String Fname="Liab";
//	String Lname="Tacy";
//	driver.findElement(By.id("first-name-box")).sendKeys(Fname);
//	driver.findElement(By.id("last-name-box")).sendKeys(Lname);

//WebElement dropdown=driver.findElement(By.id("location"));
//Select sel=new Select(dropdown);
//sel.selectByValue("string:11");
//
//click(driver.findElement(By.id("modal-save-button")));
////waitForVisibility(driver.findElement(By.id("pimPersonalDetailsForm")));
//wait(5);
////WebElement Detail=driver.findElement(By.id("personal_details_tab"));
////
////Assert.assertEquals(Detail.isDisplayed(),"Employee added succesfully");
////wait(4);
//
//String actualN=driver.findElement(By.xpath("//*[@id='pim.navbar.employeeName']")).getText();
//String expectenN="Liab Tacy";
//Assert.assertEquals(actualN, expectenN,"Employee name does not match!");
 
}
}

