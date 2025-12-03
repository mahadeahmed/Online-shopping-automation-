package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.BatchThirteen;

public class Homepage extends BasePage{
    public Homepage(WebDriver driver) {
        super(driver);
    }
    public boolean isTitleshow() {
        return getWebElementSize(By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")) > 0;
    }
    public SignupPage clickLoginBtn(){
        clickElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        //BatchThirteen.waitForDomStable();
        return goTo(SignupPage.class);
    }

    public ContactUS clickContactUsBtn(){
        clickElement(By.cssSelector("a[href='/contact_us']"));
        BatchThirteen.waitForDomStable();
        return goTo(ContactUS.class);
    }

    public TestCase clickTestCaseBtn(){
        clickElement(By.cssSelector("a[href='/test_cases']"));
        BatchThirteen.waitForDomStable();
        return goTo(TestCase.class);
    }


}
