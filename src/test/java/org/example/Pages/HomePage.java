package org.example.Pages;

import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
// Import driver Element
import static org.example.StepDef.Hooks.driver;

public class HomePage {

    public static WebElement RegisterNowBtn (){

        return driver.findElement(By.className("ico-register"));
    }

    public static WebElement LoginNowBtn (){

        return driver.findElement(By.className("ico-login"));
    }


}


