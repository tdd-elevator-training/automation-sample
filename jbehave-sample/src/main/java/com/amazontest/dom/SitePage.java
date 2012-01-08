package com.amazontest.dom;

import org.openqa.selenium.WebDriver;

import java.awt.*;

public class SitePage {
    private WebDriver webDriver;

    public SitePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getTitle() {
        return webDriver.getTitle();
    }

    public ProductList getProductList() {
        return new ProductList(webDriver);
    }

    public SearchBox getSearchBox() {
        return new SearchBox(webDriver);
    }
}
