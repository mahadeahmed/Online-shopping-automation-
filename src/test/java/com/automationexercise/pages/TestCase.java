package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase extends BasePage{

    public TestCase(WebDriver driver) {
        super(driver);
    }
    public boolean istestcasepage() {
        return getWebElementSize(By.cssSelector("div[class='panel-group'] h5 span")) > 0;
    }
}
