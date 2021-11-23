package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue= {"org.stepdefinition"},monochrome = true,plugin = {"pretty", "json:src/test/resources/Report/output.json"}, dryRun = false,snippets = SnippetType.CAMELCASE, strict = false)
public class TestRunnerClass {
	
	@AfterClass
	public static void afterclass() {
		String path = System.getProperty("user.dir");
		Reporting.generateJvmReport(path +"\\src\\test\\resources\\Report\\output.json");
		
	}
	
	
}

