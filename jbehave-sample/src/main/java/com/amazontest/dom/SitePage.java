package com.amazontest.dom;

import org.openqa.selenium.WebDriver;

public class SitePage {
    private WebDriver webDriver;

    public SitePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getTitle() {
        return "Amazon.com";
    }
}
