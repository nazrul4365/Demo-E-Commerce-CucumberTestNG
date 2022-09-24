package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utils.TestContext;

import java.io.IOException;
import java.net.URISyntaxException;

public class SearchButtonValidationStepDefs extends BaseTest {

    public SearchButtonValidationStepDefs(TestContext testContext) throws URISyntaxException, IOException {
        super(testContext);
    }

    @And("^I enter text of Search item in the search field$")
    public void iEnterTextOfSearchItemInTheSearchField(){
        testContext.
                getStorePage().
                enterTextInTheSearchField();
    }

    @And("^I click SearchBtn$")
    public void iClickSearchBtn() {
        testContext.
                getStorePage().
                clickSearchBtn();
    }

    @Then("^Verify Search text with partial Match$")
    public void verifySearchTextWithPartialMatch() throws InterruptedException {
        testContext.
                getStorePage().
                searchWithPartialMatch();
        testUtils.log().info("Verify Search text with partial Match");



    }


}
