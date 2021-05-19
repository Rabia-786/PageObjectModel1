package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ComputerSoftwarePage extends Utils{
   private LoadProperty loadProperty;

    public ComputerSoftwarePage(){

        this.loadProperty = new LoadProperty();
    }
    public void goToSoftwarePage(){
        WebElement element = findElement(By.cssSelector("ul.top-menu li a[href='/computers']"));

        Actions actions = new Actions(getDriver());

        WebElement softwareElement = findElement(By.cssSelector("ul.top-menu li a[href='/software']"));
         actions.moveToElement(element).click(softwareElement).build().perform();
    }

    public void goToComputerMenuPage(){
        WebElement element = findElement(By.cssSelector("ul.top-menu li a[href='/computers']"));

        Actions actions = new Actions(getDriver());

        WebElement softwareElement = findElement(By.cssSelector("ul.top-menu li a[href='/"+loadProperty.computerMenuItem+"']"));
        actions.moveToElement(element).click(softwareElement).build().perform();
    }
    public int getAddToCartButtonCount(){
        List<WebElement> buttons = getElements(By.className("product-box-add-to-cart-button"));
        return buttons.size();

    }
     public int getExpectedComputerMenuItemCount(){
        return loadProperty.computerMenuItemCount;
     }
}

