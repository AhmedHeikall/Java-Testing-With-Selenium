package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{
        private By productsHeader = By.xpath("//span[@data-test=\"title\"]");

        public boolean isProductHeaderDisplayed() {
            return find(productsHeader).isDisplayed();
        }
}
