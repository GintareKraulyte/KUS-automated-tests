package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = "src/test/java/tests",
        glue = {"elements", "pages", "steps", "utils"},
        //tags = {"@Print"},
        plugin = {"html:C:\\KUS Reports",
                "json:C:\\KUS Reports",
                "junit:C:\\KUS Reports",
                "pretty"},
        monochrome = true
)
public class TestRunner {
}