package com.neotech.seleniumLesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.util.BaseClass;

public class h extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();

		// Login
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		// I want to get third columns of the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[3]"));

		for (int i = 0; i < rows.size(); i++) {

			String col3Text = rows.get(i).getText();
			System.out.println("col3Text -> " + col3Text);

			if (col3Text.equals("FamilyAlbum")) {
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + (i + 2) + "]/td[1]")).click();
			}
			
			// Here we don't put a break, because we want to continue clicking
		}

		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

		Thread.sleep(3000);

		tearDown();
	}
	}


