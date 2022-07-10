package com.neotech.lesson01;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class H1 extends CommonMethods {


//		Homework 1: HRMS Application Negative Login: 
//
//		    1. Open chrome browser
//		    2. Go to "https://hrm.neotechacademy.com/"
//		    3. Enter valid username
//		    4. Leave password field empty
//		    5. Verify error message with text "Password cannot be empty" is displayed.

		@BeforeMethod
		public void openBrowser()throws IOException {
			setUp();
		}
			@AfterMethod
		public void quitBrowser() {
			tearDown();
			}	
			
			@Test
		public void LoginTest() {
			sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
			sendText(driver.findElement(By.id("txtPassword")), "");
			click(driver.findElement(By.xpath("//button[@type='submit']")));
			wait(2);

	String expectedMessage="Password cannot be empty";
	String actualMessage=driver.findElement(By.id("txtPassword-error")).getText();
	if(actualMessage.equals(expectedMessage)) {
		System.out.println("Test Passed");
		
	}else
	{
		System.out.println("Test failed");
		
	}
	}
			
}
