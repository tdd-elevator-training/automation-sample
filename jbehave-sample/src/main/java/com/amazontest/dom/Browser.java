package com.amazontest.dom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Browser {

    public WebDriver webDriver;

    public Browser(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SitePage open(String address) {
        webDriver.get(address);
        return new SitePage(webDriver);
    }

    public void close() {
        webDriver.quit();
    }
}
