package com.amazontest.steps;

import com.amazontest.dom.Browser;
import com.mypackage.MyList;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class FilterProductSteps {
    private Browser browser;

    @Given("browser")
    public void browser() {
        browser = new Browser();
    }
    
    @When("I open $address")
    public void typeInBrowser(String address) {
        browser.open(address);
    }

    @Then("I see home page contains $logoAlias logo")
    public void findLogoOnPage(String logoAlias) {
    }
}
