package com.automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.BatchThirteen;

public class ContactUS extends BasePage{
    public ContactUS(WebDriver driver) {
        super(driver);

    }

    public ContactUS fillupname(String username){
        getWebElement(By.cssSelector("a[href='/contact_us']")).sendKeys(username);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public ContactUS fillemail(String email){
        getWebElement(By.cssSelector("input[placeholder='Email']")).sendKeys(email);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public ContactUS fillsubject(String subject){
        getWebElement(By.cssSelector("input[placeholder='Subject']")).sendKeys(subject);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public ContactUS fillmessage(String message){
        getWebElement(By.cssSelector("#message")).sendKeys(message);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public ContactUS uploadfile(String filepath) {
        driver.findElement(By.cssSelector("input[name='upload_file']")).sendKeys(filepath);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public ContactUS clicksubmitBtn() {
        clickElement(By.cssSelector("input[value='Submit']"));
        BatchThirteen.waitForDomStable();
        return this;
    }
    public ContactUS clickokBtn() {
        driver.switchTo().alert().accept();
        BatchThirteen.waitForDomStable();
        return this;
    }
    public boolean getsuccessmessage(){
        return getWebElementSize(By.cssSelector(".status.alert.alert-success")) > 0;
    }


}
