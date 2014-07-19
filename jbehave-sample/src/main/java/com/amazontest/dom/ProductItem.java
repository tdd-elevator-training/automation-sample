package com.amazontest.dom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductItem {
    private WebElement element;

    public ProductItem(WebElement element) {
        this.element = element;
    }

    public String getTitle() {
        return findByXpath("//span[@class='lrg bold']").getText();
    }

    private WebElement findByXpath(String xpathExpression) {
        return element.findElement(new By.ByXPath(xpathExpression));
    }
}
