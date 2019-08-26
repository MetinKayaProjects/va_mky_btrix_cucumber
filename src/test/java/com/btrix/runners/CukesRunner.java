package com.btrix.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                  "json:target/cucumber.json",
                  "rerun:target/return.txt"
                 },
        features = "src/test/resources/com/btrix/features/",
        glue = "com/btrix/step_definitions",
        tags = "@navigation",
        dryRun = false
        )

public class CukesRunner {
}
