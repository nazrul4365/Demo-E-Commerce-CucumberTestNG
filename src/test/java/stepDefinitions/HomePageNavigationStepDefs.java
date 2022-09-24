package stepDefinitions;

import base.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jetbrains.annotations.NotNull;
import org.testng.Assert;
import utils.TestContext;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

public class HomePageNavigationStepDefs extends BaseTest {
    public HomePageNavigationStepDefs(TestContext testContext) throws URISyntaxException, IOException {
        super(testContext);
    }

    @Given("^Home page is presented$")
    public void homePageIsPresented() {
        testContext.getHomePage().NavigateToHomePage(config.getBaseURL());

    }

    @Then("^Verify the Title of home page is \"([^\"]*)\"$")
    public void verifyTheTitleOfHomePageIsSomething(String expectedTitle) {

        String actualTitle = testContext.
                getDriver().
                getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        testUtils.log().info("Home page is successfully loaded");
    }

    @When("^I click HomeMenuLink$")
    public void iClickHomeMenuLink() {
        testContext.getHomePage().getMyHeader().clickHomeMenuLink();
    }

    @Then("^Verify that the Title of home page is \"([^\"]*)\"$")
    public void verifyThatTheTitleOfHomePageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("^I click StoreMenuLink$")
    public void iClickStoreMenuLink() throws InterruptedException {
        testContext.
                getHomePage().
                getMyHeader().clickStoreMenuLink();
        Thread.sleep(60);
    }

    @Then("^Verify the Title of Store Page is \"([^\"]*)\"$")
    public void verifyTheTitleOfStorePageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getStorePage().getStorePageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("^I click MenMenuLink$")
    public void iClickMenMenuLink() throws InterruptedException {
        Thread.sleep(60);
        testContext.
                getHomePage().
                getMyHeader().clickMenMenuLink();

    }

    @Then("^Verify the Title of Men Page is \"([^\"]*)\"$")
    public void verifyTheTitleOfMenPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getMenPage().getMenPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @And("^I click WomenMenuLink$")
    public void iClickWomenMenuLink() throws InterruptedException {
        testContext.
                getHomePage().
                getMyHeader().clickWomenMenuLink();
        Thread.sleep(60);
    }

    @Then("^Verify the Title of Women Page is \"([^\"]*)\"$")
    public void verifyTheTitleOfWomenPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getWomenPage().getWomenPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @And("^I click AccessoriesMenuLink$")
    public void iClickAccessoriesMenuLink() throws InterruptedException {
        testContext.
                getHomePage().
                getMyHeader().clickAccessoriesMenuLink();
        Thread.sleep(120);
    }

    @Then("^Verify the Title of Accessories Page is \"([^\"]*)\"$")
    public void verifyTheTitleOfAccessoriesPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getAccessoriesPage().getAccessoriesPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @And("^I click AccountMenuLink$")
    public void iClickAccountMenuLink() throws InterruptedException {
        testContext.
                getHomePage().
                getMyHeader().clickAccountMenuLink();
        Thread.sleep(60);
    }

    @Then("^Verify the Title of Account Page is \"([^\"]*)\"$")
    public void verifyTheTitleOfAccountPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getAccountPage().getAccountPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @And("^I click AboutMenuLink$")
    public void iClickAboutMenuLink() throws InterruptedException {
        testContext.
                getHomePage().
                getMyHeader().clickAboutMenuLink();
        Thread.sleep(60);
    }

    @Then("^Verify the Title of About Page is \"([^\"]*)\"$")
    public void verifyTheTitleOfAboutPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getAboutPage().getAboutPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @And("^I click ContactUsMenuLink$")
    public void iClickContactUsMenuLink() throws InterruptedException {
        testContext.
                getHomePage().
                getMyHeader().clickContactUsMenuLink();
        Thread.sleep(60);
    }

    @Then("^Verify the Title of Contact Us Page is \"([^\"]*)\"$")
    public void verifyTheTitleOfContactUsPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getContactUsPage().getContactUsPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @When("^I click HomePageLink$")
    public void iClickHomePageLink() throws InterruptedException {

        testContext.
                getHomePage().
                getMyFooter().clickHomePageLink();
        Thread.sleep(60);
    }

    @And("^I click About Link$")
    public void iClickAboutLink() throws InterruptedException {

        testContext.
                getHomePage().
                getMyFooter().clickAboutPageLink();
        Thread.sleep(120);
    }

    @Then("^Verify the Title of the About page is \"([^\"]*)\"$")
    public void verifyTheTitleOfTheAboutPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getAboutPage().getAboutPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("^I click My Account Link$")
    public void iClickMyAccountLink() throws InterruptedException {
        testContext.
                getHomePage().
                getMyFooter().clickMyAccountPageLink();
        Thread.sleep(60);
    }

    @When("^I click Cart Link$")
    public void iClickCartLink() throws InterruptedException {
        testContext.
                getHomePage().
                getMyFooter().clickCartPageLink();
        Thread.sleep(60);
    }

    @When("^I click Contact Us Link$")
    public void iClickContactUsLink() throws InterruptedException {

        testContext.
                getHomePage().
                getMyFooter().clickContactUsPageLink();
        Thread.sleep(60);
    }

    @When("^I click Women’s Jeans Link$")
    public void iClickWomensJeansLink() {
        testContext.
                getHomePage().
                getMyFooter().clickWomenJeansPageLink();
    }

    @When("^I click Women’s Shirts Link$")
    public void iClickWomensShirtsLink() {
        testContext.
                getHomePage().
                getMyFooter().clickWomenShirtsPageLink();
    }

    @When("^I click Women’s Shoes Link$")
    public void iClickWomensShoesLink() {
        testContext.
                getHomePage().
                getMyFooter().clickWomenShoesPageLink();
    }

