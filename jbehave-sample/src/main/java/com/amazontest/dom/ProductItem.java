package com.amazontest.dom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductItem {
    private String title;
    private WebElement element;

    public ProductItem(WebElement element) {
        this.element = element;
    }

    public String getTitle() {
        WebElement aElement = element.findElement(new By.ByXPath("//a[@class='title']"));
        return aElement.getText();
    }
}
