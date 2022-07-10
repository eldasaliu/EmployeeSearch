package com.neotech.seleniumLesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.util.BaseClass;
import com.neotech.util.ConfigsReader;

public class Task1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
//		TC 1: Disciplinary Cases Search Validation
//		Open chrome browser
//		Go to https://hrm.neotechacademy.com/
//		Login into the application
//		Select Discipline
//		Select Disciplinary Cases
//		Click on Filter (Up-Right next to Help)
//		Select from June 6, 2022 to July 15, 2022
//		Click on Search
//		Validate that there are no rows in result table
//		Quit the browser
		
		
		setUp();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Login to HRMS website
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

		// Navigate to Disciplinary Cases
		driver.findElement(By.id("menu_discipline_defaultDisciplinaryView")).click();
		driver.findElement(By.linkText("Disciplinary Cases")).click();

		// Let's switch to the frame
		driver.switchTo().frame(0);

		// Click on Filter
		driver.findElement(By.id("searchModal")).click();

		Thread.sleep(500);

		// Click to show the calendar
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateFrom")).click();

		// We cannot use Select

		// Select from date

		// Shows the calendar
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//input[1]")).click();

		// Click on June
		driver.findElement(
				By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//ul/li/span[text()='June']"))
				.click();

		// No need to select the year because it's already 2022

		// Get all the days from the table
		List<WebElement> dates = driver
				.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateFrom_table']/tbody/tr/td"));

		// Loop on the elements and select the date that we want
		for (WebElement day : dates) {
			if (day.getText().equals("6")) {
				day.click();
				break;
			}
		}

		// Select to date

		// Shows the calendar
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateTo")).click();

		// Shows the months
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//input[1]")).click();

		// Click on July
		driver.findElement(
				By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//ul/li/span[text()='July']")).click();

		// Get all the days from the table
		List<WebElement> toDates = driver
				.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateTo_table']/tbody/tr/td"));
		for (WebElement day : toDates) {
			if (day.getText().equals("15")) {
				day.click();
				break;
			}
		}

		Thread.sleep(2000);

		// Click on search button
		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		searchBtn.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(searchBtn));

		List<WebElement> res = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println("Rows -> " + res.size());

		Thread.sleep(1000);

		tearDown();
	}
}

