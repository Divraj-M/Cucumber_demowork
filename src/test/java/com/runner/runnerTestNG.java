package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/feature/Loginpage.feature",
    glue = "com.definition",
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber-reports.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // <-- Ensure the colon `:` is present
    }
)
public class runnerTestNG extends AbstractTestNGCucumberTests {
}
