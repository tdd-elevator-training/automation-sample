package com.amazontest.steps;

import com.amazontest.dom.Browser;

import com.amazontest.dom.SitePage;
import org.fest.assertions.Assertions;

import org.jbehave.core.annotations.*;

import org.openqa.selenium.firefox.FirefoxDriver;



import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class FilterProductSteps {
    private Browser browser;
    private SitePage page;

    @Given("browser open at '$address'")
    public void browser(String address) {
        browser = new Browser(new FirefoxDriver());
        page = browser.open(address);
    }

    @Then("I see home page contains '$pageTitle' in title")
    public void compareTitlePage(String pageTitle) {
        assertTrue(page.getTitle().contains(pageTitle));
    }

    @When("I search by '$string'")
    public void searchProductBy(String string) {
        page.getSearchBox().search(string);
    }

    @Then("I see a product list")
    public void checkProductListAvailable() {
        assertNotNull(page.getProductList());
    }

    @Then("there are some items present")
    public void checkProductListItemsPresent() {
        Assertions.assertThat(page.getProductList().getItems())
            .onProperty("title")
            .isNotEmpty();
    }

    @AfterStories
    public void closeBrowser() {
        browser.close();
    }
}
