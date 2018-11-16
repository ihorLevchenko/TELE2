package kz.TELE2.pages.tarifs;

import app.AppTariffsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TariffsPage implements AppTariffsPage {
    private WebDriver driver;

    public TariffsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//a[text()='Главная']")
    private WebElement mainPageLink;
    @FindBy(xpath = "//a[text()='Все тарифы']")
    private WebElement allTarifsLink;
    @FindBy(xpath = "//h2[text()='Меняй все']")
    private WebElement textChangeEverything;

    //блок тарифов
    @FindBy(xpath = "//div[@class='_3_0A6Q']//div[1]//div[5]//a[1]//button[1]")
    private WebElement buttonConnect1;
    @FindBy(xpath = "//div[@class='_3_0A6Q']//div[2]//div[5]//a[1]//button[1]")
    private WebElement buttonConnect2;
    @FindBy(xpath = "//div[@class='_3_0A6Q']//div[3]//div[5]//a[1]//button[1]")
    private WebElement buttonConnect3;


    @Override
    public TariffsPage clickOnButtonConnectTatif1() {
        buttonConnect1.click();
        return new TariffsPage(driver);
    }

    @Override
    public TariffsPage clickOnButtonConnectTatif2() {
        buttonConnect2.click();
        return new TariffsPage(driver);
    }

    @Override
    public TariffsPage clickOnButtonConnectTatif3() {
        buttonConnect3.click();
        return new TariffsPage(driver);
    }

    @Override
    public TariffsPage clickMainPageLink() {
        mainPageLink.click();
        return new TariffsPage(driver);
    }

    @Override
    public TariffsPage clickAllTarifsLink() {
        allTarifsLink.click();
        return new TariffsPage(driver);
    }

    @Override
    public String textChangeEverything() {
        String text = textChangeEverything.getText();
        return text;
    }
}
