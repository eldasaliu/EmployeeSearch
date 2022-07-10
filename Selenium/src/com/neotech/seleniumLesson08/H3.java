package com.neotech.seleniumLesson08;

 
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.util.BaseClass;
import com.neotech.util.ConfigsReader;

public class H3 extends BaseClass {



	public static void main(String[] args) throws InterruptedException {
//		Homework 3:
//	        Add Employee
//	        Open chrome browser
//	        Go to "https://hrm.neotechacademy.com/"
//	        Login into the application
//	        Click on PIM > Add Employee 
//	        Add Employee
//	        Log out 
//	        Quit the browser

		setUp();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//log in
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		Thread.sleep(1000);
		
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
			Thread.sleep(1000);
			//navigate to PIM menu
			driver.findElement(By.xpath("//span[text()='PIM']")).click();	
				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='menu_pim_addEmployee']")));

		
			//click add employee
driver.findElement(By.linkText("Add Employee")).click();
		 	

Thread.sleep(2000);
			driver.findElement(By.id("first-name-box")).sendKeys("l");
			driver.findElement(By.id("last-name-box")).sendKeys("t");
			
			
			//send the emplpyee data
			
			
Thread.sleep(1000);
			//get the select element
			WebElement sl=driver.findElement(By.xpath("//select[@id='location']"));
			Select s=new Select(sl);
			s.deselectByIndex(2);
			// depending on internet speed,
			
			driver.findElement(By.id("modal-save-button"));
			//WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.id("modal-save-button")));
			save.click();

			// we can wait for the save to finish

			// difference between WebDriverWait and FluentWait
//			FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
//			fluentWait.withTimeout(Duration.ofSeconds(20));
//			fluentWait.pollingEvery(Duration.ofSeconds(1));
//
//			// lets try without ignore, in case FluentWait still throws a type of Exception
//			fluentWait.ignoring(ElementClickInterceptedException.class);
//
//			fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_details_tab")));
//
		Thread.sleep(3000);
//
driver.findElement(By.id("account-job")).click();
driver.findElement(By.id("logoutLink")).click();

			
			
			//WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			//Wait.until(ExpectedConditions.elementToBeClickable(By.id("addEmployeeButton")));
			
tearDown();
}

	
}