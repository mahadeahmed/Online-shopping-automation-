package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreated extends BasePage{
    public AccountCreated(WebDriver driver) {
        super(driver);
    }
    public boolean isaccountcreated() {
        return getWebElementSize(By.cssSelector("h2[class='title text-center'] b")) > 0;
    }
    public SuccessfullRegistration ContinueBtn() {
        clickElement(By.cssSelector(".btn.btn-primary"));
        //BatchThirteen.waitForDomStable();
        return goTo(SuccessfullRegistration.class);
    }

}
