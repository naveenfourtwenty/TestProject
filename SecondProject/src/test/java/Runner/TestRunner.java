package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:reports"},features={"G:\\Greentech\\workspace\\SecondProject\\src\\test\\resources\\Files" },tags={"@Test1"}, glue={"TestDefinition"})

public class TestRunner {

}
