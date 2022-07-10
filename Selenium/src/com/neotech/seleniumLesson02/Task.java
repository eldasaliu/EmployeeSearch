package com.neotech.seleniumLesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task {

	public static void main(String[] args) throws InterruptedException {
//		// Test Case
//		Open chrome browser
//		Go to “http://demo.guru99.com/test/newtours/”
//		Click on Register Link
//		Fill out just
//		First Name:	
//		Last Name:	
//		Phone:	
//		Email:	
//		And Click Submit
		
			System.setProperty("webdriver.chrome.driver", "\\Users\\Elda\\eclipse-workspace_b3\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/");
			driver.findElement(By.linkText("REGISTER")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("Elda");
			driver.findElement(By.name("lastName")).sendKeys("Saliu");
			driver.findElement(By.name("phone")).sendKeys("8622823731");
			driver.findElement(By.id("userName")).sendKeys("eldamjedis3@gmail.com");
			driver.findElement(By.name("Submit")).click();
			
			driver.quit();
	}

}
