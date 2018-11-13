package kz.TELE2.pages;

import app.AppAnyPage;
import org.openqa.selenium.By;
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
    @FindBy(xpath = "//li[@class='_1g9a1Y']//a[@class='_1TUp3t _1FF0US'][contains(text(),'Личный кабинет')]")
    private WebElement personalAreaButton; //элемент главной страницы, кнопка "Личный кабинет"
    @FindBy(xpath = "//div[@class='uoBndM']//img")
    private WebElement logoButton;
    @FindBy(xpath = "//a[contains(text(),'Тарифы')]")
    private WebElement tariffs;
    @FindBy(xpath = "//li[@class='_1g9a1Y']//a[@class='_1TUp3t _1FF0US'][contains(text(),'Услуги')]")
    private WebElement services;
    @FindBy(xpath = "//li[@class='_1g9a1Y']//a[@class='_1TUp3t _1FF0US'][contains(text(),'Роуминг')]")
    private WebElement roaming;


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
    public void clickPersonalAreaButton() {
        personalAreaButton.click();
    }

    @Override
    public void clickLogoButton() {
        logoButton.click();
    }

    @Override
    public void clickPrivateClients() {
        privateClients.click();
    }

    @Override
    public void clickCorporateClients() {
        corporateClients.click();
    }

    @Override
    public void clickTariffs() {
        tariffs.click();
    }

    @Override
    public void clickServices() {
        services.click();
    }

    @Override
    public void clickRoaming() {
        roaming.click();
    }

    @Override
    public void clickPersonalAreaButtonDown() {
        personalAreaButtonDown.click();
    }

    @Override
    public void clickLogoButtonDown() {
        logoButtonDown.click();
    }

    @Override
    public void clickTariffPlansDown() {
        tariffPlansDown.click();
    }

    @Override
    public void clickServicesDown() {
        servicesDown.click();
    }

    @Override
    public void clickRoamingDown() {
        roamingDown.click();
    }

    @Override
    public String getLicenseTELE2() {
        String tele2License = licenseTELE2.getText();
        return tele2License;
    }

    @Override
    public void clickFacebook() {
        facebook.click();
    }

    @Override
    public void clickTwitter() {
        twitter.click();
    }

    @Override
    public void clickVcCom() {
        vc_com.click();
    }

    @Override
    public void clickYoutube() {
        youtube.click();
    }

    @Override
    public void clickInstagram() {
        instagram.click();
    }
}
