package com.syntax.hr.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// features we use to provide the path of all the feature files
		features = "src/test/resources/features/",
		// glue is where we find implementations for gherkin steps
		// we provide the path of package to get all the step definitions
		glue = "steps",
		// dryRun we use to get the step definitions of undefined steps.
		// if we set it to true, it will quickly scan all gherkin steps whether they are
		// implemented or not
		// if we set it to true, it stops actual execution
		// to execute scripts in real time, we should set this value to false
		dryRun = false, 
		tags = "@smoke",
		// when we set it to true, it simply removes all the irrelevant information
		monochrome = true

)
public class Smoke {

}
