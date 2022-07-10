package com.neotech.seleniumLesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.util.BaseClass;

public class H2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//Homework 2:
//        Alert text verification
//        Open chrome browser
//        Go to https://demoqa.com/
//        Click on "Alerts, Frame & Windows" link
//        Click on "Alerts" links on the left side
//        Click on button to see Alert
//        Verify alert box with text "You clicked a button" is present
//        Click on 3rd button in the page
//        Verify alert box with text "Do you confirm action?" is present and click "confirm"
//        Click on 4 th button in the page and enter your name and click ok.
//        Quit browser
		
		setUp();

		driver.findElement(By.xpath("//*[@class='category-cards']/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		//String text = alert.getText();
		System.out.println("Alert text: " + alert.getText());
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		Alert confirmationAlert = driver.switchTo().alert();
		System.out.println("Confirmation alert text :" + confirmationAlert.getText());
		confirmationAlert.accept();
		Thread.sleep(1000);
		driver.findElement(By.id("promtButton")).click();
		Alert promtButton = driver.switchTo().alert();
		//System.out.println("Promt Button alert text " + promtButton.getText());
		promtButton.sendKeys("Elda");
		promtButton.accept();
		Thread.sleep(2000);
		driver.quit();
		tearDown();

	}

}
