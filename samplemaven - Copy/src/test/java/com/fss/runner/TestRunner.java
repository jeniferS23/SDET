package com.fss.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",  // Path to feature files
    glue = "stepDefinitions",  // Path to step definitions
    plugin = {"pretty", "html:target/cucumber-reports.html"},  // Generates HTML report
    monochrome = true,  // Clean console output
    dryRun = false  // Change to true to check missing steps without executing tests
    // strict = true  // Fails test if undefined step is found
)
public class TestRunner {
    
}
