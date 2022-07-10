package com.neotech.seleniumLesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.util.CommonMethods;

public class Task extends CommonMethods {

	public static void main(String[] args) {
//		Task 2:
//			Go to https://accounts.lambdatest.com/register
//			Find the Password Element and enter a password
//			Find the Show span as a nephew of the password element and click on it
//			Find the Business Email as a cousin of the password element and enter an email
//			Close the browser
		
		// https://the-internet.herokuapp.com/key_presses
		setUp();

		wait(1);

		WebElement textBox = driver.findElement(By.id("target"));

		textBox.sendKeys(Keys.TAB);
		wait(1);

		textBox.sendKeys(Keys.ESCAPE);
		wait(1);

		textBox.sendKeys(Keys.ENTER);
		wait(1);

		tearDown();
	}


		
		
		


}
