package pages.components;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.*;

public class MyFooter extends BasePage {

    private final By homePageLink = By.linkText("Home");
    private final By aboutPageLink = By.linkText("About");
    private final By myAccountPageLink = By.linkText("My Account");
    private final By cartPageLink = By.linkText("Cart");
    private final By contactUsPageLink = By.linkText("Contact Us");
    private final By womenPageLink = By.xpath("//nav[@class='menu-for-her-container']  //a[text()='Women']");
    private final By womenJeansPageLink = By.linkText("Women’s Jeans");
    private final By womenShirtsPageLink = By.linkText("Women’s Shirts");
    private final By womenShoesPageLink = By.linkText("Women’s Shoes");
    private final By menPageLink = By.xpath("//nav[@class='menu-for-him-container']  //a[text()='Men']");
    private final By menJeansPageLink = By.linkText("Men’s Jeans");
    private final By menShirtsPageLink = By.linkText("Men’s Shirts");
    private final By menShoesPageLink = By.linkText("Men’s Shoes");
    private final By accessoriesPageLink = By.xpath("//nav[@class='menu-for-him-container']  //a[text()='Accessories']");

    private final By appStoreLink = By.cssSelector("img[class*='wp-image-1475']");
    private final By googlePlayLink = By.cssSelector("img[class*='wp-image-1473']");

    public MyFooter(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }


    public void clickHomePageLink(){
        wait.until(ExpectedConditions.elementToBeClickable(homePageLink)).click();
    }
    public void clickAboutPageLink(){
        driver.findElement(aboutPageLink).click();
    }
    public MyAccountPage clickMyAccountPageLink(){
        driver.findElement(myAccountPageLink).click();
        return new MyAccountPage(driver,scenario);
    }
    public CartPage clickCartPageLink(){
        driver.findElement(cartPageLink).click();
        return new CartPage(driver,scenario);
    }
    public ContactUsPage clickContactUsPageLink(){
        driver.findElement(contactUsPageLink).click();
        return new ContactUsPage(driver,scenario);

    }
    public WomenShoesPage clickWomenPageLink(){
        driver.findElement(womenPageLink).click();
        return new WomenShoesPage(driver,scenario);
    }
    public WomenJeansPage clickWomenJeansPageLink(){
        driver.findElement(womenJeansPageLink).click();
        return new WomenJeansPage(driver, scenario);
    }
    public WomenShirtsPage clickWomenShirtsPageLink(){
        driver.findElement(womenShirtsPageLink).click();
        return new WomenShirtsPage(driver, scenario);
    }
    public WomenShoesPage clickWomenShoesPageLink(){
        driver.findElement(womenShoesPageLink).click();
        return new WomenShoesPage(driver, scenario);
    }
    public MenPage clickMenPageLink(){
        driver.findElement(menPageLink).click();
        return new MenPage(driver, scenario);
    }
    public MenJeansPage clickMenJeansPageLink(){
        driver.findElement(menJeansPageLink).click();
        return new MenJeansPage(driver, scenario) ;
    }
    public MenShirtsPage clickMenShirtsPageLink(){
        driver.findElement(menShirtsPageLink).click();
        return new MenShirtsPage(driver, scenario);
    }
    public MenShoesPage clickMenShoesPageLink(){
        driver.findElement(menShoesPageLink).click();
        return new MenShoesPage(driver, scenario);
    }
    public AccessoriesPage clickAccessoriesPageLink(){
        driver.findElement(accessoriesPageLink).click();
        return new AccessoriesPage(driver, scenario);
    }

    public AppDownloadPage clickAppStoreLink(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(appStoreLink))).click();
        return new AppDownloadPage(driver, scenario);
    }

    public AppDownloadPage clickGooglePlayLink(){
        wait.until(ExpectedConditions.elementToBeClickable(googlePlayLink)).click();
        return new AppDownloadPage(driver, scenario);
    }

}
