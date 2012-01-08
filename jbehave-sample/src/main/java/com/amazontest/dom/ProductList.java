package com.amazontest.dom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ProductList {
    private WebDriver webDriver;
    private List<ProductItem> productItems;

    public ProductList(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    public List<ProductItem> getItems() {
        productItems = new LinkedList<ProductItem>();
        int i = 0;
        try {
            while (true) {
                WebElement element = webDriver.findElement(By.id("result_" + i));
                productItems.add(new ProductItem(element));
                i++;
            }
        } catch (NoSuchElementException e) {
            return productItems;
        }
    }
}
