package com.neotech.steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalDetailsSteps extends CommonMethods {
//
//	@Given("user navigates to AddEmployee page")
//	public void user_navigates_to_add_employee_page() {
//		click(dashboard.PIM);
//		click(dashboard.addEmployeeLink);
//	}
//
//	@When("user enters employee first name {string} and last name {string}")
//	public void user_enters_employee_first_name_and_last_name(String firstname, String lastname) {
//		sendText(addEmployee.firstName, firstname);
//		sendText(addEmployee.lastName, lastname);
//
//	}
//
//	@Then("user enters a location")
//	public void user_enters_a_location() {
//		selectDropdown(addEmployee.location, "German Regional HQ");
//	}
//
//	@When("user clicks on save button")
//	public void user_clicks_on_save_button() {
//		click(addEmployee.saveBtn);
//	}
//
//	@Then("I am able to modify Employee Details {string}, {string}, {string}, {string}, {string}")
//	public void i_am_able_to_modify_employee_details(String license, String expiration, String smoker, String gender,
//			String nationality) {
//		sendText(personalDetails.DriverLicense, license);
//		wait(1);
//		sendText(personalDetails.LicenseExp, expiration);
//		if (smoker.equals("Yes")) {
//			click(personalDetails.smokerBox);
//			wait(1);
//			System.out.println("Employee is a Smoker");
//		} else {
//			System.out.println("Employee is not a Smoker");
//		}
//		
//		click(personalDetails.genderInput);
//		// 1st way. Locating the WebElement dynamically
//		// click(driver.findElement(By.xpath("//span[text()='" + gender + "']")));
//
//		// 2nd way
//		List<WebElement> genderList = personalDetails.genderOptions;
//
//		wait(1);
//		for (WebElement option : genderList) {
//			if (option.getText().equals(gender)) {
//				click(option);
//				break;
//				
//			}
//	}
//		}
//	
//	
//	
////		selectDropdown(personalDetails.gender, gender);
////		selectDropdown(personalDetails.nationality, nationality);
//
//
//	@Then("I click on Personal Details Save")
//	public void i_click_on_personal_details_save() {
//		click(personalDetails.SaveBtn);
//	}
//}
	
	
	
	@Then("I am able to modify Employee Details {string}, {string}, {string}, {string}, {string}")
	public void i_am_able_to_modify_employee_details(String driverLic, String expDate, String smoker, String gender,
			String nation) {

		waitForVisibility(personalDetails.personalDetailsForm);

		sendText(personalDetails.driverLicense, driverLic);
		wait(1);

		if (smoker.equals("Yes")) {
			click(personalDetails.smokerBox);
		}
		wait(1);

		click(personalDetails.genderInput);
		// 1st way. Locating the WebElement dynamically
		// click(driver.findElement(By.xpath("//span[text()='" + gender + "']")));

		// 2nd way
		clickOnElement(personalDetails.genderOptions, gender);

		click(personalDetails.nationalityInput);
		clickOnElement(personalDetails.nationalityOptions, nation);
		wait(1);

		// Select the date
		click(personalDetails.licExpDate); // Will show the calendar

		String[] parts = expDate.split("-"); // 2023-05-10

		// Selecting the year
		click(personalDetails.licExpYearInput); // Will show the years
		clickOnElement(personalDetails.licExpYearOptions, parts[0]);

		// Selecting the month
		click(personalDetails.licExpMonthInput); // Will show the months

		int m = Integer.parseInt(parts[1]); // Converting 05 to 5
		click(personalDetails.licExpMonthOptions.get(m - 1)); // Because May is index 5 - 1 = 4

		// Selecting the day
		int d = Integer.parseInt(parts[2]); // Converting String to int
		selectCalendarDate(personalDetails.licExpDays, d + ""); // converting 10 to a String

		wait(1);

	}

	public void clickOnElement(List<WebElement> list, String value) {
		wait(1);
		for (WebElement option : list) {
			System.out.println(option.getText());
			if (option.getText().equals(value)) {
				click(option);
				break;
			}
		}
	}

	@Then("I click on Personal Details Save")
	public void i_click_on_personal_details_save() {
		jsClick(personalDetails.detailsBtnSave);
		wait(3);
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
