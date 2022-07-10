package com.neotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class LogInTest extends CommonMethods {

	public static void main(String[] args) {
		
////https://hrm.neotechacademy.com/
		setUp();
		
		//seding the username
		WebElement username=driver.findElement(By.id("txtUsername"));
		
		sendText(username,ConfigsReader.getProperty("username"));
		
		//sending the password
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		
		sendText(password,ConfigsReader.getProperty("password"));

		//click on Login button
		WebElement loginBtn=driver.findElement(By.xpath("//button[@type='submit']"));
		loginBtn.click();
		
		//wait for 3 seconds
		
		wait(3);
		
		
		//validate logIn using the logo
		WebElement logo=driver.findElement(By.id("ohrm-small-logo"));
		if(logo.isDisplayed()) {
			System.out.println("Test Passed");
			
		}
		else {
			System.out.println("Test faailed");
		}
		
	//	If we extnd BaseClass ,then we only access elements of BaseClass
	//if we extend CommonMethods,we access elements from CommonMethods and BaseClass
		
		
		
		tearDown();
		
	}

}
