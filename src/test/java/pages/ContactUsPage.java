package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactUsPage extends BasePage {

    private final By contactUsPageTitle = By.cssSelector("h1.has-text-align-center");
    public ContactUsPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public String  getContactUsPageTitle(){
         return wait.until(ExpectedConditions.visibilityOfElementLocated(contactUsPageTitle)).getText();


    }
}
