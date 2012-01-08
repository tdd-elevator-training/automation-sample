package com.amazontest.dom;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

public class BrowserTest {

    private Browser browser;

    @Before
    public void setUp() throws Exception {
        browser = new Browser();
    }

    @Test
    public void shouldOpenBrowser() {
        assertNotNull(getAmazonPage());
    }

    private SitePage getAmazonPage() {
        return browser.open("http://amazon.com");
    }

    @Test
    public void shouldReturnTitle() {
        SitePage page = getAmazonPage();
        assertThat(page.getTitle(), Matchers.containsString("Amazon.com"));
    }


}

