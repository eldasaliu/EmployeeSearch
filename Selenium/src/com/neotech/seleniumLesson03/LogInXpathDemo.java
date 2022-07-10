package com.neotech.seleniumLesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInXpathDemo {
	public final static String url = "http://sis.neotechacademy.com:9000/Test/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		// Generated Full Xpath
//		driver.findElement(By.xpath(
//				"/html/body/form/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[3]/input"))
//				.sendKeys("Admin");

		// Generated Relative Xpath
//		driver.findElement(By.xpath("//*[@id=\"tUsername\"]")).sendKeys("Admin");

		// Custom Xpath
		driver.findElement(By.xpath("//input[@id='tUsername']")).sendKeys("Admin");
		// If there is an id, try By.id first
		// driver.findElement(By.id("tUsername")).click();

		// Password
		driver.findElement(By.xpath("//input[@name='tPassword']")).sendKeys("Neotech$123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);

		// This is the full path of Students
		// driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr[1]/td[1]/table/tbody/tr/td[6]/a")).click();

		// Better option, using custom xpath
		driver.findElement(By.xpath("//a[contains(text(),'Students')]")).click();
		Thread.sleep(1000);

		// Log Out
		driver.findElement(By.xpath("//a[@class='linkMid']")).click();
		// driver.findElement(By.className("linkMid")).click();



	}
}
