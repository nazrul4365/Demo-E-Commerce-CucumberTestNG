package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenJeansPage extends BasePage {

    private final By MenJeansPageTitle = By.cssSelector("h1[class='woocommerce-products-header__title page-title']");
    public MenJeansPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public String getMenJeansPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(MenJeansPageTitle)).getText();
    }
}
