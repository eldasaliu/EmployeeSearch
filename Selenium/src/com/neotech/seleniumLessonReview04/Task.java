package com.neotech.seleniumLessonReview04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.util.CommonMethods;

public class Task extends CommonMethods {

	public static void main(String[] args) { 
		
		setUp();
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		wait(3);
//		Actions action = new Actions(driver);
//		
//		action.clickAndHold(drag).moveToElement(drop).release().perform();
//		
		WebElement number2 = driver.findElement(By.name("two"));
		//action.clickAndHold(number2).moveToElement(number).release().perform();
		WebElement number7 = driver.findElement(By.name("seven"));
		WebElement number11 = driver.findElement(By.name("eleven"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(number2).moveToElement(number7).pause(1000).moveToElement(number11).release().perform();
wait(1);
//Double click
WebElement doubleClick=driver.findElement(By.name("doubleClick"));
//clicking two times doesn't work
//doubleclick.click();
action.dClick(doubleClick).perform();



		tearDown();
	}

}
