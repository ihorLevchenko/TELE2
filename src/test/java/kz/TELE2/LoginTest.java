package kz.TELE2;

import kz.TELE2.pages.HomePage;
import kz.TELE2.pages.LoginPage;
import kz.TELE2.pages.PhoneBoxPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static WebDriver driver;
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static PhoneBoxPage phoneBoxPage;

    //метод setup помеченный аннотацией Junit @BeforeClass.
    // Он будет выполняться один раз перед запуском кода класса:
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/i.levchenko/Desktop/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        phoneBoxPage = new PhoneBoxPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://tele2.kz/");
    }

    @Test
    public void loginTestPositive47(){
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421247");
        loginPage.inputPasswordField("1234");
        loginPage.clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber();
        Assert.assertEquals("7076421247", phoneUser);
        phoneBoxPage.userLogout();
    }

    @Test
    public void loginTestPositive48(){
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421248");
        loginPage.inputPasswordField("1234");
        loginPage.clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber1();
        Assert.assertEquals("7076421248", phoneUser);
        phoneBoxPage.userLogout();
    }

    @Test
    public void loginTestNegative(){
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421243");
        loginPage.inputPasswordField("4439");
        loginPage.clickLoginButton();
        loginPage.isAllertWrongNumberOrPassword();
        homePage.clickLogoButton();
    }

    @AfterClass
    public static void testDown(){
        driver.quit();
    }
}
