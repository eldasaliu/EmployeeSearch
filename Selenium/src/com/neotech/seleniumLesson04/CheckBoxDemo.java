package com.neotech.seleniumLesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	
		public static String url = "https://demoqa.com/automation-practice-form";
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();//upcasting

	driver.get(url);
	WebElement maleRB=driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
	
	maleRB.click();
	Thread.sleep(2000);
	WebElement femaleRB=driver.findElement(By.xpath("//label[@for='gender-radio-2']"));

	femaleRB.click();
	Thread.sleep(2000);
	WebElement otherRB=driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

	
	otherRB.click();
	Thread.sleep(2000);
	WebElement sportsRB=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
	
sportsRB.click();
Thread.sleep(2000);
WebElement readingRB=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));

readingRB.click();
Thread.sleep(2000);



//2nd way shorter
List<WebElement> elements=(List<WebElement>) driver.findElement(By.xpath("//label[@class='custom-contol-label']"));

for(WebElement el:elements) {
	String text=el.getText();
	if(text.equals("Female")) {
		el.click();
		Thread.sleep(2000);
		
	}else if(text.equals("Reading")) {
		el.click();
		Thread.sleep(2000);
	
	}
}
driver.quit();
}
//we always we have to check the screan likie scroll down or maximize so for example the box of sports can be clickeable


}
