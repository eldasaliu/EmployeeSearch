package com.neotech.seleniumLesson12;

import org.openqa.selenium.By;

import com.neotech.util.CommonMethods;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) {
//		Homework 1:
//		    FrameDemo at com.neotech.lesson07 using the CommonMethods.java
//http://uitestpractice.com/Students/Switchto

		setUp();

		switchToFrame(0);

		sendText(driver.findElement(By.id("name")), "Elda");
		wait(2);
		driver.switchTo().defaultContent();

		switchToFrame("iframe_a");
		sendText(driver.findElement(By.id("name")), "Amaris");
		wait(2);
		driver.switchTo().defaultContent();
		// Switch to the frame by WebElement

		switchToFrame(driver.findElement(By.xpath("//iframe[@name='iframe_a']")));
		sendText(driver.findElement(By.id("name")), "Liam");
		wait(2);

		tearDown();
	}
}