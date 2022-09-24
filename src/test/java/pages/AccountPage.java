package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPage extends BasePage {

    private final By accountPageTitle = By.cssSelector("h1.has-text-align-center");
    public AccountPage(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }
    public String getAccountPageTitle(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(accountPageTitle)).getText();
    }
}
