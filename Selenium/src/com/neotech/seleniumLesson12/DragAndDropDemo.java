package com.neotech.seleniumLesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.util.CommonMethods;

public class DragAndDropDemo extends CommonMethods {

	public static void main(String[] args) {

		setUp();
		
		//we can use selenium switchTo
		//driver.switchTo().frame(0);
		
		//we can use our own method
		switchToFrame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		wait(3);
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag, drop).perform();
		
		//we can do this in a longer way
	//	action.clickAndHold(drag).moveToElement(drop).release().perform();
		wait(3);
		
		
		tearDown();

	}

}
