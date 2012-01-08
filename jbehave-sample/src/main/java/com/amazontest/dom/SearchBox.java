package com.amazontest.dom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBox {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchText;

    public void search(String string) {
        searchText.sendKeys(string);
        searchText.submit();
    }
}
