package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author Jaypatel
 */


@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",glue = "stepdefinitions",tags = "@userSubscribe")
public class TestRunner {
}
