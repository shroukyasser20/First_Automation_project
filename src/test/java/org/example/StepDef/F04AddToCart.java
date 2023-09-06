package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.Pages.AddToCartPage;
import org.example.Pages.SearchPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import static org.example.StepDef.Hooks.driver;

public class F04AddToCart {
    @When ("User have a list of products from search results or from navigating list of products in home page")
    public void NavigateSearchPage(){
        SearchPage.SearchFeild().sendKeys("book");
        SearchPage.SearchBtn().click();

    }

    @And("User add the product to the shopping cart")
    public void userAddTheProductToTheShoppingCart() {

        AddToCartPage.AddToCartHomePageBtn().click();
        AddToCartPage.AddToCartConfirmBtn().click();

    }

    @And("User can navigate to the shopping cart to confirm that the product is added")
    public void userConfirmThatTheProductIsAdded() {
        AddToCartPage.ShoppingcartConfirm().click();
        boolean Item = AddToCartPage.ItemAddedToCart().isDisplayed();
        Assert.assertTrue(Item);
    }



}
