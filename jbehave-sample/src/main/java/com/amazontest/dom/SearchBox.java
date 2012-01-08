package com.amazontest.dom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBox {
    private WebDriver webDriver;

    public SearchBox(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void search(String string) {
        WebElement searchText = webDriver.findElement(By.id("twotabsearchtextbox"));
        searchText.sendKeys(string);
        searchText.submit();
    }
}
