package com.neotech.seleniumLesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.util.BaseClass;

public class H1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {	
		
//		TC: Update Customer Information
//
//		1) Open chrome browser
//		2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		3) Login to the application
//		4) Verify customer "Susan McLaren" is present in the table
//		5) Click on customer details
//		6) Update customers last name and credit card info
//		7) Verify updated customers name and credit card number is displayed in table
//		8) Close browser
		

		setUp();

		// Login
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		// I want to get all the rows of the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		int rowIndex = -1;

		// Starting from 1, because I want to skip the header
		for (int i = 1; i < rows.size(); i++) {

			String rowText = rows.get(i).getText(); // the text of the row
			// System.out.println(rowText);

			if (rowText.contains("Susan McLaren")) {
				System.out.println("We have found Susan");
				 

				rowIndex = i + 1; // List starts from 0; WebTable xpath start from 1
				String path = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + rowIndex + "]/td[13]";
				driver.findElement(By.xpath(path)).click();

				// If we don't break -> StaleElementReferenceException
				break;
			}

		}

		Thread.sleep(1000);

		// Let's update Customer name
		WebElement custName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
//		String textInside = custName.getAttribute("value");
//		System.out.println("textInside -> " + textInside);

		custName.clear();
		Thread.sleep(500);
		custName.sendKeys("Jack Tray");
		Thread.sleep(1000);

		WebElement card = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
		card.clear();
		card.sendKeys("822662255");
		Thread.sleep(1000);

		// Let's click on Update
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		Thread.sleep(1000);

		// Verify that the name has changed
		String newName = driver
				.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + rowIndex + "]/td[2]"))
			.getText();
		System.out.println("newName -> " + newName);

		tearDown();

	
}
}

//in HTML start from 1,and index 0
//i am going to iterate the rows 1 by 1 .I want to start from 1 because i want to exclude the header if i have to start from 0 the heder is gonna be there

//i am going to iterate the rows 1 by 1 .I want to start from 1 because i want to exclude the header if i have to start from 0 the heder is gonna be there

///List strats at 0;but WebTable xpath stars from 1 thats why we did it like this