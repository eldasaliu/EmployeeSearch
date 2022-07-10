package com.neotech.seleniumLesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
		public final static String url="http://sis.neotechacademy.com:9000/Test/AD/Students/Personal.aspx";
	public static void main(String[] args) throws InterruptedException {	
			System.setProperty("webdriver.chrome.driver", "\\Users\\Elda\\eclipse-workspace_b3\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
	driver.get(url);
	driver.findElement(By.id("tUsername")).sendKeys("Admin");
	WebElement pass=driver.findElement(By.name("tPassword"));
	pass.sendKeys("Neotech$123");
	Thread.sleep(1000);
	driver.findElement(By.id("blogin")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Students")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Logout")).click();
	 
	}

}
