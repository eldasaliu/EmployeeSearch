package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		// we can specify which feature/features to run
		features="src/test/resources/features/",

		// we can specify where the code for the above feature files is located
		glue="com.neotech.steps",

		// if true, it does not run the java classes. Only checks the feature files
		// if they are glued to some java code
		dryRun=false,//when its false we are running the code

		// tags can do the same thing groups on TestNG do
		//tags="@task1",
				//tags="@task",//the tag that is on the future will run all the scenarios also we can use tag & tag,(both),tag or tag(either one will run
		
		tags ="@login1",
		
		//tags ="@HW4",
		monochrome=true,
		
		
		plugin = {
				// prints the ghergin steps into the console
				"pretty",
				// creates a basic html report in the target folder
				"html:target/cucumber-default-report.html",
				//store every step of execution into this json file
				"json:target/cucumber.json"
				}

)

public class TestRunner {

}
