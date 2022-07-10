package com.neotech.seleniumLesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.neotech.util.BaseClass;

public class HomeWork1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
setUp();

driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
driver.findElement(By.id("ctl00_MainContent_login_button")).click();

List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

for (int i = 1; i < rows.size(); i++) {

	String rowText = rows.get(i).getText();
	System.out.println(rowText);

	if (rowText.contains("Susan McLaren")) {
	Thread.sleep(2000);
	
			String path="//table[@class='SampleTable']//td[13]";
 driver.findElement(By.xpath(path)).click();
 Thread.sleep(2000);
break;
	}
}
WebElement changeLastName=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));

changeLastName.clear();
Thread.sleep(500);
changeLastName.sendKeys("Susan Tray");
Thread.sleep(1000);

WebElement card=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
card.clear();
card.sendKeys("5689528555");
Thread.sleep(1000);

driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
String update = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]")).getText();
System.out.println("newName update-> " + update);


Thread.sleep(1000);
tearDown();


	}

}
