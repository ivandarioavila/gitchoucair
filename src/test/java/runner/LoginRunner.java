package runner;


import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.junit.runner.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        feature="C:src\\test\\resources\\features\\Login.feature",
        tags="{@LoginSuccessful}",
        glue="stepdefinition"
)
public class LoginRunner {


}
