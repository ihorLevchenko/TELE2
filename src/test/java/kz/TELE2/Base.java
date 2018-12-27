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
import menuProfile.TabRoamingPage;
import numberPortingPage.NumberPortingPage;
import org.openqa.selenium.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Base {
    public static EventFiringWebDriver driver; // public WebDriver driver;
    public static AnyPage anyPage;
    public static LoginPage loginPage;
    public static PhoneBoxPage phoneBoxPage;
    public static TariffsPage tariffsPage;
    public static DetailsOfTheTariffPage1390 detailsOfTheTariffPage1390;
    public static DetailsOfTheTariffPage1790 detailsOfTheTariffPage1790;
    public static DetailsOfTheTariffPage2590 detailsOfTheTariffPage2590;
    public static RoamingPage roamingPage;
    public static ServicesPage servicesPage;
    public static TabRoamingPage tabRoamingPage;
    public static NumberPortingPage numberPortingPage;


    //протоколирование
    public static class MyListener extends AbstractWebDriverEventListener {
        @Override
        public void beforeFindBy(By by, WebElement element, WebDriver driver) {
            super.beforeFindBy(by, element, driver);
            System.out.println(by); //в этом методе выводится сам локатор
        }

        @Override
        public void afterFindBy(By by, WebElement element, WebDriver driver) {
            super.afterFindBy(by, element, driver);
            System.out.println(by + " found"); //выводим информацию о том, что поиск успешно отработал
        }

        @Override
        public void onException(Throwable throwable, WebDriver driver) {
            super.onException(throwable, driver); //этот метод будет вызван, если возникнет какое-то исключение
            System.out.println(throwable);
            //Screenshot!!!!!!!
            File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File screen = new File("screen - " + System.currentTimeMillis() + ".png");
            try {
                Files.copy(tmp, screen);//чтобы не возникало исключений, нужно обернуть в try-catch
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(screen);
        }
    }

    //метод setup помеченный аннотацией Junit @BeforeClass.
    // Он будет выполняться один раз перед запуском кода класса:
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/i.levchenko/Desktop/chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new MyListener()); //для протокола// завернуть проинициализированый драйвер внутрь EventFiringWebDriver и зарегистрировать там этот наблюдатель*/
        anyPage = new AnyPage(driver);
        loginPage = new LoginPage(driver);
        phoneBoxPage = new PhoneBoxPage(driver);
        tariffsPage = new TariffsPage(driver);
        detailsOfTheTariffPage1390 = new DetailsOfTheTariffPage1390(driver);
        detailsOfTheTariffPage1790 = new DetailsOfTheTariffPage1790(driver);
        detailsOfTheTariffPage2590 = new DetailsOfTheTariffPage2590(driver);
        roamingPage = new RoamingPage(driver);
        servicesPage = new ServicesPage(driver);
        tabRoamingPage = new TabRoamingPage(driver);
        numberPortingPage = new NumberPortingPage(driver);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://tele2.kz/");
    }

    @AfterClass
    public static void testDown() {
        driver.quit();
    }
}
