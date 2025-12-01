package test;

import com.automationexercise.pages.Homepage;
import com.automationexercise.pages.SuccessfullRegistration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SucessfullRegistrationTest extends BaseTest{
    @Test
    public void sucessfullregistrationshouldpass() {
       SuccessfullRegistration lp =  pg.goTo(Homepage.class)
               .clickLoginBtn()
               .fillUsername("Mahade Ahmed")
               .fillemail("mahadeahmed200@gmail.com")
               .clicksignupBtn()
               .clickgenderBtn()
               .fillpassword("Mahade1234")
               .selectDay(10)
               .selectMonth("May")
               .selectYear(1995)
               .clicksignupcheckbox()
               .clickofferscheckbox()
               .fillfirstname("Mahade")
               .filllastname("Ahmed")
               .fillcompany("XYZ Ltd")
               .filladdress1("123 Street")
               .selectcountry("Canada")
               .fillstate("Ontario")
               .fillcity("Toronto")
               .fillzipcode("M4B1B3")
               .fillmobilenumber("1234567890")
               .clickcreateaccountBtn()
               .ContinueBtn();
        Assert.assertTrue(lp.isloggedinaccount());
    }

    @Test
    public void sucessfulldeletedshouldpass() {
        Homepage lp =  pg.goTo(Homepage.class)
                .clickLoginBtn()
                .fillUsername("Mahade Ahmed")
                .fillemail("mahadeahmed2110@gmail.com")
                .clicksignupBtn()
                .clickgenderBtn()
                .fillpassword("Mahade1234")
                .selectDay(10)
                .selectMonth("May")
                .selectYear(1995)
                .clicksignupcheckbox()
                .clickofferscheckbox()
                .fillfirstname("Mahade")
                .filllastname("Ahmed")
                .fillcompany("XYZ Ltd")
                .filladdress1("123 Street")
                .selectcountry("Canada")
                .fillstate("Ontario")
                .fillcity("Toronto")
                .fillzipcode("M4B1B3")
                .fillmobilenumber("1234567890")
                .clickcreateaccountBtn()
                .ContinueBtn()
                .clickdeleteaccountbtn()
                .ContinueBtn2();
        Assert.assertTrue(lp.isTitleshow());
    }
}
