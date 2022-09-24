package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WomenShoesPage extends BasePage {

    private final By womenShoesPageTitle = By.cssSelector("h1[class='woocommerce-products-header__title page-title']");
    public WomenShoesPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public String getWomenShoesPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(womenShoesPageTitle)).getText();
    }
}
