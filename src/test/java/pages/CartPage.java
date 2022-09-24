package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CartPage extends BasePage {

private final By cartPageTitle =By.cssSelector("h1[class='has-text-align-center']");

private final By productName = By.linkText("Blue Shoes");

private final By checkOutBtn = By.cssSelector("a[class='checkout-button button alt wc-forward']");
    public CartPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public String getCartPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cartPageTitle)).getText();
    }

    public String getProductName(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productName)).getText();
    }

    public CheckOutPage clickCheckOutBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(checkOutBtn)).click();
        return new CheckOutPage(driver, scenario);
    }

    public CartPage productNameWithPartialMatch(){
        String searchProductName = "Blue Shoes";
        String actualProductName = driver.findElement(productName).getText();
        String expectedProductName = "Blue Shoes";
        Assert.assertEquals(actualProductName,expectedProductName);
        return this;
    }

}
