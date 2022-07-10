package com.neotech.seleniumLesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxDriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "\\Users\\Elda\\eclipse-workspace_b3\\Selenium\\drivers\\geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.facebook.com/");
		String actualURL=dr.getCurrentUrl();
		String expectedURL="https://www.facebook.com/";
		if(actualURL.contentEquals(expectedURL)) {
			System.out.println("test passed");
			
		}else {
			System.out.println("The URL is Wrong");
		}
		Thread.sleep(5000);
		dr.close();
	}

	

}
