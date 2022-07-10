package com.neotech.seleniumLesson13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;

public class HomeWork3 extends CommonMethods {

	public static void main(String[] args) {
//		Homework 3: 
//			Go to url: https://hrm.neotechacademy.com/
//			Log in using our custom methods
//			Go to PIM menu
//			Add an employee
//			Upload another image in the employee photo
//	

		setUp();

		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		click(driver.findElement(By.xpath("//span[text()='PIM']")));
		waitForVisibility(driver.findElement(By.linkText("Add Employee")));

		click(driver.findElement(By.linkText("Add Employee")));
		sendText(driver.findElement(By.id("first-name-box")), "Julia");

		sendText(driver.findElement(By.id("last-name-box")), "Roberts");
		String employeeId = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(employeeId + "Empoyee ID");
		WebElement dropdown = driver.findElement(By.id("location"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("HQ - CA, USA");
		click(driver.findElement(By.id("modal-save-button")));
		waitForVisibility(driver.findElement(By.id("change-employee-li")));
		click(driver.findElement(By.xpath(
				"//li[@class='profile-photo valign-wrapper circle card-image waves-effect waves-block waves-light']")));
		String filePath = System.getProperty("user.dir") + "/screenshots/photo/jen.jpg";
		System.out.println(filePath);
		sendText(driver.findElement(By.id("employeePicture")), filePath);
		wait(3);
		click(driver.findElement(By.xpath("//a[@form-name='photoForm']")));
		wait(3);
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
