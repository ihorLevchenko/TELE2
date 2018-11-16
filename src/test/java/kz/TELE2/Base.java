package kz.TELE2;

import com.google.common.io.Files;
import kz.TELE2.pages.AnyPage;
import kz.TELE2.pages.LoginPage;
import kz.TELE2.pages.PhoneBoxPage;
import kz.TELE2.pages.roamingPage.RoamingPage;
import kz.TELE2.pages.servicesPage.ServicesPage;
import kz.TELE2.pages.tarifs.TariffsPage;
import kz.TELE2.pages.tarifs.detalisOfTheTariff.DetailsOfTheTariffPage1390;
import kz.TELE2.pages.tarifs.detalisOfTheTariff.DetailsOfTheTariffPage1790;
import kz.TELE2.pages.tarifs.detalisOfTheTariff.DetailsOfTheTariffPage2590;
import org.openqa.selenium.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import java.util.concurrent.TimeUnit;

public class Base extends AbstractWebDriverEventListener {
    public static WebDriver driver;
    public static AnyPage anyPage;
    public static LoginPage loginPage;
    public static PhoneBoxPage phoneBoxPage;
    public static TariffsPage tariffsPage;
    public static DetailsOfTheTariffPage1390 detailsOfTheTariffPage1390;
    public static DetailsOfTheTariffPage1790 detailsOfTheTariffPage1790;
    public static DetailsOfTheTariffPage2590 detailsOfTheTariffPage2590;
    public static RoamingPage roamingPage;
    public static ServicesPage servicesPage;

    //метод setup помеченный аннотацией Junit @BeforeClass.
    // Он будет выполняться один раз перед запуском кода класса:
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/i.levchenko/Desktop/chromedriver");
        driver = new ChromeDriver();
        anyPage = new AnyPage(driver);
        loginPage = new LoginPage(driver);
        phoneBoxPage = new PhoneBoxPage(driver);
        tariffsPage = new TariffsPage(driver);
        detailsOfTheTariffPage1390 = new DetailsOfTheTariffPage1390(driver);
        detailsOfTheTariffPage1790 = new DetailsOfTheTariffPage1790(driver);
        detailsOfTheTariffPage2590 = new DetailsOfTheTariffPage2590(driver);
        roamingPage = new RoamingPage(driver);
        servicesPage = new ServicesPage(driver);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        driver.get("https://tele2.kz/");

    }

    @AfterClass
    public static void testDown() {
        driver.quit();
    }
}
