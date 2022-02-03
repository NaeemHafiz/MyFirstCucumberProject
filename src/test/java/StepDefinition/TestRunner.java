package StepDefinition;


import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = {"src/test/resources/Features/login.feature"},
        //path of step definition file
        glue = "StepDefinition",
        monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports", "json:target/JSONReports/report.json", "junit:target/JUnitReports/report.xml"}
//        tags = "@smoketest"
)
public class TestRunner {
}
