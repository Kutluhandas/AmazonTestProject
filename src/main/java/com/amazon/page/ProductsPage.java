package com.amazon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductsPage extends CommonBase {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    By selectedProductLocator = By.xpath("(//img[@class='s-image'])[7]");

    public void stepSelectProduct(){
        click(selectedProductLocator);
    }

    public void saveProductNameFromProductsPage(){
       // product.put("product name", getAttribute(selectedProductLocator,"alt"));
        productNamesInList.add(getAttribute(selectedProductLocator,"alt"));

    }

    public String getProductNameFromProductsPage(){
        //return product.get("product name");
        return productNamesInList.get(0);
    }

}
