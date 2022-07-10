package com.neotech.seleniumLesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.util.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//=================   HW_2_Handling Frames =================================
//
//1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
//2) Verify on the page header "Not a Friendly Topic" displayed
//3) Click on the Inner Frame Check box
//4) Choose baby Cat from Animals dropdown
//5) Quit the browser
		
		
		setUp();
		System.out.println(driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText());
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		Select sl=new Select(driver.findElement(By.id("animals")));
		
		
		sl.selectByVisibleText("Baby Cat");
		//sl.selectByIndex(1);
		Thread.sleep(2000);
		
	
		
		tearDown();
		
	}

}
