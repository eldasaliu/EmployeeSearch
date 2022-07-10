package com.neotech.seleniumLesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.util.BaseClass;

public class H1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		Homework 1: Use WebDriverWait
//        Verify element is enabled
//        Open chrome browser
//        Go to "https://the-internet.herokuapp.com/"
//        Click on the "Dynamic Controls" link
//        Click on enable button
//        Enter "Hello" and verify text is entered successfully
//        Close the browserd
		// <a href="/dynamic_controls">Dynamic Controls</a>

		setUp();
		driver.findElement(By.linkText("Dynamic Controls")).click();
		Thread.sleep(1000);
		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));

		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.xpath("//form[@id='input-example']/button")).click();
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='input-example']/button")));
		textbox.sendKeys("Hello");

		System.out.println("Enabled?" + textbox.isEnabled());
		System.out.println("Hello is displayed?" + textbox.isDisplayed());

		Thread.sleep(2000);

		tearDown();
	}

}
