package com.neotech.seleniumLessonReview04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class Screenshotexample extends CommonMethods{

	public static void main(String[] args) {
		//https://hrm.neotechacademy.com/
setUp();

wait(1);

sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
click(driver.findElement(By.xpath("//button[@type='submit']")));
click(driver.findElement(By.xpath("//span[text()='PIM']")));//button[@type='submit'];
click(driver.findElement(By.linkText("Employee List")));
//wait(5);
//waiting for the visibility of Rows
//For fun: You can take the screenshot of the forth row

waitForClickability(driver.findElement(By.xpath("//table[@id='employeeListTable']/tbody/tr[4]/td")));

//Casting
//we are converting from one data type webDriver to take screenshot data type  this is Casting
//Taking the sceernshot of the whole page

//TakesScreenshot ts = (TakesScreenshot) driver;
//File sourceFile = ts.getScreenshotAs(OutputType.FILE);
////File destination=new File("screenshots/Lesson13/Homework2.png")
//
//try {
//	FileUtils.copyFile(sourceFile, new File("screenshots/HRM.png"));
//	
//	System.out.println("We did take a Screenshot!");
//} catch (IOException e) {
//	System.out.println("We did not  take a Screenshot");
//}//with try catch is better (if we are not able to catch the file we should be able to close the page and if with Throw declaration the code won't continue
//wait(1);


//Takng a screenshot of a WebElement
//WebElement table=driver.findElement(By.id("employeeListTable"));
//
TakesScreenshot ts = (TakesScreenshot) driver;
File sourceFile = ts.getScreenshotAs(OutputType.FILE);
File destination=new File("screenshots/HRM.png");

try {
FileUtils.copyFile(sourceFile, destination);
	
	System.out.println("We did take a Screenshot!");
} catch (IOException e) {
System.out.println("We did not  take a Screenshot");
}
wait(1);
tearDown();

	

	}
}
