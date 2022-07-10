package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class SoftAssertDemo extends CommonMethods{
	// Open Application
		// Verify logo is displayed
		// Enter valid credentials
		// Verify user successfully logged in by verifying account name

		@BeforeMethod
		public void openAndNavigate() {
			setUp();
		}

		@AfterMethod
		public void quitBrowser() {
			tearDown();
		}

		@Test
		public void logoAndLoginValidation() {
			WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/img"));
			boolean logoDisplayed = logo.isDisplayed();

			// I am manually setting this variable to false, to fail the test
			logoDisplayed = false;

			// if (hard) assertions is used, the code will NOT continue executing
			// if (soft) assertions is used, the code will continue executing

			SoftAssert soft = new SoftAssert();
			soft.assertTrue(logoDisplayed, "Logo is not displayed!");

			// Logging in
			sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
			sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
			click(driver.findElement(By.xpath("//button[@type='submit']")));

			String expected = "Jacqueline White";
			String actual = driver.findElement(By.id("account-name")).getText();

			soft.assertEquals(actual, expected, "Account name is not correct!");

			// This will collect all soft test assertions
			// and will decide whether the test passed or failed
			soft.assertAll();

			// If test case failed, execution will stop after assertAll()
			// This statement will NOT be executed
			System.out.println("After assertAll");
		}
	}


