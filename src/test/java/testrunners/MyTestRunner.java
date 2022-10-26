package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/AppFeatures/AccountPage.feature"},
        glue = {"stepdefinitions", "AppHooks"},
        monochrome = true,
        plugin = {"pretty"
        }

)

public class MyTestRunner {

}