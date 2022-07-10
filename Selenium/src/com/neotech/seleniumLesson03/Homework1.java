package com.neotech.seleniumLesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
//		Homework 1:
//		    Using xPath ONLY
//		    TC 2: Mercury Tours Registration: 
//		        Open chrome browser
//		        Go to “http://demo.guru99.com/test/newtours/”
//		        Click on Register Link
//		        Fill out all required info
//		        Click Submit
//		        User successfully registered

	public final static String url = "http://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Elda");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Saliu");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("878423731");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("eldam4@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("458 Wayne");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Wayne");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("NJ");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("0785");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("eldam4@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Elda12345");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Elda12345");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		Thread.sleep(2000);
		String URL = "https://demo.guru99.com/test/newtours/register_sucess.php";
		String currentURL = driver.getCurrentUrl();

		if (URL.equals(currentURL)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!");
		}

		driver.quit();

	}

}