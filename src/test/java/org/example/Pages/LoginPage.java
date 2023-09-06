package org.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDef.Hooks.driver;
public class LoginPage {
    public static WebElement EmailField (){
        return driver.findElement(By.id("Email"));
    }
    public static WebElement PasswordField (){
        return driver.findElement(By.id("Password"));
    }
    public static WebElement RememberMeChickBox (){
        return driver.findElement(By.name("RememberMe"));
    }
    public static WebElement LoginBtn (){
        return driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

    public static WebElement UserLoginSuccess(){
        return driver.findElement(By.className("ico-account"));
    }
    public static WebElement UserLoginFail(){
        return driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));}


}
