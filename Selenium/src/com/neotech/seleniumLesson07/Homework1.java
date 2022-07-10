package com.neotech.seleniumLesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.util.BaseClass;

public class Homework1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

//1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
//2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
//3) On the Child Window, Enter your email ID and submit.
//4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//5) Close the Child window on which credentials are displayed.Switch to the parent window.
//6) Quit all browsers
		setUp();
		
		driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();
		Thread.sleep(2000);
		
		Set<String> allWindowHandles=driver.getWindowHandles();
	
	Iterator<String>it=allWindowHandles.iterator();

    String window1=it.next();
	String window2=it.next();
	driver.switchTo().window(window2);
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("elda@gmail.com");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	driver.close();
	Thread.sleep(2000);
	driver.switchTo().window(window1);
	Thread.sleep(2000);
	driver.quit();
	
			tearDown();
	}


}