package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.util.CommonMethods;

public class AssertDemo extends CommonMethods{

	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	@Test(enabled = true)
	public void titleValidation() {
		String expectedTitle = "OrangeHRM---";
		String actualTitle = driver.getTitle();

		// 1st way
		// Assert.assertEquals(actualTitle, expectedTitle);

		// 2nd way, You are printing a meaningful message
		Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");

		// if (hard) assertion fails
		// the statement after assertion will not be executed
		System.out.println("Test after assertion.");
	}

	@Test
	public void validationLogo() {
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/img"));
		boolean logoDisplayed = logo.isDisplayed();

		// I am manually setting this variable to false, to fail the test
		logoDisplayed = false;

		// 1st way
		// Assert.assertEquals(logoDisplayed, true);

		// 2nd way
		// Assert.assertEquals(logoDisplayed, true, "Logo is not displayed");

		// 3rd way, only for boolean
		Assert.assertTrue(logoDisplayed, "Logo is not displayed");
	}

}

	
	

