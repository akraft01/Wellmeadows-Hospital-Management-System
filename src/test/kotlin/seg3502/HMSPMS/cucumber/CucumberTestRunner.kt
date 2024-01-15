package seg3502.HMS-PMS.cucumber

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["src/test/resources"],
    glue = ["seg3502.HMS-PMS.cucumber.steps"]
)
class CucumberTestRunner

