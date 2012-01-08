package com.amazontest.dom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Browser {

    public WebDriver webDriver;

    public Browser() {
        webDriver = new HtmlUnitDriver();
    }

    public SitePage open(String address) {
        return new SitePage(webDriver);
    }
}
