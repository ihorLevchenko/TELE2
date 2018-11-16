package kz.TELE2.pages.tarifs.detalisOfTheTariff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsOfTheTariffPage1790 {
    private WebDriver driver;

    public DetailsOfTheTariffPage1790(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[text()='Детали тарифа']")
    private WebElement detaliesTarifflink;
    @FindBy(xpath = "//span[text()='«Меняй всё» за 1790']")
    private WebElement textIHaveEverythingFor1790;

    public DetailsOfTheTariffPage1790 clickDetaliesTarifflink() {
        detaliesTarifflink.click();
        return new DetailsOfTheTariffPage1790(driver);
    }

    public String textIhaveEverythingFor1790() {
        String text = textIHaveEverythingFor1790.getText();
        return text;
    }
}
