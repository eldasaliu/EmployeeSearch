package com.neotech.seleniumLesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
///full Path "\\Users\\Elda\\eclipse-workspace_b3\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe"
	//Relative path ->drivers/chromedriver
	//for windows ->drivers/chromedriver.exe
	//for Mac->drivers/chromedriver
	 public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "\\Users\\Elda\\eclipse-workspace_b3\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		  //declaring a variable of type of WebDriver
		  ////Calling the constructor of ChromeDriver
		  //we are Up-casting
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.neotechacademy.com/");
		  String title = driver.getTitle();
		  System.out.println("title - " + title);
		  Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		  driver.close();
		 }
		

	}


