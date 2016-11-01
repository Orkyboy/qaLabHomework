package com.example.steps;

import com.example.TestNgTestBase;
import com.example.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
/**
 * Created by pavellebed on 11/1/16.
 */
public class MainPageSteps extends TestNgTestBase {

    private HomePage homePage;

    @Before
    public void beforeScenario(){

    }

    @Given("^customer is on page with url: (.*)$")
    public void CustomerIsOnPageWithUrl(String url) {
        driver.get(url);
    }

    @When("^customer clicks on logo from header$")
    public void customerClicksOnLogoFromHeader() {
        Assert.assertTrue(homePage.header.ebayLogo.isDisplayed(), "Ebay logo is displayed");
        homePage.header.ebayLogo.click();
    }

    @Then("^main page is displayed$")
    public void mainPageIsDisplayed() {
        Assert.assertTrue(homePage.isDisplayed(), "Main page is displayed");
    }
}
