package org.example.StepDef;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.RegisterPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class F01Register {
   // HomePage homepage = new HomePage();
   Faker faker = new Faker();

   @Given("The user clicks on register")
   public void TheUserClicksOnRegister(){
      HomePage.RegisterNowBtn().click();
   }

   @When("User selects gender")
   public void userSelectsGender() {
      RegisterPage.FemaleGender().click();
   }

   @And("user enter firstname  and last name and selects select date of birth")
   public void userEnterFirstnameAndLastNameAndSelectsSelectDateOfBirth() {

      RegisterPage.FirstNameField().sendKeys(faker.name().firstName());
      RegisterPage.LastNameField().sendKeys(faker.name().lastName());

      // Make bounders to my Selector Day,Month,Years
      int min = 1;
      int maxDay = 31;
      int maxMonth = 12;
      int minYear = 1913;
      int maxYear = 2023;

      //Define DropDown list Elements From RegisterPage
      Select selectDay = new Select(RegisterPage.DaySelect());
      Select selectMonth = new Select(RegisterPage.MonthSelect());
      Select selectYear = new Select(RegisterPage.YearSelect());

      //Random Functions Day , Month , Year To Get Random Values to use it
      int RandomDay = (int)Math.floor(Math.random()*(maxDay-min+1)+min);
      int RandomMonth = (int)Math.floor(Math.random()*(maxMonth-min+1)+min);
      int RandomYear = (int)Math.floor(Math.random()*(maxYear-minYear+1)+minYear);

      //Select A Random Values in DropDown
      //selectDay.selectByIndex(RandomDay);
      selectDay.selectByValue(RandomDay+"");
      selectMonth.selectByIndex(RandomMonth);
      selectYear.selectByValue(RandomYear+"");

   }

   @And("User enter a valid Email{string}")
   public void userEnterAValidEmail(String arg0) {
      RegisterPage.EmailField().sendKeys(arg0);
//      String FakeMail = faker.internet().emailAddress();
//      RegisterPage.EmailField().sendKeys(FakeMail);
   }

   @And("User enters company name")
   public void userEntersCompanyName() {
      RegisterPage.CompanyField().sendKeys(faker.company().name());
   }

   @And("newsletter is selected")
   public void newsletterIsSelected() {
      RegisterPage.NewsletterField().click();
   }

   @And("User enters password as {string} and confirms it")
   public void userEntersPasswordAsAndConfirmsIt(String arg0) {
      //String tempPassword = faker.internet().password();
      RegisterPage.Password().sendKeys(arg0);
      RegisterPage.ConfirmPassword().sendKeys(arg0);

   }

   @And("user click the register button")
   public void userClickTheRegisterButton() {
      RegisterPage.RegisterBtn().click();
   }

   @Then("New account is created")
   public void newAccountIsCreated() {
      Assert.assertEquals(RegisterPage.ConfirmRegistration().size(),1);
   }


   // Invalid Actions
   @And("User enter a invalid Email{string}")
   public void userEnterAInvalidEmail(String arg0) {
      RegisterPage.EmailField().sendKeys(faker.internet().domainName());
   }

   @Then("New account Dose not created")
   public void newAccountDose_notCreated() {
      boolean WrongMail = RegisterPage.WrongEmail().isDisplayed();
      Assert.assertTrue(WrongMail);
   }
}
