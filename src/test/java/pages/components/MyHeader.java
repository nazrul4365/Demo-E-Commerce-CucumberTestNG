package pages.components;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.*;


public class MyHeader extends BasePage {


    private final By homeMenuLink = By.cssSelector("#menu-item-1226 > a");
    private final By storeMenuLink = By.linkText("Store");
    private final By menMenuLink = By.linkText("Men");
    private final By womenMenuLink = By.linkText("Women");
    private final By accessoriesMenuLink = By.linkText("Accessories");
    private final By accountMenuLink = By.linkText("Account");
    private final By aboutMenuLink = By.linkText("About");
    private final By contactUsMenuLink = By.linkText("Contact Us");


    public MyHeader(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }

    public void clickHomeMenuLink() {
        driver.findElement(homeMenuLink).click();
    }

    public StorePage clickStoreMenuLink() {
        driver.findElement(storeMenuLink).click();
        return new StorePage(driver, scenario);
    }


    public void hitStoreMenuLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public String getTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.page-title,h1.has-text-align-center"))).getText();
    }


    public MenPage clickMenMenuLink() {
        driver.findElement(menMenuLink).click();
        return new MenPage(driver, scenario);
    }

    public WomenPage clickWomenMenuLink() {
        driver.findElement(womenMenuLink).click();
        return new WomenPage(driver, scenario);
    }

    public AccessoriesPage clickAccessoriesMenuLink() {
        driver.findElement(accessoriesMenuLink).click();
        return new AccessoriesPage(driver, scenario);
    }

    public AccountPage clickAccountMenuLink() {
        driver.findElement(accountMenuLink).click();
        return new AccountPage(driver, scenario);
    }

    public AboutPage clickAboutMenuLink() {
        driver.findElement(aboutMenuLink).click();
        return new AboutPage(driver, scenario);
    }

    public ContactUsPage clickContactUsMenuLink() {
        driver.findElement(contactUsMenuLink).click();
        return new ContactUsPage(driver, scenario);
    }


}
