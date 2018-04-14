package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/home/nadsoft/workspace/ExampleOfCucumber/src/main/java/features/dataDrivenWithoutExampleKeyword.feature",
		glue = {"stepDefination"},
		monochrome = true,
		format = {"pretty", "html:test-output/cucumber-report",
							"json:json-output/cucumber.json",
							"junit:junit-xml/cucumber.xml"},
		strict = true,					
		dryRun = false 
		)

public class dataDrivenWithoutExampleKeywordRunner {

}
