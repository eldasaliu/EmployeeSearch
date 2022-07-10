package com.neotech.testbase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.neotech.utils.CommonMethods;

public class Listener implements ITestListener {

	public void onStart(ITestContext context) {
		System.out.println("Functionality Test Starting");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Functionality Test Finished");
	}

	public void onTestStart(ITestResult result) {
		//printing logs to the console
		System.out.println("Test Started: " + result.getName());
		
		//this will output logs to the ExtentReport
		BaseClass.test = BaseClass.report.createTest(result.getName());	
	}

	public void onTestSuccess(ITestResult result) {
		//printing logs to the console
		System.out.println("Test Passed: " + result.getName());
		
		//print logs in the report
		BaseClass.test.pass("Test case passed: " + result.getName());
		
		//get screenshot - we want to store it in the report
		BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("passed/"+result.getName()));
		
	}

	public void onTestFailure(ITestResult result) {
		//printing logs to the console
		System.out.println("Test Failed: " + result.getName());
		
		//output log to the report
		BaseClass.test.fail("Test case failed: "+ result.getName());
		
		//get screenshot
		BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("failed/"+result.getName()));
	}

}

