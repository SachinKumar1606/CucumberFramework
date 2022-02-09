package runnerPackage;

//import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
//
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\java\\features\\login.feature"},
        glue = {"stepDefinition"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
