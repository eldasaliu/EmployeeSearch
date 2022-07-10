package com.neotech.seleniumLesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.util.CommonMethods;

public class GoogleTest extends CommonMethods {
	public static void main(String[] args) {
		setUp();

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Bitcoin");
		wait(3);

		// Sending keyboard keys
		searchBox.sendKeys(Keys.ENTER);
		wait(3);

		tearDown();

	}

}
