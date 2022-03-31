package com.amazon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends CommonBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By buttonAcceptCookieLocator = By.id("sp-cc-accept");
    By buttonLogInButtonLocator = By.cssSelector("div[class='nav-line-1-container']");
    By textSearchLocator = By.id("twotabsearchtextbox");
    By buttonSearchLocator = By.id("nav-search-submit-button");
    By signInControlLocator = By.id("glow-ingress-line1");


    public void acceptCookie(){
        if (isDisplayed(buttonAcceptCookieLocator)){
            click(buttonAcceptCookieLocator);
        }
    }

    public void stepLogIn(){
        click(buttonLogInButtonLocator);
    }

    public void typeSearchBox(){
        typeSearch(textSearchLocator, "Samsung");
    }

    public void stepSearch(){
        click(buttonSearchLocator);
    }

    public String isLoggedIn(){
        return getAttribute(signInControlLocator, "innerHTML");
    }
}
