package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Deletepage extends BasePage{

    public Deletepage(WebDriver driver) {
        super(driver);
    }

    public boolean isaccountdeleted() {
        return getWebElementSize(By.cssSelector("h2[class='title text-center'] b")) > 0;
    }
    public Homepage ContinueBtn2() {
        clickElement(By.cssSelector(".btn.btn-primary"));
        //BatchThirteen.waitForDomStable();
        return goTo(Homepage.class);
    }
}
