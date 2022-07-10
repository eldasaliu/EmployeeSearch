package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.util.CommonMethods;

public class DataProviderDemo  extends CommonMethods{

	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	@Test(dataProvider = "userData")
	public void LoginFunctionality(String username, String password) {
		WebElement usernameBox = driver.findElement(By.id("txtUsername"));
		sendText(usernameBox, username);

		WebElement passwordBox = driver.findElement(By.id("txtPassword"));
		sendText(passwordBox, password);

		wait(2);

		click(driver.findElement(By.xpath("//button[@type='submit']")));
	}

	@DataProvider(name = "userData")
	public Object[][] getData() { // username //password
		// 1st test: Admin Neotech123
		// 2nd test: Sema Admin123
		// 3rd test: Yusuf Kurt123

		Object[][] credentials = { { "Admin", "Neotech123" }, { "Sema", "Admin123" }, { "Yusuf", "Kurt123" } };
		return credentials;
	}

}


