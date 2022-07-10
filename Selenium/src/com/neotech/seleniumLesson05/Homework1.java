package com.neotech.seleniumLesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.util.BaseClass;

public class Homework1 extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		

//	HW1: Orange HRM Application Login:
//		Open Chrome browser
//		Go to https://hrm.neotechacademy.com/
//		Enter valid username and password
//		Click on login button
//		Then verify that "span with id account-name" has the text "Jacqueline White".
//		Quit the browser
	
	setUp();
	
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Neotech@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	WebElement logo=driver.findElement(By.xpath("//span[@id='account-name']"));
	
	if(logo.isDisplayed()) {
		System.out.println("The logo with text " + logo.getText()+ " is displayed");
		
	}else {
		System.out.println("The logo is not displayed");
	}
	Thread.sleep(2000);
	driver.quit();
	
	tearDown();
}     
	}