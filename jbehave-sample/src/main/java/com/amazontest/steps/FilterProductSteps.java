package com.amazontest.steps;

import com.amazontest.dom.Browser;
import com.amazontest.dom.ProductItem;
import com.amazontest.dom.SitePage;
import org.hamcrest.Matchers;
import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class FilterProductSteps {
    private Browser browser;
    private SitePage page;

    @Given("browser")
    public void browser() {
        browser = new Browser(new FirefoxDriver());
    }
    
    @When("I open $address")
    public void typeInBrowser(String address) {
        page = browser.open(address);
    }

    @Then("I see home page contains $pageTitle in title")
    public void compareTitlePage(String pageTitle) {
        assertTrue(page.getTitle().contains(pageTitle));
    }

    @Given("search box")
    public void searchBox() {

    }

    @When("I search by $string")
    public void searchProductBy(String string) {
        page.getSearchBox().search(string);
    }

    @Then("I see a product list")
    public void checkProductListAvaluiable() {
        assertNotNull(page.getProductList());
    }

    @Then("each item in a product list contains $string")
    public void checkFoundItemsContains(String string) {
        assertThat(page.getProductList().getItems(),
                allOf(Matchers.<Object>hasProperty("title",
                        containsString(string))));
    }

    @AfterScenario
    public void closeBrowser() {
        browser.close();
    }
}
