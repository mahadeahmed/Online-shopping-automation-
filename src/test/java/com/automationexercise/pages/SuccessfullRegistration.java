package com.automationexercise.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfullRegistration extends BasePage{
    public SuccessfullRegistration(WebDriver driver) {
        super(driver);
    }
    public boolean isloggedinaccount() {
        return getWebElementSize(By.cssSelector("ul[class='nav navbar-nav'] li a b")) > 0;
    }

    public Deletepage clickdeleteaccountbtn() {
        clickElement(By.cssSelector("a[href='/delete_account']"));
        return goTo(Deletepage.class);
    }
}
