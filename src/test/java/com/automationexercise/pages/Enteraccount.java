package com.automationexercise.pages;
import com.automationexercise.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import util.BatchThirteen;

public class Enteraccount extends BasePage {
    public Enteraccount(WebDriver driver) {
        super(driver);
    }
    public boolean istitleshow3(){
        return getWebElementSize(By.cssSelector("body > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h2:nth-child(1) > b:nth-child(1)")) > 0;
    }
    public Enteraccount clickgenderBtn() {
        clickElement(By.name("title"));
        BatchThirteen.waitForDomStable();
        return this;
    }

    public Enteraccount fillpassword(String password){
        getWebElement(By.cssSelector("#password")).sendKeys(password);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public Enteraccount selectDay(int day) {
        Select select = new Select(getWebElement(By.id("days")));
        select.selectByVisibleText(String.valueOf(day));
        BatchThirteen.waitForDomStable();
        return this;
    }

    public Enteraccount selectMonth(String month) {
        Select select = new Select(getWebElement(By.id("months")));
        select.selectByVisibleText(month);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public Enteraccount selectYear(int year) {
        Select select = new Select(getWebElement(By.id("years")));
        select.selectByVisibleText(String.valueOf(year));
        BatchThirteen.waitForDomStable();
        return this;
    }

    public Enteraccount clicksignupcheckbox() {
        clickElement(By.cssSelector("#newsletter"));
        BatchThirteen.waitForDomStable();
        return this;
    }
    public Enteraccount clickofferscheckbox() {
        clickElement(By.cssSelector("#optin"));
        BatchThirteen.waitForDomStable();
        return this;
    }

    public Enteraccount fillfirstname(String firstname){
        getWebElement(By.cssSelector("#first_name")).sendKeys(firstname);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public Enteraccount filllastname(String lastname){
        getWebElement(By.cssSelector("#last_name")).sendKeys(lastname);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public Enteraccount fillcompany(String company){
        getWebElement(By.cssSelector("#company")).sendKeys(company);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public Enteraccount filladdress1(String address1){
        getWebElement(By.cssSelector("#address1")).sendKeys(address1);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public Enteraccount selectcountry(String country) {
        Select select = new Select(getWebElement(By.cssSelector("#country")));
        select.selectByVisibleText(country);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public Enteraccount fillstate(String state){
        getWebElement(By.cssSelector("#state")).sendKeys(state);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public Enteraccount fillcity(String city) {
        getWebElement(By.cssSelector("#city")).sendKeys(city);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public Enteraccount fillzipcode(String zipcode){
        getWebElement(By.cssSelector("#zipcode")).sendKeys(zipcode);
        BatchThirteen.waitForDomStable();
        return this;
    }
    public Enteraccount fillmobilenumber(String mobilenumber) {
        getWebElement(By.cssSelector("#mobile_number")).sendKeys(mobilenumber);
        BatchThirteen.waitForDomStable();
        return this;
    }

    public AccountCreated clickcreateaccountBtn() {
        clickElement(By.cssSelector("button[data-qa='create-account']"));
        BatchThirteen.waitForDomStable();
        return goTo(AccountCreated.class);
    }

}
