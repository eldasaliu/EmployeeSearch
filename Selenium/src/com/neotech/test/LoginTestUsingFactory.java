package com.neotech.test;

import com.neotech.pages.DashboardPageUsingFactory;
import com.neotech.pages.LoginPageUsingFactory;
import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class LoginTestUsingFactory extends CommonMethods {

	public static void main(String[] args) {
		// https://hrm.neotechacademy.com/

				setUp();

				// At this point we are NOT locating the elements
				// We are just telling how the elements will be located
				LoginPageUsingFactory login = new LoginPageUsingFactory();
				DashboardPageUsingFactory dashboard = new DashboardPageUsingFactory();

				// sending the username
				sendText(login.username, ConfigsReader.getProperty("username"));

				// sending the password
				sendText(login.password, ConfigsReader.getProperty("password"));

				// click on Login button
				login.loginBtn.click();

				wait(3);

				// validate login using the logo

				if (dashboard.logo.isDisplayed()) {
					System.out.println("Test Passed!");
				} else {
					System.out.println("Test Failed!");
				}

				// Let's validate that "Jacqueline White" is diplayed
				String expectedName = "Jacqueline White";

				if (dashboard.name.getText().equals(expectedName)) {
					System.out.println(expectedName + " is displayed!");
				} else {
					System.out.println(expectedName + " is NOT displayed!");
				}

				tearDown();
			}

		

	
}
