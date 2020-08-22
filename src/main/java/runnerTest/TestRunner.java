package runnerTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features ="C:\\Users\\Nazmul\\Desktop\\cucumJun2000\\src\\main\\java\\features"
   ,glue={"stepDefenition"}


)
public class TestRunner {

}
