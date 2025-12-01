package com.automationexercise.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.BatchThirteen;

public class SignupPage extends BasePage{
    public SignupPage(WebDriver driver) {
        super(driver);
    }
    public SignupPage fillUsername(String username){
        getWebElement(By.xpath("//input[@placeholder='Name']")).sendKeys(username);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public SignupPage fillemail(String email){
        getWebElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public Enteraccount clicksignupBtn() {
        clickElement(By.cssSelector("button[data-qa='signup-button']"));
        //BatchThirteen.waitForDomStable();
        return goTo(Enteraccount.class);
    }
    public boolean isTitleeshow2() {
        return getWebElementSize(By.cssSelector("div[class='signup-form'] h2")) > 0;
    }
    public SignupPage fillemail2(String email){
        getWebElement(By.cssSelector("input[data-qa='login-email']")).sendKeys(email);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public SignupPage fillpassword(String password){
        getWebElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public SuccessfullRegistration clickLoginBtn() {
        clickElement(By.cssSelector("button[data-qa='login-button']"));
        //BatchThirteen.waitForDomStable();
        return goTo(SuccessfullRegistration.class);
    }

    public SignupPage clickLoginBtn2() {
        clickElement(By.cssSelector("button[data-qa='login-button']"));
        BatchThirteen.waitForDomStable();
        return this;
    }

    public boolean errormessagedisplayed(){
        return getWebElementSize(By.xpath("//p[normalize-space()='Your email or password is incorrect!']")) > 0;
    }


}
