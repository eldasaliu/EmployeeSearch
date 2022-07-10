package com.neotech.seleniumLesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public final static String url="https://www.facebook.com/";
	public static void main(String[] args) throws InterruptedException {
//		Task 2:
//		      Using Css ONLY
//		    TC 2: Facebook login:
//		        Open chrome browser
//		        Go to “https://www.facebook.com/”
//		        Enter valid username and valid password and click login
//		        User successfully logged in
		
	
		
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
	driver.get(url);
	driver.findElement(By.cssSelector("#email")).sendKeys("Elda");
	driver.findElement(By.cssSelector("#pass")).sendKeys("1245");
	driver.findElement(By.cssSelector("button[value='1']")).click();
	//or driver.findElement(By.cssSelector("button[name='login'")).click(); ] if i dont put this in the end it doesnt metter
//	if we have Id we use # if we have class we use period .
	
	Thread.sleep(1000);
	driver.quit();

	}

}
