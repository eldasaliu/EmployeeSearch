package com.neotech.seleniumLesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
	public static String url = "https://demoqa.com/radio-button";

	public static void main(String[] args) throws InterruptedException {
//		Radio Button Practice  
//		Open chrome browser
//		Go to "https://demoqa.com/radio-button"
//		Verify if all radio buttons are displayed and clickable
//		Click on all radio buttons
//		Verify radio buttons has been clicked successfully
//		Quit browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		List<WebElement> radiobuttons = driver.findElements(By.xpath("//label[starts-with(@class, 'custom-control-label')]"));
		for (WebElement radio : radiobuttons) {
			if (radio.isDisplayed()) {
				System.out.println("Radio button with " + radio.getText() + " is displayed");

			} else {
				System.out.println("Radio button is not displayed");
			}
		}
		Thread.sleep(2000);
		WebElement yes = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yes.click();

		WebElement yesButton = driver.findElement(By.id("yesRadio"));
		if (yesButton.isSelected()) {
			System.out.println("Yes is clickable");
		} else {
			System.out.println("Yes is NOT clickable");
		}
		Thread.sleep(2000);
		WebElement impressive = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		impressive.click();

		WebElement impressiveButton = driver.findElement(By.id("impressiveRadio"));
		if (impressiveButton.isSelected()) {
			System.out.println("Impressive is clickable");
		} else {
			System.out.println("Impressive is NOT clickable");
		}
		Thread.sleep(2000);
		WebElement no = driver.findElement(By.xpath("//label[@for='noRadio']"));
		no.click();
		WebElement noButton = driver.findElement(By.id("noRadio"));
		if (noButton.isSelected()) {
			System.out.println("No is Selected");
		} else {
			System.out.println("No is NOT Selected");
		}
		Thread.sleep(2000);
		driver.quit();

	}
}
