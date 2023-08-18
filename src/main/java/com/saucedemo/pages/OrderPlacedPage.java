package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPlacedPage {
    @FindBy(xpath = "//div[contains(@class, 'complete-text')]")
    private WebElement orderConfirmationText;

    @FindBy(xpath = "//h2[contains(@class, 'complete-header')]")
    private WebElement thankYouText;

    public OrderPlacedPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void verifyOrderConfirmationText(String text){
        String actualText = orderConfirmationText.getText();
        if (actualText.equals(text)){
            System.out.println("actual text matches the expected text");
        }

        else {
            System.out.println("actual text doesn't match the expected text");
        }
    }

    public void verifyThankYouText(String text){
        String actualText = thankYouText.getText();

        if (actualText.equals(text)){
            System.out.println("actual text matches expected text");
        }

        else {
            System.out.println("actual text doesn't match expected text");
        }

    }
}
