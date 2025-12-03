package test;

import com.automationexercise.pages.Homepage;
import com.automationexercise.pages.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasetest extends BaseTest{
    @Test
    public void testcasemessageshouldvisible() {
        TestCase lp = pg.goTo(Homepage.class)
                .clickTestCaseBtn();
        Assert.assertTrue(lp.istestcasepage());
    }
}
