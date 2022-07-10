package com.neotech.seleniumLesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.util.BaseClass;

public class Tax1 extends BaseClass{

	public static void main(String[] args) {
//		TC 1: Table headers and rows verification
//		1. Open chrome browser
//		2. Go to "https://www.techlistic.com/p/demo-selenium-practice.html"
//		3. Verify table consists "Financial Center".
//		4. Print name of all column headers
//		5. Print data of all rows
//		6. Quit Browser
		
		/*
		 * TC 1: Table headers and rows verification 1. Open chrome browser 2. Go to
		 * "https://www.techlistic.com/p/demo-selenium-practice.html" 3. Verify table
		 * consists "Financial Center". 4. Print name of all column headers 5. Print
		 * data of all rows 6. Quit Browser
		 */
		
		setUp();
		
		WebElement table = driver.findElement(By.xpath("//table[@class = 'tsc_table_s13']/tbody"));
		
		
		String expected = "Financial Center";
		String actual = table.getText();
		
		if (actual.contains(expected))
		{
			System.out.println(expected + " is in the table. Test passed!");
		}
		else
		{
			System.out.println(expected + " is not in the table. Test failed!");
		}
			
		
		System.out.println("==== All Column Headers ===");
		
		
		List<WebElement> headerData  = driver.findElements(By.xpath("//table[@class = 'tsc_table_s13']/thead/tr/th"));

		for(WebElement data: headerData)
		{
			System.out.print(data.getText() + " | ");
		}
		System.out.println();
		
		
		System.out.println("====== Row Data ======");
		
		List<WebElement> rowData = driver.findElements(By.xpath("//table[@class = 'tsc_table_s13']/tbody/tr"));
		
		for(WebElement data : rowData)
		{
			System.out.println(data.getText());
		}
		
		
		
		tearDown();
		
	}

}
