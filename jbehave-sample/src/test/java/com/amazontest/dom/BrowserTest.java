package com.amazontest.dom;

import org.hamcrest.Matchers;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

public class BrowserTest extends DomTests {

    @Test
    public void shouldOpenBrowser() {
        assertNotNull(getPage("amazon.homepage.htm"));
    }

    @Test
    public void shouldReturnTitleForAmazon() {
        SitePage page = getPage("amazon.homepage.htm");
        assertThat(page.getTitle(), Matchers.containsString("Amazon.com"));
    }

    @Test
    public void shouldReturnTitleForRambler() {
        SitePage page = getPage("ebay.homepage.htm");
        assertThat(page.getTitle(), Matchers.containsString("eBay"));
    }

}

