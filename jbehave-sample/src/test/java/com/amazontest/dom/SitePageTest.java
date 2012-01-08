package com.amazontest.dom;

import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertNotNull;

public class SitePageTest {

    @Test
    public void shouldGiveSearcBox(){
        SitePage page = new SitePage(getDriverAt("http://amazon.com"));

        assertNotNull(page.getSearchBox());
    }

    private HtmlUnitDriver getDriverAt(String url) {
        HtmlUnitDriver driver = new HtmlUnitDriver();
        driver.get(url);
        return driver;
    }
}
