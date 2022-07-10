package com.neotech.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class LoginTest extends CommonMethods {

	@Test(groups = "regression")
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
	public void emtyPasswordLogIn() {
		LoginPageElements login = new LoginPageElements();

		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "");

		wait(1);

		jsClick(login.logInButton);
		wait(2);

		String expected = "Password cannot be empty";
		String actual = login.ErrorMessage.getText();

		// assertion
		Assert.assertEquals(actual, expected, "Error message is not displayed");
	}

	@Test(groups = { "smoke", "regression" })
	public void invalidPasswordLogin() {
		LoginPageElements login = new LoginPageElements();

		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(1);
		sendText(login.password, "Hi458");

		wait(1);

		jsClick(login.logInButton);
		wait(2);

		String expected = "Invalid Credentials";
		String actual = login.invalidCredentials.getText();

		// assertion
		Assert.assertEquals(actual, expected, "Error message is not displayed");
	}
}
