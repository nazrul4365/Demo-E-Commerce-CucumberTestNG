package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccessoriesPage extends BasePage {

    private final By accessoriesPageTitle = By.cssSelector("h1.page-title");
    public AccessoriesPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public String getAccessoriesPageTitle(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(accessoriesPageTitle)).getText();
    }
}
