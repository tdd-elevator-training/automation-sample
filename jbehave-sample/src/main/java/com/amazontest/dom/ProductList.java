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

    public ProductList(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    public List<ProductItem> getItems() {
        List<ProductItem> result = new LinkedList<ProductItem>();
        int i = 0;
        try {
            while (true) {
                WebElement element = webDriver.findElement(By.id("result_" + i));
                result.add(new ProductItem(element));
                i++;
            }
        } catch (NoSuchElementException e) {
            return result;
        }
    }
}
