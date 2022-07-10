package com.neotech.seleniumLesson12;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class H2ScreeShot extends CommonMethods {

	public static void main(String[] args) {
		setUp();

//Homework 2:
//Go to https://hrm.neotechacademy.com/
//Log in using our custom methods
//Go to PIM menu
//Add an employee
//Go to Employee List
//Get the list of the employees (Using tables - tr and td) 
//Loop to search for the employee you added
//When you find the employee - click on it.
//Take a screenshot

		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		click(driver.findElement(By.xpath("//span[text()='PIM']")));
		
		click(driver.findElement(By.linkText("Add Employee")));
		sendText(driver.findElement(By.id("first-name-box")), "Elia");

		sendText(driver.findElement(By.id("last-name-box")), "Stacy");
	String employeeId = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(employeeId + "Empoyee ID");
		WebElement dropdown = driver.findElement(By.id("location"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("HQ - CA, USA");
		click(driver.findElement(By.id("modal-save-button")));
		wait(4);
		waitForVisibility(driver.findElement(By.id("pimPersonalDetailsForm")));
		click(driver.findElement(By.xpath("//span[text()='Employee List']")));

		wait(3);
		List<WebElement> empoyeeList = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td"));
		String employee="Elia";
		for (int i = 1; i < empoyeeList.size(); i++) {
			String ID = empoyeeList.get(i).getText();
	
			if (ID.contains(employee)) {
				empoyeeList.get(i).click();
			
				break;
			}
		}
	
wait(6);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File("screenshots/Lesson13/Homework2.png"));
			System.out.println("We did take a Screenshot!");
		} catch (IOException e) {
			System.out.println("We did not  take a Screenshot");
		}

	

		tearDown();
	}

}
