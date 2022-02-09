package runnerPackage;

//import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
//
//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//SachinKumar//Documents//SachinKumar//Projects//CucumberFramework"
                +"//src//test//java//features",
        glue = {"stepDefinition"},
        dryRun = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
