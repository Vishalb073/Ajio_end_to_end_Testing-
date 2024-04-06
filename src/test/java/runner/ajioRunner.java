package runner;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/vishal/IdeaProjects/ajio_automation/src/test/resources/feature/Ajio.feature",
        glue = "steps",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty" , "html:target/cucumber/report.html"},
        tags = "@search"
)
public class ajioRunner {

}
