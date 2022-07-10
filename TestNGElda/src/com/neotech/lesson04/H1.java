package com.neotech.lesson04;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class H1 extends CommonMethods {
//	Open chrome browser
//	Go to "https://hrm.neotechacademy.com/"
//	Login to the application
//	Add 3 different Employees and Create Login Details by providing:
//	First Name
//	Last Name
//	Username
//	Password
//	Verify Employee has been added successfully and take screenshot (you must have 3 different screenshots)
//	Close the browser
//	Specify a group for this test case, add it into specific suite and execute from the xml file.

	@BeforeMethod(alwaysRun = true)
	public void openAndNavigate() {
		setUp();
	}

	@AfterMethod(alwaysRun = true)
	public void quitBrowser() {
		tearDown();
	}
	
	
	
		@Test(dataProvider="getData", groups= {"regression"})
	public void test(String firstName, String lastName, String username, String password) {

sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button[@type='submit']")));

		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		driver.findElement(By.linkText("Add Employee")).click();

		wait(1);

		
		sendText(driver.findElement(By.id("first-name-box")), firstName);
		sendText(driver.findElement(By.id("last-name-box")), lastName);

		String empID = driver.findElement(By.id("employeeId")).getAttribute("value");

		WebElement dropdown = driver.findElement(By.id("location"));
		Select sel = new Select(dropdown);
		sel.selectByValue("string:22");

		wait(1);

		jsClick(driver.findElement(By.id("hasLoginDetails")));
		wait(1);

		sendText(driver.findElement(By.id("username")), username);
		sendText(driver.findElement(By.id("password")), password);
		sendText(driver.findElement(By.id("confirmPassword")), password);

	 wait(1);

		click(driver.findElement(By.id("modal-save-button")));
		 
		
	waitForVisibility(driver.findElement(By.xpath("//*[@id='personal_details_tab']")));
		String actualId = driver.findElement(By.id("employeeId")).getAttribute("value");

	Assert.assertEquals(actualId, empID, "Employee IDs do not match!");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("screen/" + firstName + "_" + lastName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = { { "Reia", "Saame", "Reia445", "Saame@7ljr6" }, { "Timm", "Jann", "Timm3t14", "Jann@9843" },
			{ "Art", "Jay", "Art345", "Jay@878$9" } 
		};

		return data;
	}
}
