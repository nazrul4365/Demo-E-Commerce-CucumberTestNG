package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WomenShirtsPage extends BasePage {

    private final By womenShirtsPageTitle = By.cssSelector("h1[class='woocommerce-products-header__title page-title']");
    public WomenShirtsPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public String getWomenShirtsPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(womenShirtsPageTitle)).getText();
    }
}
