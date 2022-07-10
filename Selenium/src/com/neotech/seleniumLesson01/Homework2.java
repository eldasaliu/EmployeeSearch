package com.neotech.seleniumLesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
//		HW2: Opening Page on Firefox Browser
//		Open Firefox browser
//		Navigate to “https://www.redfin.com/”
//		Verify that you have navigated to (https://www.redfin.com/)
//		End the Session (close the browser).
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redfin.com/");
		String expectedUrl="https://www.redfin.com/";
		String CurrentURL= driver.getCurrentUrl();
		if(CurrentURL.equals(expectedUrl)) {
			System.out.println("URL is verified");
		}else {
			System.out.println("Url is not verifed");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
