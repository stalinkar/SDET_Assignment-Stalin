package CucumberAssignment.BDDTestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "src/test/java/CucumberAssignment/Features/OrangHRM.feature",
		glue="CucumberAssignment.StepDefinition",
		dryRun = false,
		monochrome = true,
		publish = true,
		plugin = {"pretty" , "html:target/cucumber.html"},
		tags = "@SmokeTest or @RegressionalTest"
		)


public class OrangeHRMTestRunner {

}
