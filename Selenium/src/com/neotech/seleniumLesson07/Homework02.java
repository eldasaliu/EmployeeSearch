package com.neotech.seleniumLesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.util.BaseClass;

public class Homework02 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// ================= HW_2_Handling Frames =================================
		//
		// 1) Launch the browser and open the site
		// "https://chercher.tech/practice/frames-example-selenium-webdriver"
		// 2) Verify on the page header "Not a Friendly Topic" displayed
		// 3) Click on the Inner Frame Check box
		// 4) Choose baby Cat from Animals dropdown
		// 5) Quit the browser

		setUp();
		WebElement text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
		// boolean isDisplayed=driver.findElement(By.xpath("//span[text()='Not a
		// Friendly Topic']")).isDisplayed();
		// System.out.println(isDisplayed);

		if (text.isDisplayed()) {
			System.out.println(" Not a Friendly Topic is displayed");
		} else {
			System.out.println("Not a Friendly Topic is not displayed");
		}

		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		driver.switchTo().frame("frame3");
		Thread.sleep(2000);

		driver.findElement(By.id("a")).click();
		Thread.sleep(1000);

		driver.switchTo().defaultContent();
		Thread.sleep(1000);

		driver.switchTo().frame("frame2");
		Select select = new Select(driver.findElement(By.id("animals")));
		select.selectByIndex(1);
		Thread.sleep(2000);
		driver.quit();

		tearDown();

	}
}
