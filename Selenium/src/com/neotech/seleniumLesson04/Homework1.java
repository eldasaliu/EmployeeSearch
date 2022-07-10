package com.neotech.seleniumLesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	// ===========HW-1==========
//				Open chrome browser
//				Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//				Enter valid username
//				Clear username and enter again valid username
//				Leave password field empty
//				Click on login button
//				Verify error message with text "Invalid Login or Password." is displayed.
	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")).sendKeys("Elda");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")).sendKeys("Tester");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();
		WebElement password = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_status\"]"));
		if (password.isDisplayed()) {
			System.out.println("Invalid Login or Password is displayed");
		} else {
			System.out.println("Invalid Login or Password is not displayed");

			Thread.sleep(2000);
			driver.close();

		}

	}
}
