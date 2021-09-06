package com.Tabeo.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json","html:target/default-html-reports"},
        features = "src/test/resources/features/",
        glue = "com/Tabeo/Step_Definitions/",
        dryRun = false,
        tags = "@regression"
)
public class CukesRunner {
}