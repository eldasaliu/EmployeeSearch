package com.neotech.seleniumLesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllEbayLinks {
	public static String url = "https://www.ebay.com";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting

		driver.get(url);
	//	driver.findElement(By.xpath("//link"));
	List<WebElement> allLinks=(List<WebElement>) driver.findElement(By.tagName("a"));
	
	int count=0;
	for(WebElement link:allLinks) {
		if(!link.getText().isEmpty()) {
			System.out.println(link.getText());
			count++;
			
		}
	}
	System.out.println("The number of links that have text are");
	
	
}
}