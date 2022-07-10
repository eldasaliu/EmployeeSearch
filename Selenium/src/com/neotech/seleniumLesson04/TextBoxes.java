package com.neotech.seleniumLesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

		public static String url = "https://demoqa.com/automation-practice-form";
        public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
			WebDriver driver = new ChromeDriver();//upcasting

			driver.get(url);
			//1st way
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Elda");
driver.findElement(By.xpath("//input[@id='firstName']")).clear();
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Liam");
driver.findElement(By.cssSelector("#lastName")).clear();
Thread.sleep(2000);
driver.findElement(By.cssSelector("#lastName")).sendKeys("Saliu");

//2nd way
WebElement fname =driver.findElement(By.xpath("//input[@id='firstName']"));
fname.clear();
fname.sendKeys("Elia");
String idAttribute=fname.getAttribute("id");
System.out.println("The value of the id attribute is "+ idAttribute);

WebElement lName=driver.findElement(By.cssSelector("#lastName"));
lName.clear();
lName.sendKeys("Sheri");
WebElement header=driver.findElement(By.xpath("//div[text()='Practice Form']" ));
String headerText=header.getText();
System.out.println("Header is:"+headerText);
System.out.println("Value of the class attribute is:"+header.getAttribute("class"));

Thread.sleep(2000);
driver.quit();

}
	}