
package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/Features",
        glue = "StepDefinations",
        monochrome = true,
        plugin = {"pretty","html:target/hmtlreport.html"}
)
public class Runner

{
}
