package org.example.StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.AddToCartPage;
import org.example.Pages.CheckOutPage;
import org.example.Pages.SearchPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import static org.example.StepDef.Hooks.driver;

public class F05CheckOut {
    Faker faker = new Faker();
    SoftAssert soft = new SoftAssert();


    @When("The guest user navigate to the shopping cart")
    public void UserGetShoppingCart (){
        SearchPage.SearchFeild().sendKeys("book");
        SearchPage.SearchBtn().click();
        AddToCartPage.AddToCartHomePageBtn().click();
        AddToCartPage.AddToCartConfirmBtn().click();
//        driver.get("https://demo.nopcommerce.com/cart");
        AddToCartPage.ShoppingcartConfirm().click();
    }

    @And("The guest user agrees to the terms and conditions and click on the Check out button")
    public void theGuestUserAgreesToTheTermsAndConditionsAndClickOnTheCheckOutButton() {
        CheckOutPage.IAgreeCheckBox().click();
        CheckOutPage.CheckOutBtn().click();
        CheckOutPage.CheckOutAsGuset().click();
    }

    @And("The guest user add his details: First and Last name, Email, Company")
    public void theGuestUserAddHisDetailsFirstAndLastNameEmailCompany() {
        CheckOutPage.FirstNameField().sendKeys(faker.name().firstName());
        CheckOutPage.LastNameField().sendKeys(faker.name().lastName());
        CheckOutPage.EmailGesutField().sendKeys(faker.internet().emailAddress());
        CheckOutPage.CompanyField().sendKeys(faker.company().name());
    }

    @And("The guest user select the country and state")
    public void theGuestUserSelectTheCountryAndState() {

        int min = 1;
        int maxCountry = 15;

        int RandomCountry = (int)Math.floor(Math.random()*(maxCountry-min+1)+min);

        Select SelectCountry = new Select(CheckOutPage.CountryField());
        SelectCountry.selectByIndex(RandomCountry);

        Select SelectState = new Select(CheckOutPage.StateField());
        SelectState.selectByIndex(0);

    }

    @And("The guest user add city and address details")
    public void theGuestUserAddCityAndAddressDetails() {
        CheckOutPage.CityField().sendKeys(faker.country().name());
        CheckOutPage.Address1Field().sendKeys(faker.country().capital());
        CheckOutPage.Address2Field().sendKeys(faker.country().name());
        CheckOutPage.ZibCodeField().sendKeys(faker.country().countryCode2());
    }

    @And("The user adds Phone number and Fax")
    public void theUserAddsPhoneNumberAndFax() {
        CheckOutPage.PhoneNumField().sendKeys(faker.phoneNumber().phoneNumber());
        CheckOutPage.FaxNumField().sendKeys(faker.country().countryCode3());
    }

    @And("The user clicks on Continue")
    public void theUserClicksOnContinue() {
        CheckOutPage.ContinueBtn().click();
    }

    @And("The user selects the shipping method and clicks on Continue")
    public void theUserSelectsTheShippingMethodAndClicksOnContinue() {
        CheckOutPage.ChooseShippingMethod().click();
        CheckOutPage.ShippingMethodContinueBtn().click();
    }

    @And("The user selects the payment method and clicks on Continue")
    public void theUserSelectsThePaymentMethodAndClicksOnContinue() {
        CheckOutPage.CreditCardPaymentBox().click();
        CheckOutPage.ContinuePaymentBtn().click();
    }


    @And("The user add the payment method details")
    public void theUserAddThePaymentMethodDetails() {
        int min = 0;
        int maxCreditCard =3;
        int RandomCreditCard = (int)Math.floor(Math.random()*(maxCreditCard-min+1)+min);
        Select CreditCard = new Select(CheckOutPage.SelectCridetCard());
        CreditCard.selectByIndex(RandomCreditCard);

        CheckOutPage.CardholderName().sendKeys(faker.name().fullName());
        CheckOutPage.CardNumber().sendKeys("5555555555554444");

        int minYear = 1 ;
        int maxMonth =11;
        int maxYear = 13;
        int RandomMonth = (int)Math.floor(Math.random()*(maxMonth-min+1)+min);
        int RandomYear = (int)Math.floor(Math.random()*(maxYear-minYear+1)+minYear);

        Select CardExpirationMonth = new Select(CheckOutPage.CardExpireMonth());
        CardExpirationMonth.selectByIndex(RandomMonth);
        Select CardExpirationYear = new Select(CheckOutPage.CardExpireYear());
        CardExpirationYear.selectByIndex(RandomYear);

        CheckOutPage.CardCode().sendKeys("5544");
        CheckOutPage.ConfirmBtn().click();

    }

    @And("The guest user clicks on Confirm")
    public void theGuestUserClicksOnConfirm() {
        CheckOutPage.ConfirmOrderBtn().click();

    }

    @Then("The order is confirmed and the user can navigate to order details")
    public void theOrderIsConfirmedAndTheUserCanNavigateToOrderDetails() {
        boolean SuccessMag= CheckOutPage.OrderHasBeenSuccessfully().isDisplayed();
        soft.assertTrue(SuccessMag);

        CheckOutPage.ShowMeOrderDetails().click();
        boolean OrderDetails = CheckOutPage.OrderDetailsDisplay().isDisplayed();
        soft.assertTrue(OrderDetails);
        soft.assertAll();
    }

    @And("The user selects the payment methodTwo and clicks on Continue")
    public void theUserSelectsThePaymentMethodTwoAndClicksOnContinue() {
        CheckOutPage.ContinuePaymentBtn().click();
        CheckOutPage.ConfirmBtn().click();
    }



}
