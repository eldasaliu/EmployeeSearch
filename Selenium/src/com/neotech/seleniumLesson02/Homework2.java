package com.neotech.seleniumLesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

//	HW2: Facebook sign up:
//		Open chrome browser
//		Go to “https://www.facebook.com/”
//		Click on Sign Up link
//		Enter first name
//		Enter last name
//		Enter email address
//		Re-enter email address
//		Click on Sign Up button
	public final static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Sam");
		driver.findElement(By.name("lastname")).sendKeys("Steam");
		driver.findElement(By.name("reg_email__")).sendKeys("sam@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sam@gmail.com");

		driver.findElement(By.name("websubmit")).click();

		Thread.sleep(2000);

		driver.close();
	}

}