    @When("^I click Men’s Jeans Link$")
    public void iClickMensJeansLink() {
        testContext.
                getHomePage().
                getMyFooter().clickMenJeansPageLink();
    }

    @When("^I click Men’s Shirts Link$")
    public void iClickMensShirtsLink() {
        testContext.
                getHomePage().
                getMyFooter().clickMenShirtsPageLink();
    }

    @When("^I click Men’s Shoes Link$")
    public void iClickMensShoesLink() {
        testContext.
                getHomePage().
                getMyFooter().clickMenShoesPageLink();
    }

    @Then("^Verify the Title of the MyAccountPage is \"([^\"]*)\"$")
    public void verifyTheTitleOfTheMyAccountPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getMyAccountPage().getMyAccountPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^Verify the Title of the CartPage is \"([^\"]*)\"$")
    public void verifyTheTitleOfTheCartPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getCartPage().getCartPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^Verify the Title of the ContactUsPage is \"([^\"]*)\"$")
    public void verifyTheTitleOfTheContactUsPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getContactUsPage().getContactUsPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^Verify the Title of the WomenJeansPage is \"([^\"]*)\"$")
    public void verifyTheTitleOfTheWomenJeansPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getWomenJeansPage().getWomenJeansPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^Verify the Title of the WomenShirtsPage is \"([^\"]*)\"$")
    public void verifyTheTitleOfTheWomenShirtsPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getWomenShirtsPage().getWomenShirtsPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^Verify the Title of the WomenShoesPage is \"([^\"]*)\"$")
    public void verifyTheTitleOfTheWomenShoesPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getWomenShoesPage().getWomenShoesPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^Verify the Title of the MenJeansPage is \"([^\"]*)\"$")
    public void verifyTheTitleOfTheMenJeansPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getMenJeansPage().getMenJeansPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^Verify the Title of the MenShirtsPage is \"([^\"]*)\"$")
    public void verifyTheTitleOfTheMenShirtsPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getMenShirtsPage().getMenShirtsPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^Verify the Title of the MenShoesPage is \"([^\"]*)\"$")
    public void verifyTheTitleOfTheMenShoesPageIsSomething(String expectedTitle) {
        String actualTitle = testContext.
                getMenShoesPage().getMenJeansPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @When("^I click Women page Link$")
    public void iClickWomenPageLink() {
        testContext.
                getHomePage().
                getMyFooter().clickWomenPageLink();
    }

    @Then("^Verify that the Title of Men page is \"([^\"]*)\"$")
    public void verifyThatTheTitleOfMenPageIs(String expectedTitle) {
        String actualTitle = testContext.
                getMenPage().getMenPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("^I click Men page Link$")
    public void iClickMenPageLink() {
        testContext.
                getHomePage().
                getMyFooter().clickMenPageLink();
    }

    @And("^I click Accessories Page Link$")
    public void iClickAccessoriesPageLink() {
        testContext.
                getHomePage().
                getMyFooter().clickAccessoriesPageLink();
    }

    @Then("^Verify that the Title of Accessories page is \"([^\"]*)\"$")
    public void verifyThatTheTitleOfAccessoriesPageIs(String expectedTitle) throws InterruptedException {
        String actualTitle = testContext.
                getAccessoriesPage().
                getAccessoriesPageTitle();
        Thread.sleep(180);
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @When("^I click Apple App Store Link$")
    public void iClickAppleAppStoreLink() throws InterruptedException {
        testContext.
                getHomePage().
                getMyFooter().clickAppStoreLink();
        Thread.sleep(180);
    }

    @Then("^Verify the Title of the Apple App Store in the new browser window is \"([^\"]*)\"$")
    public void verifyTheTitleOfTheAppleAppStoreInTheNewBrowserWindowIs(String expectedTitle) throws InterruptedException {
        String actualTitle = testContext.
                getHomePage().
                getAppDownloadPage().getAppStoreTitle();
        Thread.sleep(180);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @And("^I click Google Play Link$")
    public void iClickGooglePlayLink() {
        testContext.
                getHomePage().
                getMyFooter().clickGooglePlayLink();
    }


    @Then("^Verify the Title of the Google Play Store in the new browser window is \"([^\"]*)\"$")
    public void verifyTheTitleOfTheGooglePlayStoreInTheNewBrowserWindowIs(String expectedTitle) throws InterruptedException {
        String actualTitle = testContext.
                getHomePage().
                getAppDownloadPage().getGooglePlayStoreTitle();
        Thread.sleep(180);
        Assert.assertEquals(actualTitle, expectedTitle);
        testContext.getScenario().log("Intentionally Test has been failing");
    }


    @When("^I click Product Thumbnail image$")
    public void iClickProductThumbnailImage() {
        testContext.
                getHomePage().
                getProductThumbnail().clickProductThumbnailImage();

    }

    @Then("^Verify that the Title of the Product is \"([^\"]*)\"$")
    public void verifyThatTheTitleOfTheProductIs(String expectedTitle) {
        String actualTitle = testContext.
                getHomePage().
                getProductThumbnail().getProductTitle();
        System.out.println(actualTitle);
        System.out.println(expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Then("^verify that all the Header Menu Link's are working properly$")
    public void verifyThatAllTheHeaderMenuLinkSAreWorkingProperly(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            testContext.getHomePage().getMyHeader().hitStoreMenuLink(row.get("LinkText"));
            String actualTitle = testContext.getHomePage().getMyHeader().getTitle();
            Assert.assertEquals(actualTitle, row.get("Title"));

        }
        testUtils.log().info("Menu Link's are working properly");
        testContext.getScenario().log("Menu Link's are working properly--Scenario log");

    }

}

