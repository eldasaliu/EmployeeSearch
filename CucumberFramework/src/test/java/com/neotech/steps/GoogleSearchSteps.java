package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	@Given("I navigate to Google")//Here we implemeted this step so its glue with the code
	public void i_navigated_to_google() {
		System.out.println("Opening google website");
		
	}

@When("I type a something on the seach button")
public void i_type_a_something_on_the_seach_button() {
	System.out.println("I search fr images");

    // Write code here that turns the phrase above into concrete actions
    
}

@When("I click on the search button")
public void i_click_on_the_search_button() {
	System.out.println("Click on search");

    // Write code here that turns the phrase above into concrete actions
   
}

@Then("I can see the results of the search")
public void i_can_see_the_results_of_the_search() {
	System.out.println("Validate if results are showing");

    // Write code here that turns the phrase above into concrete actions
   
}

@Then("I can count the number of the results")
public void i_can_count_the_number_of_the_results() {
	System.out.println("Count the number of result");

    // Write code here that turns the phrase above into concrete actions
    
}
@When("I say what I want to search")
public void i_say_what_i_want_to_search() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
}