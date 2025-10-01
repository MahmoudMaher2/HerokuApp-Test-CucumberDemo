package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",        // Path Content
        glue = "StepDefs",                              // Path Source
        tags = "@TestRunner",                       // Annotation
        plugin = {"pretty",
                "html:target/cucumber-reports/Report.html"
        }
)


public class TestRunner extends AbstractTestNGCucumberTests {
}
