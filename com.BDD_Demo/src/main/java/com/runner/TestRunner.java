package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="src/main/java/com/features",
	glue=   "src/test/java/com.stepdefs",
	plugin= "html:test-output"	
)
public class TestRunner {

}
