package com.neotech.seleniumLesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class Hw1 extends CommonMethods{

	public static void main(String[] args) {

//		Homework 1: OrangeHRM Login
//	    Navigate to https://hrm.neotechacademy.com/
//	    Login to the application by writing xpath based on "parent and child relation"
		setUp();
		
		
		WebElement username=driver.findElement(By.xpath("//div[@class='input-field']/input[id='txtUsername']"));
		sendText(username,ConfigsReader.getProperty("username"));
		
		WebElement password=driver.findElement(By.xpath("//div[@class='input-field']/input[id='txtPassword']"));
		sendText(password,ConfigsReader.getProperty("password"));
		
		WebElement loginBtn=driver.findElement(By.xpath("//div[@class='button-holder']/button"));
		
		loginBtn.click();
		
		wait(2);
		tearDown();
		}
	}


