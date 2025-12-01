package test;
import com.automationexercise.pages.Homepage;
import com.automationexercise.pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest{
    @Test
    public void Titleshouldshow() {
        Homepage lp = pg.goTo(Homepage.class);
        Assert.assertTrue(lp.isTitleshow());

    }

    @Test
    public void Signupshouldshow() {
        SignupPage lp = pg.goTo(Homepage.class)
                .clickLoginBtn();
        Assert.assertTrue(lp.isTitleeshow2());

    }

}
