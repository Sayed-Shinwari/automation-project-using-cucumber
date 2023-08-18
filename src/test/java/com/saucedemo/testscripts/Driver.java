package com.saucedemo.testscripts;

import com.saucedemo.pages.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver extends Tools{

    protected static LandingPage landingPage;
    protected static ProductsPage productsPage;
    protected static EnterPersonalInformationPage enterPersonalInformationPage;
    protected static VerifyOrderInformationPage verifyOrderInformationPage;
    protected static OrderPlacedPage orderPlacedPage;

    public static void init(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        landingPage = new LandingPage(driver);
        productsPage = new ProductsPage(driver);
        enterPersonalInformationPage = new EnterPersonalInformationPage(driver);
        verifyOrderInformationPage = new VerifyOrderInformationPage(driver);
        orderPlacedPage = new OrderPlacedPage(driver);
    }

}
