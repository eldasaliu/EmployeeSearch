package com.neotech.seleniumLesson13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.neotech.util.CommonMethods;

public class HomeWork2 extends CommonMethods{

	public static void main(String[] args) {
//		Homework 2: Scroll Down Continuously
//		Open chrome browser
//		Go to "https://the-internet.herokuapp.com/"
//		Click on the "Infinite Scroll" link
//		Scroll down by 500 pixels 10 times
//		Wait 1 second between each scroll
//		Scroll into the view of tag h3 (Infinite Scroll)
//		Close the browser
		
		setUp();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.linkText("Infinite Scroll")));
		wait(2);
		for(int i=0;i<10;i++);
		js.executeScript("window.scrollBy(0,500)");
		wait(1);
		WebElement view = driver.findElement(By.xpath("//h3[text()='Infinite Scroll']"));
		js.executeScript("arguments[0].scrollIntoView(true)", view);
		wait(3);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File("screenshots/Lesson13/Homework2.png"));
			System.out.println("We did take a Screenshot!");
		} catch (IOException e) {
			System.out.println("We did not  take a Screenshot");
		}

		tearDown();
		
	}

}
