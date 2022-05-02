package testRuns;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = {"src/test/resources/features/page1"},
		glue = {"stepDefinations","hooks"},
		monochrome = true,
		dryRun = false,
		
		
		plugin = {
				"pretty",
				"html:test-output",
				"json:target/json-report/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
		publish = true //to get cucumber default report
		
		)


public class Run_All extends AbstractTestNGCucumberTests{

}
