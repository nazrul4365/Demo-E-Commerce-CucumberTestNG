package pages;

import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import pages.components.AppDownloadPage;
import pages.components.MyFooter;
import pages.components.MyHeader;
import pages.components.ProductThumbnail;

public class HomePage extends BasePage {
    private final MyHeader myHeader;
    private final MyFooter myFooter;
    private final ProductThumbnail productThumbnail;
    private final AppDownloadPage appDownloadPage;


    public MyHeader getMyHeader() {
        return myHeader;
    }

    public MyFooter getMyFooter() {
        return myFooter;
    }

    public ProductThumbnail getProductThumbnail() {
        return productThumbnail;
    }
    public AppDownloadPage getAppDownloadPage() {
        return appDownloadPage;
    }
    public HomePage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
        myHeader = new MyHeader(driver,scenario);
        myFooter = new MyFooter(driver,scenario);
        productThumbnail = new ProductThumbnail(driver,scenario);
        appDownloadPage = new AppDownloadPage(driver,scenario);

    }
    public void NavigateToHomePage(String url){
        driver.get(url);
    }


}
