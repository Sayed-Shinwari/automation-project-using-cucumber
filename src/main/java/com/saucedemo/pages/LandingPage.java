package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement pass_word;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//h3[contains(@data-test, 'error')]")
    private WebElement errorMessage;

    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void typeUserName(String username){
        userName.sendKeys(username);

    }

    public void typePassword(String password){
        pass_word.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void verifyErrorMessage(String error){
        String actualText = errorMessage.getText();

        if (actualText.equals(error)){
            System.out.println("actual text matches expected text");
        }

        else {
            System.out.println("actual text doesn't match expected text");
        }

    }

}
