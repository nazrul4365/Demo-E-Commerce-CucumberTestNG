package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WomenPage extends BasePage {

    private final By womenPageTitle = By.cssSelector("h1.page-title'");
    public WomenPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }
    public String getWomenPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(womenPageTitle)).getText();
    }
}
