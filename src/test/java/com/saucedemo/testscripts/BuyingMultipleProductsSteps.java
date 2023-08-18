package com.saucedemo.testscripts;

import com.saucedemo.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyingMultipleProductsSteps extends Driver{


    @Given("The user is on the landing page of sauce-demo website")
    public void the_user_is_on_the_landing_page_of_sauce_demo_website() {

    }
    @When("The user types username {string}")
    public void the_user_types_username(String username) {
        landingPage.typeUserName(username);

    }
    @When("The user types password {string}")
    public void the_user_types_password(String password) {

        landingPage.typePassword(password);

    }

    @When("The user clicks the login button")
    public void the_user_clicks_the_login_button() {

        landingPage.clickLoginButton();
    }

    @When("The user adds the first two products to the cart")
    public void the_user_adds_the_first_two_products_to_the_cart() {
        productsPage.addSauceBikeLight();
        productsPage.addBackPackToCart();
    }

    @When("The user clicks on the cart icon")
    public void the_user_clicks_on_the_cart_icon() {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.clickShoppingCart();
    }

    @When("The user clicks checkout button")
    public void the_user_clicks_checkout_button() {

        productsPage.clickCheckOut();
    }

    @When("The user types first-name")
    public void the_user_types_first_name() {

        enterPersonalInformationPage.enterFirstName();
    }

    @When("The user types last-name")
    public void the_user_types_last_name() {

        enterPersonalInformationPage.enterLastName();
    }

    @When("The user types postal-code")
    public void the_user_types_postal_code() {

        enterPersonalInformationPage.enterPostalCode();
    }

    @When("The user clicks the continue button")
    public void the_user_clicks_the_continue_button() {

        enterPersonalInformationPage.clickContinueButton();
    }

    @When("The user clicks the finish button")
    public void the_user_clicks_the_finish_button() {
        verifyOrderInformationPage.clickFinish();
    }

    @Then("The user should be able to see order confirmation text {string}")
    public void the_user_should_be_able_to_see_order_confirmation_text(String text) {
        orderPlacedPage.verifyOrderConfirmationText(text);
    }
}
