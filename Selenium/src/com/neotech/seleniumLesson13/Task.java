package com.neotech.seleniumLesson13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.util.CommonMethods;

public class Task extends CommonMethods {

	public static void main(String[] args) {
//		TC 1: Upload file and Take Screenshot
//		Navigate to "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload"
//		Upload file
//		Verify file got successfully uploaded and take screenshot

		setUp();

		String filePath = System.getProperty("user.dir")+"/Selenium/screenshots/HRM/screenshot01.png";

		System.out.println(filePath);
		driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys(filePath);
wait(2);
		driver.findElement(By.xpath("//button[text()='Upload File']")).click();
		wait(2);
String expectedText="File upladed";
String actualText=getAlertText();
if (expectedText.equals(actualText)) {
	System.out.println("Test passed");
}else {
	System.out.println("Test failed");
	
	Alert alert = driver.switchTo().alert();

		alert.accept();
		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(sourceFile, new File("screenshots/HRM/screenshot01.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("We did not take a screenshot!");
			wait(2);

			
		}
tearDown();
	}
	}
}
