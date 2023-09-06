package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDef.Hooks.driver;

public class SearchPage {

    public static WebElement SearchBtn (){

        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public static WebElement SearchFeild (){

        return driver.findElement(By.id("small-searchterms"));
    }

    public static WebElement AdvancedSearchCheckBox (){

        return driver.findElement(By.cssSelector("input[id=\"advs\"]"));

    }

    public static WebElement AdvancedSearchCategory (){

        return driver.findElement(By.cssSelector("select[id=\"cid\"]"));

    }

    public static WebElement AdvancedSearchManufacturer (){

        return driver.findElement(By.id("mid"));

    }

    public static WebElement AdvancedSearchBtn (){

        return driver.findElement(By.className("search-button"));

    }

    public static WebElement AdvancedSearchResults (){

        return driver.findElement(By.className("product-item"));

    }

    public static WebElement AdvancedSearchNoResults (){

        return driver.findElement(By.className("no-result"));

    }

}
