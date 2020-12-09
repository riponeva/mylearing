package com.amazon.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestrunner {
	
	@CucumberOptions (
			   features = {"Features"},
			   glue = {"com.amazon.stepdefs"}
			   )
			 public class TestRunner extends AbstractTestNGCucumberTests{}
	

}
