package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/Ajio.feature",
        glue = "steps",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber/report.html"}
)
public class ajioRunner {

}
