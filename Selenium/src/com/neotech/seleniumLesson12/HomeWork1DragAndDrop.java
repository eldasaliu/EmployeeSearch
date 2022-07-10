package com.neotech.seleniumLesson12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.util.CommonMethods;

public class HomeWork1DragAndDrop extends CommonMethods {

	public static void main(String[] args) {
//		Homework 1:
//			Open chrome browser
//			Go to https://demo.seleniumeasy.com/
//			Click on "Others"
//			Click on "Drag and Drop"
//			Drag items 2, 4 and 1 from "Item to Drag" and drop them under "Drop Here"
//			Close the browser

		setUp();

		click(driver.findElement(By.linkText("No, thanks!")));
		wait(1);
		click(driver.findElement(By.linkText("Others")));

		// wait(2);
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.linkText("Drag and Drop"))).click().perform();
		wait(1);
		WebElement drag2 = driver.findElement(By.xpath("//span[text()='Draggable 2']"));
		wait(1);
		WebElement drop2 = driver.findElement(By.id("mydropzone"));
		// action.dragAndDrop(drag2, drop2).perform();
		action.clickAndHold(drag2).moveToElement(drop2).release().perform();
		WebElement drag4 = driver.findElement(By.xpath("//span[text()='Draggable 4']"));
		wait(1);
		WebElement drop4 = driver.findElement(By.id("mydropzone"));
		// action.dragAndDrop(drag4, drop4).perform();
		action.clickAndHold(drag4).moveToElement(drop4).release().perform();
	
		WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable 1']"));
		wait(1);
		WebElement drop1 = driver.findElement(By.id("mydropzone"));
		// action.dragAndDrop(drag1, drop1).perform();
		action.clickAndHold(drag1).moveToElement(drop1).release().perform();
		wait(3);
			
	
		tearDown();
	}

}
