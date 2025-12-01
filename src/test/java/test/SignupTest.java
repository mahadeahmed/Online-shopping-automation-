package test;
import com.automationexercise.pages.Enteraccount;
import com.automationexercise.pages.Homepage;
import com.automationexercise.pages.SignupPage;
import com.automationexercise.pages.SuccessfullRegistration;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SignupTest extends BaseTest {
    @Test
    public void SignupWithCredentialShouldPass() {
        Enteraccount lp = pg.goTo(Homepage.class)
                .clickLoginBtn()
                .fillUsername("Mahade Ahmed")
                .fillemail("mahadeahmed17@gmail.com")
                .clicksignupBtn();
        Assert.assertTrue(lp.istitleshow3());

    }

    @Test
    public void LoginWithCredentialShouldPass() {
        SuccessfullRegistration lp = pg.goTo(Homepage.class)
                .clickLoginBtn()
                .fillemail2("mahadeahmed32@gmail.com")
                .fillpassword("123456")
                .clickLoginBtn();
        Assert.assertTrue(lp.isloggedinaccount());

    }

    @Test
    public void LoginWithWrongCredentialShouldPass() {
        SignupPage lp = pg.goTo(Homepage.class)
                .clickLoginBtn()
                .fillemail2("mahadeahmed3@gmail.com")
                .fillpassword("12345")
                .clickLoginBtn2();
        Assert.assertTrue(lp.errormessagedisplayed());

    }
}