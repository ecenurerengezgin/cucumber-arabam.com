package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/Features"},
        glue = {"Steps"},
        tags = "@SignUp",
        plugin = {"pretty", "html:target/site/cucumber-pretty/Login", "json:target/cucumber.json"}
)
public class SignUpTestRunner extends AbstractTestNGCucumberTests {
}
