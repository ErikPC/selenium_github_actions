package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = {
                "stepDef",
                "hooks"
        },
        tags = "@profile",
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-report/cucumber.json",
                "rerun:rerun/failed_scenarios.txt",
                "pretty"
        },
        stepNotifications = true

)

public class Runner {

}