package com.amazon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends CommonBase {

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    By productNameLocator = By.id("productTitle");
    By buttonAddToCart = By.id("add-to-cart-button");
//  By productPriceLocator = By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayPadding priceToPay']//span");
    By productPriceTextLocator = By.xpath("//div[@class='a-section a-spacing-micro']//span[@class='a-price-whole']");


    public String productNameFromDetailPage(){
        return getText(productNameLocator);
    }
/*
    public String productPriceInDetailPage(){
        return getAttribute(productPriceLocator, "innerHTML");
    }
*/
    public void saveProductPriceFromDetailPage(){
        productPricesInList.add(getText(productPriceTextLocator));
    }

    public String getProductPriceFromDetailPage(){
        return productPricesInList.get(0);
    }

    public void stepAddToCart(){
        click(buttonAddToCart);
    }
}
