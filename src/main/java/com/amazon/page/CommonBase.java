package com.amazon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class CommonBase {

    WebDriver driver;

    public CommonBase(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        find(locator).click();
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public String getAttribute(By locator, String attributeName) {
        return find(locator).getAttribute(attributeName);
    }

    public String getText(By by) {
        return find(by).getText();
    }

    public void typeSearch(By locator , String text){
        find(locator).sendKeys(text);
    }

    public ArrayList<String> productNamesInList = new ArrayList<>();

    public ArrayList<String> productPricesInList = new ArrayList<>();

//    public HashMap<String, String> product = new HashMap<String, String>();

}
