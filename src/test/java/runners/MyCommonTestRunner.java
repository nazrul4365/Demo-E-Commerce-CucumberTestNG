package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"}
        , glue = "stepDefinitions"
        , tags = "@alwaysRun"
        , monochrome = true
        , plugin = {"pretty"
        , "summary"
        ,"json:target/cucumber-reports/cucumber.json"
        , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)

public class MyCommonTestRunner extends AbstractTestNGCucumberTests {

}
