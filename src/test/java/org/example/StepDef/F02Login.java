package org.example.StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import static org.example.StepDef.Hooks.driver;

public class F02Login {
    SoftAssert Soft = new SoftAssert();

    @Given("User click on Login From Home Page")
    public void ClickOnLoginBtn (){
        HomePage.LoginNowBtn().click();
    }

    @And("user go to login page")
    public void userGoToLoginPage() {
        String ActualUrl = driver.getCurrentUrl();
        String ExpectedUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        Soft.assertEquals(ActualUrl,ExpectedUrl);

        Soft.assertAll();

    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String arg0, String arg1) {
        LoginPage.EmailField().sendKeys(arg0);
        LoginPage.PasswordField().sendKeys(arg1);
    }

    @And("User Click on Remember me Check Box")
    public void userClickOnRememberMeCheckBox()  {
        LoginPage.RememberMeChickBox().click();

    }

    @And("user press on login button")
    public void userPressOnLoginButton() throws InterruptedException {
        LoginPage.LoginBtn().click();
      //  driver.wait(500);
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        boolean LoginSuccess = LoginPage.UserLoginSuccess().isDisplayed();
        Soft.assertTrue(LoginSuccess);
        Soft.assertAll();
    }




    //Invalid Scenario
    @When("user login with Invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1) {
        Faker faker = new Faker();
        LoginPage.EmailField().sendKeys(faker.internet().emailAddress());
        LoginPage.PasswordField().sendKeys(faker.internet().password());
    }

    @Then("user login to the system Failed")
    public void userLoginToTheSystemFailed() {
        boolean LoginFail = LoginPage.UserLoginFail().isDisplayed();
        Soft.assertTrue(LoginFail);

        String ActualColor = LoginPage.UserLoginFail().getCssValue("color");
        System.out.println("ActualColor");
        String HexColor = Color.fromString(ActualColor).asHex();
        System.out.println(HexColor);
        Soft.assertEquals(HexColor,"#e4434b");
        Soft.assertAll();
    }
}
