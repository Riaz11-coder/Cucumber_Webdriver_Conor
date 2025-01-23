package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps", "hooks"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        objectFactory = io.cucumber.picocontainer.PicoFactory.class,
        monochrome = true,
        tags = "@google"
)
public class TestRunner {
}
