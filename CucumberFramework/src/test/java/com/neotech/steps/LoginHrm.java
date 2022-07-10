package com.neotech.steps;

import java.util.List;
import java.util.Map;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginHrm extends CommonMethods {

	@When("User enters login info {string} and {string}")
	public void user_enters_login_info_and(String username, String password) {
		sendText(login.username, username);
		sendText(login.password, password);

	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		click(login.logInButton);
	}

	@Then("Welcome {string} message is displayed")
	public void welcome_message_is_displayed(String firstname) {

		String expected = firstname;
		String actual = dashboard.accountName.getText();
		System.out.println(firstname);
		if (actual.equals(expected)) {
			System.out.println("Test Passed");

		} else {
			System.out.println("Test failed");
		}
	}

	@When("users enter username,password,click on login button")
	public void loginUsingDataTable(DataTable dataTable) {

		List<Map<String, String>> listMap = dataTable.asMaps();

		for (Map<String, String> Map : listMap) {

			sendText(login.username, Map.get("username"));
			sendText(login.password, Map.get("password"));

			click(login.logInButton);
			wait(3);
			String expected = Map.get("firstname");
			String actual = dashboard.accountName.getText();
			if (actual.equals(expected)) {
				System.out.println("Test Passed");

			} else {
				System.out.println("Test failed");

				dashboard.accountMenu.click();
				dashboard.logout.click();
			}

		}

	}

}
