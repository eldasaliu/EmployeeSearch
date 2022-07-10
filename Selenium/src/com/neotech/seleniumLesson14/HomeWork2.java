package com.neotech.seleniumLesson14;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class HomeWork2 extends CommonMethods {

	public static void main(String[] args) {
//		TC 2: Orange HRM wrong password validation
//		1. Go to https://hrm.neotechacademy.com/
//		2. Enter valid username and wrong password
//		3. Click on login button
//		4. Verify error message with text "Invalid credentials" is displayed
		
		
		
		setUp();

		LoginPageUsingFactory login = new LoginPageUsingFactory();

		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "Elda123");

		login.loginBtn.click();
		String expectedName="Invalid credentials";
	

		if (!login.invalidpsw.getText().equals(expectedName)) {
			System.out.println(expectedName+ "--> Test passed!");
		} else {
			System.out.println(expectedName+ "--> Test failed!");
		}
         wait(2);
		tearDown();


	}



	

}
