package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenPage extends BasePage {
    private final By menPageTitle = By.cssSelector("h1.page-title");
    public MenPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public String getMenPageTitle(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(menPageTitle)).getText();
    }

}
