package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.util.CommonMethods;
import com.neotech.util.ConfigsReader;
import com.neotech.util.ExcelUtility;

public class HomeWork1 extends CommonMethods{
//	Open chrome browser
//	Go to "https://hrm.neotechacademy.com/"
//	Login to the application
//	Add 3 different Employees and Create Login Details by providing:
//	First Name
//	Last Name
//	Username
//	Password
//	Verify Employee has been added successfully and take screenshot (you must have 3 different screenshots)
//	Close the browser
//	Specify a group for this test case, add it into specific suite and execute from the xml file.

	@BeforeMethod(alwaysRun = true)
	public void openAndNavigate() {
		setUp();
	}

	@AfterMethod(alwaysRun = true)
	public void quitBrowser() {
		tearDown();
	}

	@Test(dataProvider = "excelData", groups = { "homework", "regression" })
	public void test(String firstName, String lastName, String username, String password) {

		// Login
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button[@type='submit']")));

		// Navigate to PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		// Click on Add Employee
		driver.findElement(By.linkText("Add Employee")).click();

		wait(1);

		// New Employee Data
		sendText(driver.findElement(By.id("first-name-box")), firstName);
		sendText(driver.findElement(By.id("last-name-box")), lastName);

		// Get EmpID for validation
		String empID = driver.findElement(By.id("employeeId")).getAttribute("value");

		// Locate the select WebElement
		WebElement dropdown = driver.findElement(By.id("location"));
		Select sel = new Select(dropdown);
		sel.selectByValue("string:19");

		wait(1);

		// Selenium click didn't work, we used JavascriptExecutor
		jsClick(driver.findElement(By.id("hasLoginDetails")));
		wait(1);

		// Provide the Username and Password for newe Employee
		sendText(driver.findElement(By.id("username")), username);
		sendText(driver.findElement(By.id("password")), password);
		sendText(driver.findElement(By.id("confirmPassword")), password);

		wait(1);

		click(driver.findElement(By.id("modal-save-button")));

		// Validation
		waitForVisibility(driver.findElement(By.id("personal_details_tab")));
		String actualId = driver.findElement(By.id("employeeId")).getAttribute("value");

		Assert.assertEquals(actualId, empID, "Employee IDs do not match!");

		// Take screenshot

		// 1st way
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(source, new File("screenshot/" + firstName + "_" + lastName + ".png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// 2nd way
		takeScreenshot(firstName + "_" + lastName);

	}

	@DataProvider(name = "getData")
	public Object[][] createData() {
		Object[][] data = { { "Jeff", "Bezos", "Jeff2023", "Bezos@123" }, { "Bill", "Gates", "Bill2023", "Gates@123" },
				{ "Elon", "Musk", "Elon2023", "Musk@123" } };

		return data;
	}

	@DataProvider(name = "excelData")
	public Object[][] getExcelData() {
		return ExcelUtility.excelIntoArray(System.getProperty("user.dir") + "/testData/Excel.xlsx", "Employee");
	}

}

