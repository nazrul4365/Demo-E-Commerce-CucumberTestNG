package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class StorePage extends BasePage {

    private final By storePageTitle = By.cssSelector("h1. page-title");
    private final By searchField = By.id("woocommerce-product-search-field-0");
    private final By searchBtn = By.xpath("//button[text()='Search']");
    private final By searchItemTitle = By.cssSelector("h1[class='woocommerce-products-header__title page-title']");

    public StorePage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public String getStorePageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(storePageTitle)).getText();
    }


    public StorePage enterTextInTheSearchField() {
        String searchFor = "Blue";
        driver.findElement(searchField).sendKeys(searchFor);
        return this;
    }

    public StorePage clickSearchBtn() {
        driver.findElement(searchBtn).click();
        return this;
    }

    public StorePage searchWithPartialMatch() throws InterruptedException {
        String searchFor = "Blue";
        String actualTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(searchItemTitle)).getText();
        String expectedTitle = "Search results: “" + searchFor + "”";
        Thread.sleep(300);
        Assert.assertEquals(actualTitle, expectedTitle);
        testUtils.log().info("Assertion is done");
        return this;
    }

}
