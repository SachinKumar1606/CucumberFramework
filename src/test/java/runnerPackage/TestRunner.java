package runnerPackage;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\SachinKumar\\Documents\\Sachin Kumar\\Projects\\CucumberFramework\\src\\test\\java\\features\\login.feature"}
        ,glue={"stepDefination"},
        dryRun = true
)
public class TestRunner {

}
