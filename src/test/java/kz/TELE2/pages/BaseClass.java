package kz.TELE2.pages;

import com.google.common.io.Files;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public EventFiringWebDriver driver; // public WebDriver driver;

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

    @Before
    public void start() {
    /*    if (driver != null) {
            return;
        }*/
        System.setProperty("webdriver.chrome.driver", "/Users/i.levchenko/Desktop/chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new MyListener()); //для протокола// завернуть проинициализированый драйвер внутрь EventFiringWebDriver и зарегистрировать там этот наблюдатель*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void stop() {
        driver.quit();
    }
}



