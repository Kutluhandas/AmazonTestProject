package com.amazon.test;

import com.amazon.page.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AmazonTest extends BaseTest{

    HomePage homePage;
    LogInPage logInPage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void log_in(){
        homePage = new HomePage(driver);
        homePage.acceptCookie();
        homePage.stepLogIn();
        logInPage = new LogInPage(driver);
        logInPage.typeEmail();
        logInPage.stepContinue();
        logInPage.typePassword();
        logInPage.stepSignIn();
        Assertions.assertTrue(homePage.isLoggedIn().contains("Alıcı"),"Log in failed!");
    }

    @Test
    @Order(2)
    public void search_product(){
        homePage.typeSearchBox();
        homePage.stepSearch();
    }

    @Test
    @Order(3)
    public void select_product(){
        productsPage = new ProductsPage(driver);
        productsPage.saveProductNameFromProductsPage();
        productsPage.stepSelectProduct();
        productDetailPage = new ProductDetailPage(driver);
        Assertions.assertEquals(productDetailPage.productNameFromDetailPage(),
                productsPage.getProductNameFromProductsPage(), "Products are not equal!");
        productDetailPage.saveProductPriceFromDetailPage();
        productDetailPage.stepAddToCart();
    }

    @Test
    @Order(4)
    public void add_to_cart(){
        cartPage = new CartPage(driver);
        cartPage.stepGoToCart();
        Assertions.assertTrue(cartPage.productPriceFromCartPage()
                .contains(productDetailPage.getProductPriceFromDetailPage()),
                "Product prices are not equal!");

    }

}
