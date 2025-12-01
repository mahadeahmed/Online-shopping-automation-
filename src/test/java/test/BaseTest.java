package test;
import com.automationexercise.pages.BasePage;
import com.automationexercise.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    Page pg;
    @BeforeMethod
    public void setupBrowser(){
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        pg=new BasePage(driver);
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
