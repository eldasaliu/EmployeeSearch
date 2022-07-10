package com.neotech.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.pages.AddEmployeePageElements;
import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.PersonalDetailsPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;
import com.neotech.utils.ExcelUtility;

public class AddEmployeeTest extends CommonMethods {

	@Test(dataProvider = "excelData", groups = { "AddEmployee", "regression" })
	public void AddEmployee(String firstName, String lastName, String userName, String password) {

		// All the pages are initialized at the beginning!!!
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();
		AddEmployeePageElements addEmployee = new AddEmployeePageElements();
		PersonalDetailsPageElements personalDetails = new PersonalDetailsPageElements();

		// Printing to the console
		System.out.println("Test Data: " + firstName + " " + lastName);
		// Logging information to the test report
		test.info("Test Data: " + firstName + " " + lastName);

		// Login
		test.info("Logging in...");
		login.signIn();

		wait(1);

		// Click on PIM
		dashboard.PIM.click();
		// Click on Add Employee
		click(dashboard.addEmployeeLink);

		wait(1);

		// New Employee Data
		sendText(addEmployee.firstName, firstName);
		sendText(addEmployee.lastName, lastName);

		// Get EmployeeId for validation
		String expectedEmpId = addEmployee.employeeId.getAttribute("value");

		// We are selecting "London Office" from the drop-down
		selectDropdown(addEmployee.location, "London Office");

		wait(1);

		// I am using JavaScript Click because click() didn't work
		jsClick(addEmployee.checkBoxLoginDetails);

		wait(1);

		// Provide username & password for the New Employee
		sendText(addEmployee.username, userName);
		sendText(addEmployee.password, password);
		sendText(addEmployee.confirmPassword, password);

		wait(1);

		click(addEmployee.saveBtn);

		wait(1);

		waitForVisibility(personalDetails.personalDetailsForm);

		// Validation
		test.info("Validating Employee...");
		String actualEmpId = personalDetails.employeeId.getAttribute("value");
		Assert.assertEquals(actualEmpId, expectedEmpId, "Id's do not match!");

	}

	@DataProvider(name = "excelData")
	public Object[][] createData() {
		return ExcelUtility.excelIntoArray(System.getProperty("user.dir") + "/src/test/resources/testdata/Excel.xlsx",
				"Employee");
	}

}
