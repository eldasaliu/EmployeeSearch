package com.neotech.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest  extends CommonMethods{


	@Test(groups = { "smoke", "regression" })
	public void validLogin() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();

		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(1);
		sendText(login.password, ConfigsReader.getProperty("password"));
		wait(1);

		jsClick(login.logInButton);
		wait(2);

		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();

		// assertion
		Assert.assertEquals(actual, expected, "The account name does NOT match!!");
	}

	@Test(groups = "regression")
	public void emptyPasswordLogin() {

		LoginPageElements login = new LoginPageElements();
		// DashboardPageElements dashboard = new DashboardPageElements();

		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(1);

		click(login.logInButton);
		wait(1);

		String expectedText = "Password cannot be empty";
		String actualText = login.passwordError.getText();

		Assert.assertEquals(actualText, expectedText, "Error message does not match!");

	}

	@Test(groups = "regression")
	public void invalidPasswordLogin() {

		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();

		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(1);

		sendText(login.password, "Hiiii");
		wait(1);

		click(login.logInButton);
		wait(1);

		// Failing on purpose
		String expectedText = "Invalid Credentials";
		String actualText = login.invalidMsg.getText();

		Assert.assertEquals(actualText, expectedText, "Error message does not match!");

	}
}
