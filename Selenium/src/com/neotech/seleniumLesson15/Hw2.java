package com.neotech.seleniumLesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class Hw2 extends CommonMethods{

	public static void main(String[] args) {
//		Homework 2: OrangeHRM Login
//	    Navigate to https://hrm.neotechacademy.com/
//	    Login to the application by writing xpath based on "following and preceding siblings

	setUp();
	
	
	WebElement username=driver.findElement(By.xpath("//div[@class='input-field'][2]/preceding-sibling::div/input"));
	sendText(username,ConfigsReader.getProperty("username"));
	
	WebElement password=driver.findElement(By.xpath("//img[@class='icon password-icon']/following-sibling::input"));
	sendText(password,ConfigsReader.getProperty("password"));
	
	WebElement loginBtn=driver.findElement(By.xpath("//div[@class='input-field'][2]/following-sibling::div"));
	
	loginBtn.click();
	
	wait(2);
	tearDown();
	}

}
