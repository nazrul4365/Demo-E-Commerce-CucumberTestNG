package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContext;

import java.io.IOException;
import java.net.URISyntaxException;

public class AddToCartStepDefs extends BaseTest {

    public AddToCartStepDefs(TestContext testContext) throws URISyntaxException, IOException {
        super(testContext);
    }

@When("^I click Add To Cart button$")
    public void iClickAddToCartButton(){
        testContext
                .getHomePage()
                .getProductThumbnail()
                .clickAddToCartBtn();
}

    @And("^I click View Cart button$")
    public void iClickViewCartButton() {
        testContext
                .getHomePage()
                .getProductThumbnail()
                .clickViewCartBtn();
    }

    @Then("^Verify the product name in the Cart page$")
    public void verifyTheProductNameInTheCartPage() {
        testContext
                .getCartPage()
                .productNameWithPartialMatch();
        testUtils.log().info("Product has been successfully stored in the  cart");
    }
}
