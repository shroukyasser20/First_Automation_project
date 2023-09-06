package org.example.StepDef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.SearchPage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class F03Search {
    SoftAssert Soft = new SoftAssert();
    @When("User type a search word in the appropriate search field and click on the search icon")
    public void UserMakeSearchForItem() {
        SearchPage.SearchFeild().sendKeys("book");
        SearchPage.SearchBtn().click();
    }
//    Faker faker = new Faker();
//    String ProductName = faker.commerce().productName();
    @And("The website returns some results")
    public void  WebsiteReturnsSomeResults() {

        boolean Result = SearchPage.AdvancedSearchResults().isDisplayed();
        Assert.assertTrue(Result);
    }

    @And("The user click on advanced search and use it to narrow down the results")
    public void AdvancedSearchUsed() {
       SearchPage.AdvancedSearchCheckBox().click();
       Select selcetCategory = new Select(SearchPage.AdvancedSearchCategory());
       selcetCategory.selectByValue("3");
       Select selectManufacturer = new Select(SearchPage.AdvancedSearchManufacturer());
       selectManufacturer.selectByValue("2");
       SearchPage.AdvancedSearchBtn().click();
    }


    @Then("The final results should match the selected filter and search keywords")
    public void ResultMatchSelectedFilterAndSearchKeyWords() {
       boolean Results =  SearchPage.AdvancedSearchResults().isDisplayed();
        Soft.assertTrue(Results);
        Soft.assertAll();
    }

    @Then("The final results No Result Found that matches your criteria")
    public void NoResultMatchesMsg() {
        boolean NoResults ;

        try
        {
            NoResults = SearchPage.AdvancedSearchNoResults().isDisplayed();
        }
        catch (NoSuchElementException x )
        {
            NoResults = false ;
        }
    }
}
