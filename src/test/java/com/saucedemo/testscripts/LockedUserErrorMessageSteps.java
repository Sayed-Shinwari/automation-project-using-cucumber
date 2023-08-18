package com.saucedemo.testscripts;

import com.saucedemo.pages.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LockedUserErrorMessageSteps extends Driver{

    @Then("The user should see login error message {string}")
    public void the_user_should_see_login_error_message(String error) {

        landingPage.verifyErrorMessage(error);
    }
}
