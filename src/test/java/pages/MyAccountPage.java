package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccountPage extends BasePage {
    private final By myAccountPageTitle = By.cssSelector("h1.has-text-align-center");


    public MyAccountPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public String getMyAccountPageTitle(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountPageTitle)).getText();
    }
}
