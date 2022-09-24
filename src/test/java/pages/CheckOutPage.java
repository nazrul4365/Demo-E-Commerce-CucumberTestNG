package pages;

import base.BasePage;
import configurations.User;
import io.cucumber.java.Scenario;
import objects.BillingAddress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class CheckOutPage extends BasePage {
    private final By pageTitle = By.cssSelector("h1[class='has-text-align-center']");

    private final By clickHereToLoginLink = By.className("showlogin");
    private final By userNameFld = By.name("username");
    private final By passWordFld = By.name("password");
    private final By loginBtn = By.name("login");

    private final By firstNameFld = By.name("billing_first_name");
    private final By lastNameFld = By.name("billing_last_name");
    private final By companyNameFld = By.name("billing_company");
    private final By selectBillingCountryBtn = By.id("billing_country");
    private final By addressLineOneFld = By.id("billing_address_1");
    private final By billingCityFld = By.id("billing_city");
    private final By selectBillingStateBtn = By.id("billing_state");
    private final By billingPostCodeFld = By.id("billing_postcode");
    private final By billingEmailFld = By.id("billing_email");
    private final By selectDirectBankTransferBtn = By.id("payment_method_bacs");
    private final By placeOrderBtn = By.id("place_order");
    private final By successNotice = By.cssSelector("p[class*='woocommerce-notice']");



    public CheckOutPage(WebDriver driver, Scenario scenario) {
        super(driver,scenario);
    }

    public CheckOutPage getTitleWithPartialMatch() {
        String actualTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
        String expectedTitle = "Checkout";
        Assert.assertEquals(actualTitle, expectedTitle);
        return this;
    }

    public CheckOutPage clickHereToLogin() {
        driver.findElement(clickHereToLoginLink).click();
        return this;
    }

    public CheckOutPage enterUserName(String userName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(userNameFld));
        e.clear();
        e.sendKeys(userName);
        return this;
    }

    public CheckOutPage enterPassword(String password) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(passWordFld));
        e.clear();
        e.sendKeys(password);
        return this;
    }

    public CheckOutPage clickLoginBtn() {
        driver.findElement(loginBtn).click();
        return this;
    }

    public CheckOutPage waitForLoginButtonToDisappear() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loginBtn));
        return this;
    }

    public CheckOutPage LoginInfo(User user){

        return enterUserName(user.getUserName()).
                enterPassword(user.getPassword()).
                clickLoginBtn().
                waitForLoginButtonToDisappear();
    }



//    Billing Details
    public CheckOutPage enterFirstName(String firstName){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }
    public  CheckOutPage enterLastName(String lastName){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }
    public  CheckOutPage enterCompanyName(String companyName){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(companyNameFld));
        e.clear();
        e.sendKeys(companyName);
        return this;
    }
    public CheckOutPage selectBillingCountry(String countryName){
        Select select = new Select(driver.findElement(selectBillingCountryBtn));
        select.selectByVisibleText(countryName);
        return this;
    }


    public  CheckOutPage enterAddressLineOne(String addressLineOne){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(addressLineOneFld));
        e.clear();
        e.sendKeys(addressLineOne);
        return this;
    }

    public  CheckOutPage enterBillingCity(String cityName){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(billingCityFld));
        e.clear();
        e.sendKeys(cityName);
        return this;
    }

    public CheckOutPage selectBillingState(String stateName){
        Select select = new Select(driver.findElement(selectBillingStateBtn));
        select.selectByVisibleText(stateName);
        return this;
    }
    public  CheckOutPage enterBillingPostCode(String billingPostCode){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(billingPostCodeFld));
        e.clear();
        e.sendKeys(billingPostCode);
        return this;
    }

    public  CheckOutPage enterBillingEmail(String billingEmail){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(billingEmailFld));
        e.clear();
        e.sendKeys(billingEmail);
        return this;
    }

    public CheckOutPage setBillingAddress(BillingAddress billingAddress){
        return enterFirstName(billingAddress.getFirstName()).
                enterLastName(billingAddress.getLastName()).
                enterCompanyName(billingAddress.getCompanyName()).
                selectBillingCountry(billingAddress.getCountryName()).
                enterAddressLineOne(billingAddress.getAddressLineOne()).
                enterBillingCity(billingAddress.getCity()).
                selectBillingState(billingAddress.getStateName()).
                enterBillingPostCode(billingAddress.getPostCode()).
                enterBillingEmail(billingAddress.getEmail());
    }

    public CheckOutPage selectDirectBankTransfer(){
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(selectDirectBankTransferBtn));
        if (!e.isSelected()) {
            e.click();
        }
        return this;
    }

    public CheckOutPage clickPlaceOrder(){
        driver.findElement(placeOrderBtn).click();
        return this;
    }

    public String getNotice(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successNotice)).getText();
    }




}
