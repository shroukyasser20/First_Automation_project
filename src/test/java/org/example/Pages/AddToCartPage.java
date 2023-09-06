package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.StepDef.Hooks.driver;

public class AddToCartPage {
    public static WebElement AddToCartHomePageBtn (){
       return driver.findElement(By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]"));
    }

//    public static List<WebElement> AddToCartHomePageBtn (){
//        return driver.findElements(By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]"));
//    }
 public static WebElement AddToCartConfirmBtn (){
        return driver.findElement(By.id("add-to-cart-button-4"));
 }

    public static WebElement ShoppingcartConfirm (){
        return driver.findElement(By.className("ico-cart"));
    }

    public static WebElement ItemAddedToCart (){
        return driver.findElement(By.linkText("Apple MacBook Pro 13-inch"));
    }
    public static WebElement UpdateQuantityItem (){
        return driver.findElement(By.cssSelector("input[id=\"itemquantity11241\"]"));
    }


}
