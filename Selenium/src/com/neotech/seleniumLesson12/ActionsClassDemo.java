package com.neotech.seleniumLesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.util.CommonMethods;

public class ActionsClassDemo extends CommonMethods {

	public static void main(String[] args) {

		//https://www.amazon.com/
		setUp();
		Actions action=new Actions(driver);
		//Do not forget to add perform method
		action.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).perform();
		WebElement el=driver.findElement(By.id("nav-flyout-ya-newCust"));

		if (el.getText().contains("Start")) {
			System.out.println("Menu is displayed!");

		} else {
			System.out.println("Menu not displayed!");
		}

		wait(3);

		// how do we do a right click? - do not forget .perform();
		action.contextClick(el).perform();

		wait(3);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		// go to the search box ---> click on it ---> search books ---> double click
		// ----> call perform
		action.moveToElement(searchBox).click().sendKeys("books").doubleClick().perform();
		wait(3);

		
		
	}

}
