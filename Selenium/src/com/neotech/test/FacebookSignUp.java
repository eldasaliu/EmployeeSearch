package com.neotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.util.CommonMethods;

public class FacebookSignUp extends CommonMethods {

	public static void main(String[] args) {
		// https://www.facebook.com/r.php
setUp();

WebElement month =driver.findElement(By.id("month"));

selectDropDown(month, 8);
wait(3);
//we can do this in 1 line
selectDropDown(driver.findElement(By.id("month")),10);

WebElement day =driver.findElement(By.id("day"));

selectDropDown(day,"10");
wait(5);

tearDown();
	}

}
