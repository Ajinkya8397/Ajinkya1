package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\demo3.feature",glue= {"cucumber1"},plugin= {"html:target/cucumber.html"},tags= {"@RegressionTest"})
public class TestRunner {

}
