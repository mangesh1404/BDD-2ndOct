package com.runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.testng.runner.RunWith;
//import cucumber.api.junit.Cucumber;


@CucumberOptions
(
	features="src/main/java/com/features",
	glue=   "com.stepdefs",
	plugin={"pretty","html:target"},
	dryRun = false,
	tags= "@login"
)

public class TestRunner extends AbstractTestNGCucumberTests{

	@DataProvider
	public Object[][] scenarios() {
		return super.scenarios();
	}

	
	
	
	
}
