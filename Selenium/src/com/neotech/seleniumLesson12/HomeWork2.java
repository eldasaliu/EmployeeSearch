package com.neotech.seleniumLesson12;

import org.openqa.selenium.By;

import com.neotech.util.CommonMethods;

public class HomeWork2 extends CommonMethods {

	public static void main(String[] args) {
		// https://accounts.google.com/signup
//	Homework 2:
//	    WindowHandle_Demo at com.neotech.lesson07 using the CommonMethods.java
		setUp();

		System.out.println("Title->" + driver.getTitle());
		click(driver.findElement(By.linkText("Help")));
		wait(2);

		switchToChildWindow();
		System.out.println("The child window title is : " + driver.getTitle());
		wait(2);
		driver.close();

		tearDown();

	}

}
