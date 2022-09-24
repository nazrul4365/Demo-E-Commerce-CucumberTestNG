package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AboutPage extends BasePage {

    private final By aboutPageTitle = By.cssSelector("h1.has-text-align-center");

    public AboutPage(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }


    public String getAboutPageTitle(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(aboutPageTitle)).getText();
    }
}
