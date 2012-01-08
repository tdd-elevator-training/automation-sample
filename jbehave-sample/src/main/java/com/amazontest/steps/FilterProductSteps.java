package com.amazontest.steps;

import com.amazontest.dom.Browser;
import com.amazontest.dom.SitePage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;


public class FilterProductSteps {
    private Browser browser;
    private SitePage page;

    @Given("browser")
    public void browser() {
        browser = new Browser();
    }
    
    @When("I open $address")
    public void typeInBrowser(String address) {
        page = browser.open(address);
    }

    @Then("I see home page contains $pageTitle in title")
    public void compareTitlePage(String pageTitle) {
        assertThat(page.getTitle(), containsString(pageTitle));
    }
}
