package com.neotech.seleniumLesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.util.BaseClass;

public class ExplicitWaitDemo extends BaseClass {

	public static void main(String[] args) {
		//http://uitestpractice.com/Students/Contact
		
		
		setUp();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.linkText("This is a Ajax link")).click();
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		///we create an object of WevDriverwait and we define the driver and the amount of time to wait
		
		//then we define the condition to wait for and wich element this is applied
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("ContactUs"))));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("ContactUs"))));
		
		
		boolean isDisplayed=driver.findElement(By.className("ContactUs")).isDisplayed();
		
		System.out.println(isDisplayed);
		
		tearDown();
	}

}
