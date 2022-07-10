package com.neotech.seleniumLesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.util.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		TC 2: Orange HRM Application Negative Login: 
//			Open Chrome browser
//			Go to https://hrm.neotechacademy.com/
//			Enter valid username
//			Leave password field empty
//			Verify error message with text "Password cannot be empty" is displayed.
		setUp();
		
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement emptypassword=driver.findElement(By.xpath("//*[@id=\"txtPassword-error\"]"));
if(emptypassword.isDisplayed()) {
	System.out.println("Password cannot be empty is displayed");
}else {
	System.out.println("Password cannot be empty is not displayed");
	
	Thread.sleep(2000);
	driver.quit();
	
	tearDown();
}
}
}