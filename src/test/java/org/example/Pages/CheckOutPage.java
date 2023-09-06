package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.StepDef.Hooks.driver;

public class CheckOutPage {
    public static WebElement IAgreeCheckBox (){
        return driver.findElement(By.id("termsofservice"));
    }

    public static WebElement CheckOutBtn (){
        return driver.findElement(By.id("checkout"));
    }
    public static WebElement CheckOutAsGuset (){
        return driver.findElement(By.cssSelector("button[class=\"button-1 checkout-as-guest-button\"]"));
    }

    public static WebElement FirstNameField (){
        return driver.findElement(By.id("BillingNewAddress_FirstName"));
    }

    public static WebElement LastNameField (){
        return driver.findElement(By.id("BillingNewAddress_LastName"));
    }
    public static WebElement EmailGesutField (){
        return driver.findElement(By.name("BillingNewAddress.Email"));
    }
    public static WebElement CompanyField (){
        return driver.findElement(By.name("BillingNewAddress.Company"));
    }
    public static WebElement CountryField (){
        return driver.findElement(By.cssSelector("select[name=\"BillingNewAddress.CountryId\"]"));
    }
    public static WebElement StateField (){
        return driver.findElement(By.name("BillingNewAddress.StateProvinceId"));
    }
    public static WebElement CityField (){
        return driver.findElement(By.id("BillingNewAddress_City"));
    }
    public static WebElement Address1Field (){
        return driver.findElement(By.name("BillingNewAddress.Address1"));
    }
    public static WebElement Address2Field (){
        return driver.findElement(By.name("BillingNewAddress.Address2"));
    }
    public static WebElement ZibCodeField (){
        return driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }
    public static WebElement PhoneNumField (){
        return driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }
    public static WebElement FaxNumField (){
        return driver.findElement(By.name("BillingNewAddress.FaxNumber"));
    }
    public static WebElement ContinueBtn (){
        return driver.findElement(By.cssSelector("button[onclick=\"Billing.save()\"]"));
    }

    public static WebElement ChooseShippingMethod (){
        return driver.findElement(By.id("shippingoption_1"));
    }
    public static WebElement ShippingMethodContinueBtn (){
        return driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]"));
    }

    public static WebElement CheckPaymentBox (){
        return driver.findElement(By.cssSelector("input[id=\"paymentmethod_0\"]"));
    }
    public static WebElement CreditCardPaymentBox (){
        return driver.findElement(By.cssSelector("input[id=\"paymentmethod_1\"]"));
    }

    public static WebElement SelectCridetCard (){
        return driver.findElement(By.id("CreditCardType"));
    }
    public static WebElement CardholderName (){
        return driver.findElement(By.id("CardholderName"));
    }
    public static WebElement CardNumber (){
        return driver.findElement(By.id("CardNumber"));
    }

    public static WebElement CardExpireMonth (){
        return driver.findElement(By.id("ExpireMonth"));
    }
    public static WebElement CardExpireYear (){
        return driver.findElement(By.id("ExpireYear"));
    }
    public static WebElement CardCode (){
        return driver.findElement(By.id("CardCode"));
    }
    public static WebElement ContinuePaymentBtn (){
        return driver.findElement(By.cssSelector("button[onclick=\"PaymentMethod.save()\"]"));
    }

//   public static WebElement ContinueShippingBtn (){
//        return driver.findElement(By.cssSelector("button[onclick=\"PaymentInfo.save()\"]"));
//    }

    public static WebElement ConfirmBtn (){
        return driver.findElement(By.cssSelector("button[onclick=\"PaymentInfo.save()\"]"));
    }

    public static WebElement ConfirmOrderBtn (){
        return driver.findElement(By.cssSelector("button[onclick=\"ConfirmOrder.save()\"]"));
    }

    public static WebElement OrderHasBeenSuccessfully (){
        return driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
    public static WebElement ShowMeOrderDetails (){
        return driver.findElement(By.cssSelector("div[class=\"details-link\"]"));
    }
    public static WebElement OrderDetailsDisplay (){
        return driver.findElement(By.cssSelector("div[class=\"page order-details-page\"]"));
    }



}
