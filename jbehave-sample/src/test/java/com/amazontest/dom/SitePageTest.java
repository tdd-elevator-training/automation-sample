package com.amazontest.dom;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SitePageTest extends DomTests {

    @Test
    public void shouldGiveSearchBox(){
        SitePage page = getPage("amazon.homepage.htm");

        assertNotNull(page.getSearchBox());
    }

    @Test
    public void shouldSearchBySeacrhBox(){
        SitePage page = getPage("http://amazon.com");

        page.getSearchBox().search("optical mouse");

        assertTrue(page.getTitle().contains("optical mouse"));

        assertNotNull(page.getProductList());
        assertFalse(page.getProductList().getItems().isEmpty());

        assertThat(page.getProductList().getItems())
                .onProperty("title")
                .isNotEmpty();
    }
}
