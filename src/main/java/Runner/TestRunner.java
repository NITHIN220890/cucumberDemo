package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\user\\workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\login.feature", //the path of the feature files
			glue={"stepFunction"} // path of step definition files
			/*format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},*/
			
			/*plugin = {"pretty"},*/
			/*monochrome =true,
			dryRun = true // t make a one to one mapping of step definition and feature file cases
*/			)
	 
	public class TestRunner {
	 
	}