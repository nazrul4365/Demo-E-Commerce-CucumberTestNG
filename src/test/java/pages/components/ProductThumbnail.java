package pages.components;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.CartPage;

import java.util.List;

public class ProductThumbnail extends BasePage {
    private final By productThumbnails = By.cssSelector("img[class*='attachment-woocommerce_thumbnail']");
    private final By productTitle = By.cssSelector("h1[class='product_title entry-title']");

    private final By addToCartBtn = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
    private final By viewCartBtn = By.linkText("View cart");

    public ProductThumbnail(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public void clickProductThumbnailImage() {
        List<WebElement> product = driver.findElements(productThumbnails);
        product.get(0).click();
    }

    public String getProductTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle)).getText();
    }

    public ProductThumbnail clickAddToCartBtn(){
        driver.findElement(addToCartBtn).click();
        return this;
    }

    public CartPage clickViewCartBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(viewCartBtn)).click();
        return new CartPage(driver, scenario);
    }


}
