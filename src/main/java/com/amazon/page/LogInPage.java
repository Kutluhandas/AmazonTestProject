package com.amazon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends CommonBase {

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    By textEmailLocator = By.id("ap_email");
    By textPasswordLocator = By.id("ap_password");
    By buttonContinueLocator = By.id("continue");
    By buttonSignInLocator = By.id("signInSubmit");

    public void typeEmail(){
        typeSearch(textEmailLocator, "kutluhan.das@hotmail.com");
    }

    public void typePassword(){
        typeSearch(textPasswordLocator, "789456");
    }

    public void stepContinue(){
        click(buttonContinueLocator);
    }

    public void stepSignIn(){
        click(buttonSignInLocator);
    }

}
