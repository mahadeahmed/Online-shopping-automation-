package test;

import com.automationexercise.pages.ContactUS;
import com.automationexercise.pages.Enteraccount;
import com.automationexercise.pages.Homepage;
import com.automationexercise.pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ContactusTest extends BaseTest {
    @Test
    public void Contactushouldpass() {
        ContactUS lp = pg.goTo(Homepage.class)
                .clickContactUsBtn()
                .fillupname("Mahade Ahmed")
                .fillemail("mahadeahmed17@gmail.com")
                .fillsubject("Application for emergency order")
                .fillmessage("আমি ভাল আছি। আপনি একটু দয়া করে তাড়াতাড়ি যোগাযোগ করুন।")
                .uploadfile("C:\\Users\\User\\Downloads\\Pic.jpg")
                .clicksubmitBtn()
                .clickokBtn();
        Assert.assertTrue(lp.getsuccessmessage());

    }
}
