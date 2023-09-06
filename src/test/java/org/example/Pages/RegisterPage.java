package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

// Import driver Element
import java.util.List;

import static org.example.StepDef.Hooks.driver;

public class RegisterPage {

    public static WebElement MaleGender(){
        return driver.findElement(By.id("gender-male"));
    }

    public static WebElement FemaleGender(){
        return driver.findElement(By.id("gender-female"));
    }

    public static WebElement FirstNameField(){

        return driver.findElement(By.name("FirstName"));
    }
    public static WebElement LastNameField(){

        return driver.findElement(By.name("LastName"));
    }

    public static WebElement DaySelect(){
        return driver.findElement(By.name("DateOfBirthDay"));
    }

    public static WebElement MonthSelect(){
        return driver.findElement(By.name("DateOfBirthMonth"));
    }
    public static WebElement YearSelect(){
        return driver.findElement(By.name("DateOfBirthYear"));
    }

    public static WebElement EmailField(){
        return driver.findElement(By.id("Email"));
    }
    public static WebElement CompanyField(){
        return driver.findElement(By.id("Company"));
    }

    public static WebElement NewsletterField(){
        return driver.findElement(By.id("Newsletter"));
    }

    public static WebElement Password (){
        return driver.findElement(By.id("Password"));
    }

    public static WebElement ConfirmPassword(){
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public static WebElement RegisterBtn (){
        return driver.findElement(By.id("register-button"));
    }

    public static List<WebElement> ConfirmRegistration (){
        return driver.findElements(By.cssSelector("div[class=\"result\"]"));
    }

    //Invalid Email Element
    public static WebElement WrongEmail (){
        return driver.findElement(By.id("Email-error"));
    }

}
