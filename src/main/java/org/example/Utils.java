package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Utils extends BasePage  {
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void selectFromDropdownByVisibleIndex(By by, int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    public static void selectFromDropdownByText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectFromDropdownByValue(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }}
