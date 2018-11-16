package kz.TELE2.pages.tarifs.detalisOfTheTariff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsOfTheTariffPage1390 {
    private WebDriver driver;

    public DetailsOfTheTariffPage1390(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[text()='Детали тарифа']")
    private WebElement detaliesTarifflink;
    @FindBy(xpath = "//span[text()='«Меняй всё» за 1390']")
    private WebElement textIHaveEverythingFor1390;

    public DetailsOfTheTariffPage1390 clickDetaliesTarifflink() {
        detaliesTarifflink.click();
        return new DetailsOfTheTariffPage1390(driver);
    }

    public String textIhaveEverythingFor1390() {
        String text = textIHaveEverythingFor1390.getText();
        return text;
    }
}
