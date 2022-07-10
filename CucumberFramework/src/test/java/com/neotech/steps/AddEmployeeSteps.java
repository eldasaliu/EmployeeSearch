package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddEmployeeSteps extends CommonMethods {
	
	@Given("user navigates to the add employee page")
	public void user_navigates_to_the_add_employee_page() {
	  click(dashboard.PIM);
	  click(dashboard.addEmployeeLink);
	 // waitForClickability(addEmployee.firstName);
	}
//harcoded step similiar to the one with String
	@When("user enters valid first and last name")
	public void user_enters_valid_first_and_last_name() {
	    sendText(addEmployee.firstName,"Alisia");
	    sendText(addEmployee.lastName,"Drew");
	    selectDropdown(addEmployee.location,"German Regional HQ");
	  
	    
	    }

	@When("clicks on save button")
	public void clicks_on_save_button() {
		
	    click(addEmployee.saveBtn);
	    
	}
//hardcoded step
	@Then("validate employee saved")
	public void validate_employee_saved() {

//	 if (personalDetails.employeeId.isDisplayed()) {
//			System.out.println("Test Passed");
//		} else {
//			System.out.println("Test not passed");
//		}
	
		//Please make sure you import the Assert class under org.Unit	
	waitForVisibility(personalDetails.personalDetailsForm);
	String expected ="Alisia Drew";
	String actual=personalDetails.employeeName.getText();
	
		Assert.assertEquals("The name does not match", expected,actual);
	}

	
	//parametrized step
	@When("user enters valid first name {string} and last name {string}")
	public void user_enters_valid_first_name_and_last_name(String string, String string2) {
		sendText(addEmployee.firstName,string);
	    sendText(addEmployee.lastName,string2);
	    selectDropdown(addEmployee.location,"German Regional HQ");
	}
//		@When("clicks on save button")
//		public void clicks_on_save_button() {
//			
//		    click(addEmployee.saveBtn);  
//		
//	}
	//parametrized step
	@Then("validate employee {string} is saved")
	public void validate_employee_is_saved(String expectedText) {
		waitForVisibility(personalDetails.personalDetailsForm);
		String expected ="Christiano Ronaldo";
		String actual=personalDetails.employeeName.getText();
		
			Assert.assertEquals("The name does not match", expected,actual);
	}


	@When("user will delete employee id")
	public void user_will_delete_employee_id() {
		 addEmployee.employeeId.clear();
	}

	@When("user create login credentials")
	public void user_create_login_credentials() {
	  jsClick(addEmployee.checkBoxLoginDetails);
	  sendText(addEmployee.username,"alisiadrew@");
	  sendText(addEmployee.password,"Hello4476jhg");
	  sendText(addEmployee.confirmPassword,"Hello4476jhg");
	}

}
