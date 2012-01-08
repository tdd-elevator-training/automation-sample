package com.amazontest.dom;

import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SitePageTest {

    @Test
    public void shouldGiveSearchBox(){
        SitePage page = new SitePage(getDriverAt("http://amazon.com"));

        assertNotNull(page.getSearchBox());
    }

    private HtmlUnitDriver getDriverAt(String url) {
        HtmlUnitDriver driver = new HtmlUnitDriver();
        driver.get(url);
        return driver;
    }

    @Test
    public void shouldSearchBySeacrhBox(){
        SitePage page = new SitePage(getDriverAt("http://amazon.com"));

        page.getSearchBox().search("optical mouse");

        assertTrue(page.getTitle().contains("optical mouse"));
    }
}