package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "/Users/ry/eclipse-workspace/Selenium_Cucumber_FW/Features/OrangeHRM.feature", //path of the .feature file
		glue = "stepDefinitions" //name of the package or path
)

public class TestRunner {

}
