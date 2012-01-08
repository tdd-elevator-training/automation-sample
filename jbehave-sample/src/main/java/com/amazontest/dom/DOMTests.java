package com.amazontest.dom;

import org.junit.Before;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.net.URL;

public class DomTests {
    private Browser browser;
    private HtmlUnitDriver webDriver;

    @Before
    public void setUp() throws Exception {
        webDriver = new HtmlUnitDriver();
        browser = new Browser(webDriver);
    }

    protected SitePage getPage(String url) {
        URL resource = getClass().getResource("/" + url);
        if (resource != null) {
            return browser.open(resource.toExternalForm());
        } else {
            return browser.open(url);
        }
    }
}
