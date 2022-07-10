package com.neotech.seleniumLesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class LoginWithAdvancedXPath extends CommonMethods {

	public static void main(String[] args) {
		// 1. Navigate to https://hrm.neotechacademy.com/
		// 2. Login to the application by writing Advanced xpath

		
			setUp();

			// Using the grandparent to locate the grand-child
			WebElement username = driver.findElement(By.xpath("//form[@class='form-body']/div[1]/input"));
			sendText(username, ConfigsReader.getProperty("username"));

			// Using the uncle to locate the nephew
			WebElement password = driver
					.findElement(By.xpath("//div[@class='input-field'][1]/following-sibling::div[1]/input"));
			sendText(password, ConfigsReader.getProperty("password"));

			// Using cousin to locate the uncle's son :)
			WebElement loginBtn = driver
					.findElement(By.xpath("//input[@id='txtPassword']/../following-sibling::div/button"));
			loginBtn.click();

			wait(1);

			tearDown();

		}
	}