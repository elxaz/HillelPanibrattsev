import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome = true,
        features = {
                "src/test/resources/features/smoke/Hillel_33_home_task.feature",
        },
        glue = "stepdefinitions")

public class SmokeTestRun {
}
