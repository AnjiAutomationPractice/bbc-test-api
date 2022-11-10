package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"stepDefinitions"},
        tags = "@scenario1",
        plugin = {"pretty",
                "junit:target/cucumber-reports/Cucumber.xml",
                "json:target/cucumber-reports/Cucumber.json"
        })
public class RunCukesTest extends AbstractTestNGCucumberTests {

}
