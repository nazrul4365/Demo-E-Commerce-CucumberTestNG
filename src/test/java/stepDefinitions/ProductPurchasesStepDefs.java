package stepDefinitions;

import base.BaseTest;



import configurations.User;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.BillingAddress;
import org.testng.Assert;
import utils.JacksonUtils;
import utils.TestContext;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;


public class ProductPurchasesStepDefs extends BaseTest {

    public ProductPurchasesStepDefs(TestContext testContext) throws URISyntaxException, IOException {
        super(testContext);
    }

    @And("^I click checkOut button$")
    public void iClickCheckOutButton(){
        testContext.
                getCartPage().
                clickCheckOutBtn();
    }

    @And("^Verify the title of the CheckOut Page with partial match$")
    public void verifyTheTitleOfTheCheckOutPageWithPartialMatch() {
        testContext.
                getCheckOutPage().
                getTitleWithPartialMatch();

    }

    @When("^I click Click here to login link$")
    public void iClickClickHereToLoginLink() {
        testContext.
                getCheckOutPage().
                clickHereToLogin();
    }

    @And("^I click LOGIN button with Login info$")
    public void iClickLOGINButtonWithLoginInfo() {
        User user = Arrays.stream(config.getConfigUsers()).findAny().get();
        testContext.
                getCheckOutPage().
                LoginInfo(user);
    }

    @And("^I fillUp Billing Details$")
    public void iFillUpBillingDetails() throws URISyntaxException, IOException {
        BillingAddress billingAddress = JacksonUtils.deserializeJson();
        testContext.
                getCheckOutPage().
                setBillingAddress(billingAddress);
    }

    @And("^I select Direct Bank transfer Radio button$")
    public void iSelectDirectBankTransferRadioButton() {
        testContext.getCheckOutPage().selectDirectBankTransfer();

    }

    @And("^I click PLACE ORDER button$")
    public void iClickPLACEORDERButton() {
        testContext.getCheckOutPage().clickPlaceOrder();

    }

    @Then("^Verify the Product purchases success notice$")
    public void verifyTheProductPurchasesSuccessNotice() {
        String actualTitle = testContext.getCheckOutPage().getNotice();
        String expectedTitle = "Thank you. Your order has been received.";
        Assert.assertEquals(actualTitle,expectedTitle);
        testUtils.log().info("Product purchase procedure has Succeed");

    }


}
