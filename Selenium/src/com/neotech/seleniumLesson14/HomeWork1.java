package com.neotech.seleniumLesson14;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class HomeWork1 extends CommonMethods {

	public static void main(String[] args) {
//		TC 1: Orange HRM blank password validation
//		1. Go to https://hrm.neotechacademy.com/
//		2. Enter valid username and leave password field empty
//		3. Click on login button
//		4. Verify error message with text "Password cannot be empty" is displayed

		setUp();

		LoginPageUsingFactory login = new LoginPageUsingFactory();

		sendText(login.username, ConfigsReader.getProperty("username"));

		login.loginBtn.click();
		if (login.ErrorEmptyPasw.isDisplayed()) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}
		wait(2);
		tearDown();

	}

}
