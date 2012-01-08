package com.amazontest.steps;

import com.amazontest.dom.Browser;
import com.amazontest.dom.SitePage;
import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
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

    @AfterScenario
    public void closeBrowser() {
        browser.close();
    }
}
