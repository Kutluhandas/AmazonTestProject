package com.amazon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends CommonBase {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    By productPriceInBasketLocator = By.xpath("//p[@class='a-spacing-mini']//span");
    By buttonGoToCartLocator = By.id("sw-gtc");

    public void stepGoToCart(){
        click(buttonGoToCartLocator);
    }

    public String productPriceFromCartPage(){
        return getAttribute(productPriceInBasketLocator,
                "innerHTML");
    }

}
