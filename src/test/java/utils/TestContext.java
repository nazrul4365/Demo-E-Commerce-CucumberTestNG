package utils;


import base.BasePage;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import pages.*;


public class TestContext {
    private WebDriver driver;
    private Scenario scenario;

    private BasePage basePage;
    private HomePage homePage;
    private StorePage storePage;
    private MenPage menPage;
    private WomenPage womenPage;
    private AccessoriesPage accessoriesPage;
    private AccountPage accountPage;
    private AboutPage aboutPage;
    private ContactUsPage contactUsPage;
    private CartPage cartPage;
    private CheckOutPage checkOutPage;
    private WomenJeansPage womenJeansPage;
    private WomenShirtsPage womenShirtsPage;
    private WomenShoesPage womenShoesPage;
    private MenJeansPage menJeansPage;
    private MenShirtsPage menShirtsPage;
    private MenShoesPage menShoesPage;
    private MyAccountPage myAccountPage;


    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }
    public BasePage getBasePage() {return basePage;}
    public HomePage getHomePage() {
        return homePage;
    }

    public StorePage getStorePage() {
        return storePage;
    }

    public MenPage getMenPage() {
        return menPage;
    }

    public WomenPage getWomenPage() {
        return womenPage;
    }

    public AccessoriesPage getAccessoriesPage() {
        return accessoriesPage;
    }

    public AccountPage getAccountPage() {
        return accountPage;
    }

    public AboutPage getAboutPage() {
        return aboutPage;
    }

    public ContactUsPage getContactUsPage() {
        return contactUsPage;
    }

    public CartPage getCartPage() {
        return cartPage;
    }

    public CheckOutPage getCheckOutPage() {
        return checkOutPage;
    }

    public WomenJeansPage getWomenJeansPage() {
        return womenJeansPage;
    }

    public WomenShirtsPage getWomenShirtsPage() {
        return womenShirtsPage;
    }

    public WomenShoesPage getWomenShoesPage() {
        return womenShoesPage;
    }

    public MenJeansPage getMenJeansPage() {
        return menJeansPage;
    }

    public MenShirtsPage getMenShirtsPage() {
        return menShirtsPage;
    }

    public MenShoesPage getMenShoesPage() {
        return menShoesPage;
    }

    public MyAccountPage getMyAccountPage() {
        return myAccountPage;
    }


    public void initializePageObjectClass() {
        driver = getDriver();
        basePage = new BasePage(driver,scenario);
        homePage = new HomePage(driver,scenario);
        storePage = new StorePage(driver,scenario);
        menPage = new MenPage(driver,scenario);
        womenPage = new WomenPage(driver,scenario);
        accessoriesPage = new AccessoriesPage(driver,scenario);
        accountPage = new AccountPage(driver,scenario);
        aboutPage = new AboutPage(driver,scenario);
        contactUsPage = new ContactUsPage(driver,scenario);
        cartPage = new CartPage(driver,scenario);
        checkOutPage = new CheckOutPage(driver,scenario);
        womenJeansPage = new WomenJeansPage(driver,scenario);
        womenShirtsPage = new WomenShirtsPage(driver,scenario);
        womenShoesPage = new WomenShoesPage(driver,scenario);
        menJeansPage = new MenJeansPage(driver,scenario);
        menShirtsPage = new MenShirtsPage(driver,scenario);
        menShoesPage = new MenShoesPage(driver,scenario);
        myAccountPage = new MyAccountPage(driver,scenario);
    }


}
