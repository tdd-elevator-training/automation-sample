package com.amazontest.steps;

import com.amazontest.dom.ProductList;
import com.amazontest.dom.SitePage;
import org.fest.assertions.Assertions;
import static org.junit.Assert.assertNotNull;

public class DomAssertion {

    public static ProductListAssertion assertThat(ProductList list) {
        return new ProductListAssertion(list);
    }

    public static class ProductListAssertion {
        private ProductList list;
        public ProductListAssertion(ProductList list) {
            this.list = list;
        }

        public void hasElements() {
            assertNotNull(list);
            Assertions.assertThat(list.getItems())
                .isNotEmpty()
                .onProperty("title")
                .isNotEmpty();
        }
    }

    public static SitePageAssertion assertThat(SitePage page) {
        return new SitePageAssertion(page);
    }

    public static class SitePageAssertion {
        private SitePage page;

        public SitePageAssertion(SitePage page) {
            this.page = page;
        }

        public void titleContains(String string) {
            Assertions.assertThat(page.getTitle()).contains(string);
        }
    }



}
