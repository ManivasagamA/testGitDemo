package CucumberOptions;

//import org.junit.runner.RunWith;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/java/CucumberOptions",
glue="StepDefinitions"
		)
public class TestRunner extends AbstractTestNGCucumberTests{


	

}
