package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/Owner/Downloads/t3_APITesters_APIHackathon_Jan2023-master/t3_APITesters_APIHackathon_Jan2023-master/src/test/resources/features/batch_Module_Features/batch_PostRequest.feature", glue = "stepDefinitions_Batch_Module", dryRun = true, monochrome = true, plugin = {
		"pretty", "html:target/MyReports/reports.html", "json:target/MyReports/reports.json", })

public class testRunner {

}
