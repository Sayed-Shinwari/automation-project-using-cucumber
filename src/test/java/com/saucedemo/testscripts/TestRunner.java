package com.saucedemo.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "Features//most_expensive_product.feature")

public class TestRunner extends AbstractTestNGCucumberTests {
}
