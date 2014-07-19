package com.amazontest.dom;

import org.hamcrest.Matchers;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

public class BrowserTest extends DomTests {

    @Test
    public void shouldOpenBrowser() {
        assertNotNull(getPage("http://amazon.com"));
    }

    @Test
    public void shouldReturnTitleForAmazon() {
        SitePage page = getPage("http://amazon.com");
        assertThat(page.getTitle(), Matchers.containsString("Amazon.com"));
    }

    @Test
    public void shouldReturnTitleForRambler() {
        SitePage page = getPage("http://ebay.com");
        assertThat(page.getTitle(), Matchers.containsString("eBay"));
    }

}

