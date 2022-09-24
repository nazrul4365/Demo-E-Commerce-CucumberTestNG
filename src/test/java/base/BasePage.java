package base;

import configurations.Config;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.TestUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public Scenario scenario;
    public TestUtils testUtils;

    protected WebDriver driver;


    protected WebDriverWait wait;

    protected Config config;

    public BasePage(WebDriver driver, Scenario scenario) {
        this.driver = driver;
        this.scenario = scenario;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.testUtils = new TestUtils();
    }

}
