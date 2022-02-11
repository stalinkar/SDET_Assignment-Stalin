package CucumberAssignment.BDDTestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "src/test/java/CucumberAssignment/Features/AdminMenu.feature",
		glue="CucumberAssignment.StepDefinition",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty" , "html:target/cucumber.html"}
		)
public class AdminMenuTestRunner {

}
