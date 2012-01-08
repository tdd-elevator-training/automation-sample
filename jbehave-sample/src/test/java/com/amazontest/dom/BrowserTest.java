package com.amazontest.dom;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

public class BrowserTest {

    private Browser browser;

    @Before
    public void setUp() throws Exception {
        browser = new Browser(new HtmlUnitDriver());
    }

    @Test
    public void shouldOpenBrowser() {
        assertNotNull(getAmazonPage());
    }

    private SitePage getAmazonPage() {
        return browser.open("http://amazon.com");
    }

    @Test
    public void shouldReturnTitleForAmazon() {
        SitePage page = getAmazonPage();
        assertThat(page.getTitle(), Matchers.containsString("Amazon.com"));
    }

    @Test
    public void shouldReturnTitleForRambler() {
        SitePage page = getPage("http://ebay.com");
        assertThat(page.getTitle(), Matchers.containsString("eBay"));
    }

    private SitePage getPage(String url) {
        return browser.open(url);
    }

}

