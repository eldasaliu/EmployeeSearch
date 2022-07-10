package com.neotech.test;

import com.neotech.pages.DashboardPage;
import com.neotech.pages.LoginPage;
import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class LoginTestUsingPage extends CommonMethods{


	// In my Test class I am not locating any elements

		public static void main(String[] args) {
			// https://hrm.neotechacademy.com/

			setUp();

			// At this point we are locating the elements
			LoginPage login = new LoginPage();

			// sending the username
			sendText(login.username, ConfigsReader.getProperty("username"));

			// sending the password
			sendText(login.password, ConfigsReader.getProperty("password"));

			// click on Login button
			login.loginBtn.click();

			// Same thing using the click() method in CommonMethods
			// click(login.loginBtn);

			wait(3);

			// validate login using the logo
			DashboardPage dashboard = new DashboardPage();

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
