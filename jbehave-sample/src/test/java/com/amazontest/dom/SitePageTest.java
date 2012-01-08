package com.amazontest.dom;

import org.junit.Test;

import static com.amazontest.steps.DomAssertion.assertThat;
import static org.junit.Assert.assertNotNull;

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

        assertThat(page).titleContains("optical mouse");

        assertThat(page.getProductList()).hasElements();
    }
}
