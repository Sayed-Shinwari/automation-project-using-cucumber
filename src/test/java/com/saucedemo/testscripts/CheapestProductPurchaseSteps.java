package com.saucedemo.testscripts;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheapestProductPurchaseSteps extends Driver {

    @When("The user clicks on filter icon")
    public void the_user_clicks_on_filter_icon() {
        productsPage.clickFilter();

    }

    @When("The user selects price low to high option")
    public void the_user_selects_price_low_to_high_option() {
        productsPage.clickLowToHighPrice();
    }

    @When("The user adds the first cheapest product to the cart")
    public void the_user_adds_the_first_cheapest_product_to_the_cart() {
        productsPage.addSauceLabsOnesie();
    }

    @When("The user checks if the cheapest product got added to the cart")
    public void the_user_checks_if_the_cheapest_product_got_added_to_the_cart() {
        productsPage.verifySauceLabsOnesieName();

    }

    @Then("The user should be able to see thank you message {string}")
    public void the_user_should_be_able_to_see_thank_you_message(String text) {
        orderPlacedPage.verifyThankYouText(text);

    }


}
