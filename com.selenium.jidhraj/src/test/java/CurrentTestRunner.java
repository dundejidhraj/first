

import org.junit.runner.RunWith;
import cucumber.api.*;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/jidhRaj-Reports"},
features = "src/test/resources/features",
tags = {"@current"})
public class CurrentTestRunner {

}
