package com.neotech.seleniumLesson12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class ScreenShotDemo extends CommonMethods{

	public static void main(String[] args) {
			
		
setUp();
//alternativelysendKeys() and .click() methods can be used as well

sendText(driver.findElement(By.id("txtUsername")),ConfigsReader.getProperty("username"));

sendText(driver.findElement(By.id("txtPassword")),ConfigsReader.getProperty("password"));
click(driver.findElement(By.xpath("//button[@type='submit']")));

wait(5);

//first step to create a Screenshot is to create an object (in fact we are downcasting)
TakesScreenshot ts=(TakesScreenshot) driver;//get the camera(or open the camera app on your phone)
////take the screenshot
File sourceFile=ts.getScreenshotAs(OutputType.FILE);

//save the file somewhere
try {
	FileUtils.copyFile(sourceFile, new File("screenshots/HRM/screenshot01.png"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("We did not take a screenshot!");
}
//one liner for line 31 and 34
//FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE)),new File("screenshots/HRM/screenshot01.png");

tearDown();



	}

}
