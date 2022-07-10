package com.neotech.seleniumLesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public final static String url="https://www.facebook.com/";
	public static void main(String[] args) throws InterruptedException {
//		Task 1:
//		    Using Xpath ONLY
//		    TC 1: Facebook login:
//		        Open chrome browser
//		        Go to “https://www.facebook.com/”
//		        Enter valid username and valid password and click login
//		        User successfully logged in
		
	
		
			System.setProperty("webdriver.chrome.driver", "\\Users\\Elda\\eclipse-workspace_b3\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
	driver.get(url);
	driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Elda");
	driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("1245");
	driver.findElement(By.xpath("//button[contains(@id,'u_0')]")).click();
	//the button that has an id attribute,the value of the atribute contains u_0
	//if 
	Thread.sleep(1000);
	driver.quit();
	
	}

}
