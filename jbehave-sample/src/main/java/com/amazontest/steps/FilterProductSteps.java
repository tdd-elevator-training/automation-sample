package com.amazontest.steps;

import com.amazontest.dom.Browser;

import com.amazontest.dom.SitePage;

import org.jbehave.core.annotations.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.amazontest.steps.DomAssertion.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class FilterProductSteps {
    private Browser browser;
    private SitePage page;

    @Given("browser open at '$address'")
    public void browser(String address) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        browser = new Browser(new ChromeDriver());
        page = browser.open(address);
    }

    @Then("I see home page contains '$pageTitle' in title")
    public void compareTitlePage(String pageTitle) {
        assertThat(page).titleContains(pageTitle);
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
        assertThat(page.getProductList()).hasElements();
    }

    @AfterStories
    public void closeBrowser() {
        browser.close();
    }
}
