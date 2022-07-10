package com.neotech.seleniumLesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
//		HW1: Amazon Page Title Verification: 
//			Open chrome browser
//			Go to “https://www.amazon.com/”
//			Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
//			End the Session (close the browser).
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		String Str = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed";
		String Title = driver.getTitle();

		System.out.println("Str -->" + Str);
		System.out.println("Title-->" + Title);

		if (Title.equalsIgnoreCase(Str)) {
			System.out.println("Test passed");

		} else {
			System.out.println("Test failed");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
