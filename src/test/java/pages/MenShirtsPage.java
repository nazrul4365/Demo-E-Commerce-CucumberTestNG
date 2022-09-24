package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenShirtsPage extends BasePage {

    private final By MenShirtsPageTitle = By.cssSelector("h1[class='woocommerce-products-header__title page-title']");
    public MenShirtsPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public String getMenShirtsPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(MenShirtsPageTitle)).getText();
    }
}
