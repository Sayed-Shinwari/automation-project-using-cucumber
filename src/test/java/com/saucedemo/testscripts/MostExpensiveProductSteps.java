package com.saucedemo.testscripts;

import io.cucumber.java.en.When;

public class MostExpensiveProductSteps extends Driver{
    @When("The user adds the third product to the cart")
    public void the_user_adds_the_third_product_to_the_cart() {
        productsPage.addBoltT_Shirt();
    }

    @When("The user removes the first added product")
    public void the_user_removes_the_first_added_product() {
        productsPage.removeBackPack();

    }

    @When("The user checks if the {string} text is shown in the cart")
    public void the_user_checks_if_the_text_is_shown_in_the_cart(String your_Cart) {
        productsPage.verifyYourCartText(your_Cart);
    }

    @When("The user clicks the continue shopping button")
    public void the_user_clicks_the_continue_shopping_button() {
        productsPage.clickContinueShopping();

    }

    @When("The user selects price high to low option")
    public void the_user_selects_price_high_to_low_option() {
        productsPage.clickHighToLowPrice();

    }

    @When("The user adds the first most expensive product to the cart")
    public void the_user_adds_the_first_most_expensive_product_to_the_cart() {
        productsPage.addFleeceJacket();

    }

    @When("The user checks if there are two products in the cart")
    public void the_user_checks_if_there_are_two_products_in_the_cart() {
        productsPage.Quantity();

    }



}
