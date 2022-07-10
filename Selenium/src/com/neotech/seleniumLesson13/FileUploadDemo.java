package com.neotech.seleniumLesson13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.util.CommonMethods;

public class FileUploadDemo extends CommonMethods {

	public static void main(String[] args) {
		

		
setUp();
//TC 1: Upload file and Take Screenshot
//Navigate to "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload"
//Upload file
//Verify file got successfully uploaded and take screenshot

String filePath = System.getProperty("user.dir") + "/screenshots/Lesson13/Homework2.png";

driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys(filePath);
wait(2);

driver.findElement(By.xpath("//button[@class='gwt-Button']")).click();
wait(2);

String expectedText = "File uploaded!";
String actualText = getAlertText();

if (expectedText.equals(actualText)) {
	System.out.println("Test passed!");
} else {
	System.out.println("Test failed!");
}

// A method in our CommonMethods
acceptAlert();

// Take the Screenshot
TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File destination = new File("screenshots/Lesson13/FileUpload.png");
try {
	FileUtils.copyFile(source, destination);
} catch (IOException e) {
	e.printStackTrace();
	System.out.println("The screenshot cannot be saved!");
}

tearDown();
}

}
//
//driver.findElement(By.linkText("File upload")).click();
//String filePath=System.getProperty("user.dir")+"/screenshots/Lesson12/HomeWork1DragAndDrop.png";
//System.out.println(filePath);
////i can give any path in my computer
////This is path of a file in my comuter
////String filePath2="/Users/";
//driver.findElement(By.id("file-upload")).sendKeys(filePath);
//wait(2);
//
//driver.findElement(By.id("file-submit")).click();
//wait(2);
//tearDown();
//
//	}
//
//}
