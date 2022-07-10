package com.neotech.seleniumLesson13;

import org.openqa.selenium.By;

import com.neotech.util.CommonMethods;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) {
//		Homework 1: File Upload
//		Upload a file:
//		http://uitestpractice.com/Students/Widgets

		setUp();
		String filePath = System.getProperty("user.dir") + "/screenshots/HRM/screenshot01.png";
		System.out.println(filePath);
		driver.findElement(By.id("image_file")).sendKeys(filePath);
		wait(3);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		wait(5);

		String expectedText = "File Successfully Uploaded";
		String actualText = driver.findElement(By.xpath("//div[@id='upload_response']/div/p")).getText();

		if (expectedText.equals(actualText)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!");
		}

		tearDown();

	}

}
