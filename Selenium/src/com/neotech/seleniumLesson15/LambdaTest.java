package com.neotech.seleniumLesson15;

import com.neotech.pages.LambdaRegisterPage;
import com.neotech.util.CommonMethods;

public class LambdaTest  extends CommonMethods {
//	Go to https://accounts.lambdatest.com/register
//	Find the Password Element and enter a password
//	Find the Show span as a nephew of the password element and click on it
//	Find the Business Email as a cousin of the password element and enter an email
//	Close the browser

	public static void main(String[] args) {

	setUp();

	LambdaRegisterPage register = new LambdaRegisterPage();

	wait(1);

	register.username.sendKeys("Secret@123");
	wait(2);

	// Let's use JavascriptExecutor click
	jsClick(register.show);
	wait(2);

	register.businessEmail.sendKeys("brian@trump.com");
	wait(2);

	tearDown();
}
}