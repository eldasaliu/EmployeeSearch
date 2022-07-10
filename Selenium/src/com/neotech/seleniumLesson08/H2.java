package com.neotech.seleniumLesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.util.BaseClass;

public class H2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		Homework 1: Use FluentWait
//      Verify element is enabled
//      Open chrome browser
//      Go to "https://the-internet.herokuapp.com/"
//      Click on the "Dynamic Controls" link
//      Click on enable button
//      Enter "Hello" and verify text is entered successfully
//      Close the browser

		setUp();
		driver.findElement(By.linkText("Dynamic Controls")).click();
		Thread.sleep(1000);
		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));

		FluentWait<WebDriver> Fwait = new FluentWait<WebDriver>(driver);
		Fwait.withTimeout(Duration.ofSeconds(100));
		Fwait.pollingEvery(Duration.ofSeconds(1));
		driver.findElement(By.xpath("//form[@id='input-example']/button")).click();
		Fwait.until(ExpectedConditions.elementToBeClickable(textbox));
		textbox.sendKeys("Hello");

		System.out.println("Enabled?" + textbox.isEnabled());
		System.out.println("Hello is displayed?" + textbox.isDisplayed());
		Thread.sleep(2000);
		tearDown();

	}

}
