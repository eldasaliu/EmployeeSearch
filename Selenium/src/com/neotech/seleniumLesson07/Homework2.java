package com.neotech.seleniumLesson07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.util.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
setUp();

Thread.sleep(2000);

driver.findElement(By.xpath("//*div[@class='category-cards']/div[3]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//span[txt()='Alerts']")).click();

WebElement confirmBtn =driver.findElement(By.id("confirmButton"));
confirmBtn.click();
Thread.sleep(2000);

//After the pop-up alert is shown,I have to switch to it
Alert alert =driver.switchTo().alert();
alert.dismiss();
Thread.sleep(2000);

String resultTxt=driver.findElement(By.id("confirmResult")).getText();
System.out.println("resultTxt is->" +resultTxt);
Thread.sleep(2000);


//I want to click again to the same button
confirmBtn.click();
alert.accept();
Thread.sleep(2000);
resultTxt = driver.findElement(By.id("confirmResult")).getText();
System.out.println("resultTxt is -> " + resultTxt);
Thread.sleep(1000);

tearDown();
	}

}
