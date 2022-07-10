package com.neotech.seleniumLesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx";
	
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
WebDriver driver = new ChromeDriver();//upcasting

driver.get(url);
WebElement username=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
username.sendKeys("Tester");

Thread.sleep(2000);
WebElement password=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]"));
password.sendKeys("test");

Thread.sleep(2000);

WebElement login=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]"));
login.click();

Thread.sleep(2000);
driver.quit();
}
}