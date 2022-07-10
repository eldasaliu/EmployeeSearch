package com.neotech.seleniumLesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.util.BaseClass;

public class h1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		Homework: American Airlines Flight Search
//
//		Open chrome browser
//		Go to https://www.aa.com/homePage.do
//		Enter From and To
//		Select departure as December 14 of 2022
//		Select arrival as December 22 of 2022
//		Click on search
//		Close browser
		setUp();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']")).sendKeys("JFK");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("FRA");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		while (!month.equals("December")) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@aria-label='Next Month']")).click();
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		List<WebElement> departure = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement day : departure) {
			String dayNum = day.getText();
			if (dayNum.equals("14")) {
				day.click();
				Thread.sleep(1000);
				break;
			}
		}
		driver.findElement(By.xpath("//div/div[2]/div/button")).click();
		String arrival = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		while (!arrival.equals("December")) {
			Thread.sleep(500);
			driver.findElement(By.xpath("//a[@aria-label='Next Month']")).click();
			arrival = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		List<WebElement> arrivalday = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement Rday : arrivalday) {
			if (Rday.getText().equals("22")) {
				Rday.click();
				Thread.sleep(500);
				break;
			}
		}
		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
		searchBtn.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(searchBtn));
		Thread.sleep(1000);

		tearDown();

	}

}
