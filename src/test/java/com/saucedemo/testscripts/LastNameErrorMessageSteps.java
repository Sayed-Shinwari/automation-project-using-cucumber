package com.saucedemo.testscripts;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LastNameErrorMessageSteps extends Driver{

    @When("The user adds the first product to the cart")
    public void the_user_adds_the_first_product_to_the_cart() throws InterruptedException {
        productsPage.addBackPackToCart();
    }

    @Then("The user should see last name error message {string}")
    public void the_user_should_see_last_name_error_message(String error) {
        enterPersonalInformationPage.enterFirstName();
        enterPersonalInformationPage.enterLastName();
        enterPersonalInformationPage.enterPostalCode();
        enterPersonalInformationPage.clickContinueButton();
        enterPersonalInformationPage.readLastNameErrorMessage(error);
    }
}
