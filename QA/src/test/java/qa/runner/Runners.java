package qa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/features"}, glue={"stepsDefinitions"})
public class Runners extends AbstractTestNGCucumberTests {

}
