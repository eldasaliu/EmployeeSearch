package com.neotech.seleniumLesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.util.BaseClass;

public class Task extends BaseClass {

	public static void main(String[] args) {
//		TC 1: Verify element is present
//		1. Open chrome browser
//		2. Go to "https://the-internet.herokuapp.com/"
//		3. Click on "Click on the "Dynamic Loading" link
//		4. Click on "Example 1..." and click on "Start"
//		5. Verify element with text "Hello World!" is displayed
//		6. Close the browser
		setUp();
		//implicit way always done 
		//only this in the beggining not in the middle or in the ene]d
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//or///linkText("Dynamic Loading")
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
		//or//linkText("Example 1:Element on the page that is hidden"
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
		
		//or//button[text()='Start']
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
		//can be written anywhere in the code
		//applies to the element/element specified and situation specified
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		//if its less time so if the time run out the element still not there,then exeption is thrown
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[id=\"finish\"]/h4")));
		//WebElement HelloWorld=driver.findElement(By.xpath("//div[id=finish']/h4"));
		//"//div[id=finish']/h4"
		boolean isDisplayed=driver.findElement(By.xpath("//*[id=\"finish\"]/h4")).isDisplayed();
		System.out.println(isDisplayed);
		//System.out.println(driver.findElement(By.xpath("//div[id=finish']/h4")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[id=finish']/h4")).isDisplayed());
		
		driver.quit();
		
		tearDown();
		
	}

}
