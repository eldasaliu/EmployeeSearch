package com.neotech.seleniumLesson07;

import org.openqa.selenium.By;

import com.neotech.util.BaseClass;

public class Task extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		Task & Break until 9:15
//		TC 1: Frame verification
//		Open chrome browser
//		Go to https://demoqa.com/frames
//		Verify the headers in both frames
//		Quit the browser
		
		
		setUp();
		//Be careful!There may be a lot of iframes
		//driver.switchTo().frame(0);
		driver.switchTo().frame("frame1");
		String frame1Text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("The text in the first frame->"+frame1Text);
		//This is crucial     if we have multiply frames Interview questions
		//1 first we have to switch from the first frame than to the child frame
		driver.switchTo().defaultContent();//
		driver.switchTo().frame("frame2");
		//Locating an element inside the second frame
		String frame2Text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("The text in the second frame -> " + frame2Text);
		Thread.sleep(2000);
		//WebElement frame1=driver.findElement(By.)
		
	}

}
