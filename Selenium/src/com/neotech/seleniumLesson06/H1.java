package com.neotech.seleniumLesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.util.BaseClass;

public class H1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		Homework 1:
//	        Amazon Department List Verification
//	        Open chrome browser
//	        Go to "http://amazon.com/"
//	        Verify how many department options available.
//	        Print each department 
//	        Select Computers
//	        Quit browser
		setUp();
		
		WebElement AmazonDepartments=driver.findElement(By.id("searchDropdownBox"));
		
		Select selDD=new Select(AmazonDepartments);
		List<WebElement> AmazonList=selDD.getOptions();
		System.out.println("The size of the list is " + AmazonList.size());
	
	for(WebElement list:AmazonList) {
		String text=list.getText();
		System.out.println(text);
	}
	selDD.selectByVisibleText("Computers");
	Thread.sleep(2000);
	
	driver.quit();
	tearDown();
	
}
}
