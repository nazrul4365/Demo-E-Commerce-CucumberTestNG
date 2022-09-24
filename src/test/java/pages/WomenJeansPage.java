package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WomenJeansPage extends BasePage {
private final By womenJeansPageTitle = By.cssSelector("h1[class='woocommerce-products-header__title page-title']");
    public WomenJeansPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public String getWomenJeansPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(womenJeansPageTitle)).getText();
    }
}
