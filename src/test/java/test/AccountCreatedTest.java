package test;
import com.automationexercise.pages.AccountCreated;
import com.automationexercise.pages.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AccountCreatedTest extends BaseTest{
    @Test
    public void AccountCreatedShouldPass() {
        AccountCreated lp = pg.goTo(Homepage.class)
                .clickLoginBtn()
                .fillUsername("Mahade Ahmed")
                .fillemail("mahadeahmed19@gmail.com")
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
                .clickcreateaccountBtn();
        Assert.assertTrue(lp.isaccountcreated());
    }

}
