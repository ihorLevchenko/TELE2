package kz.TELE2.pages;

import app.AppAnyPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnyPage implements AppAnyPage {
    private WebDriver driver;

    public AnyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Верхний блок кнопок
    @FindBy(xpath = "//span[@class='_3jUpGr _27s3oo']")
    private WebElement privateClients;
    @FindBy(xpath = "//span[@class='_3jUpGr']")
    private WebElement corporateClients;
    @FindBy(xpath = "//li[contains(@class,'_1g9a1Y')]//a[contains(@class,'_1TUp3t _1FF0US')][contains(text(),'Личный кабинет')]")
    private WebElement personalAreaButton; //элемент главной страницы, кнопка "Личный кабинет"
    @FindBy(xpath = "//div[@class='uoBndM']//img")
    private WebElement logoButton;
    @FindBy(xpath = "//a[contains(text(),'Тарифы')]")
    private WebElement tariffs;
    @FindBy(xpath = "//li[@class='_1g9a1Y']//a[@class='_1TUp3t _1FF0US'][contains(text(),'Услуги')]")
    private WebElement services;
    @FindBy(xpath = "//li[@class='_1g9a1Y']//a[@class='_1TUp3t _1FF0US'][contains(text(),'Роуминг')]")
    private WebElement roaming;
    @FindBy(xpath = "//nav[contains(@class,'_34bLRy')]//li[4]")
    private WebElement numberPortingPage;


    //Нижний блок кнопок
    @FindBy(xpath = "//div[@class='_3ggRjd']//a[@class='_1TUp3t _1FF0US'][contains(text(),'Личный кабинет')]")
    private WebElement personalAreaButtonDown; //элемент главной страницы, кнопка "Личный кабинет"
    @FindBy(xpath = "//div[@class='_2Iidnl']//img")
    private WebElement logoButtonDown;
    @FindBy(xpath = "//a[contains(text(),'Тарифные планы')]")
    private WebElement tariffPlansDown;
    @FindBy(xpath = "//div[@class='_3ggRjd']//a[@class='_1TUp3t _1FF0US'][contains(text(),'Услуги')]")
    private WebElement servicesDown;
    @FindBy(xpath = "//div[@class='_3ggRjd']//a[@class='_1TUp3t _1FF0US'][contains(text(),'Роуминг')]")
    private WebElement roamingDown;

    //Лицензия (футер)
    @FindBy(xpath = "//span[@class='_28pVPu']")
    private WebElement licenseTELE2;

    //Блок социальных сетей (футер)
    @FindBy(xpath = "//div[@class='vwK8iN']//a[1]")
    private WebElement facebook;
    @FindBy(xpath = "//div[@class='vwK8iN']//a[2]")
    private WebElement twitter;
    @FindBy(xpath = "//div[@class='vwK8iN']//a[3]")
    private WebElement vc_com;
    @FindBy(xpath = "//div[@class='vwK8iN']//a[4]")
    private WebElement youtube;
    @FindBy(xpath = "//div[@class='vwK8iN']//a[5]")
    private WebElement instagram;


    @Override
    public AnyPage clickPersonalAreaButton() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        personalAreaButton.click();
        return new AnyPage(driver);
    }

    public AnyPage clickNumberPortingPage() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        numberPortingPage.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickLogoButton() {
        logoButton.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickPrivateClients() {
        privateClients.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickCorporateClients() {
        corporateClients.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickTariffs() {
        tariffs.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickServices() {
        services.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickRoaming() {
        roaming.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickPersonalAreaButtonDown() {
        personalAreaButtonDown.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickLogoButtonDown() {
        logoButtonDown.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickTariffPlansDown() {
        tariffPlansDown.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickServicesDown() {
        servicesDown.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickRoamingDown() {
        roamingDown.click();
        return new AnyPage(driver);
    }

    @Override
    public String getLicenseTELE2() {
        String tele2License = licenseTELE2.getText();
        return tele2License;
    }

    @Override
    public AnyPage clickFacebook() {
        facebook.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickTwitter() {
        twitter.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickVcCom() {
        vc_com.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickYoutube() {
        youtube.click();
        return new AnyPage(driver);
    }

    @Override
    public AnyPage clickInstagram() {
        instagram.click();
        return new AnyPage(driver);
    }
}
