package kz.TELE2.pages.tarifs.detalisOfTheTariff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsOfTheTariffPage2590 {
    private WebDriver driver;

    public DetailsOfTheTariffPage2590(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[text()='Детали тарифа']")
    private WebElement detaliesTarifflink;
    @FindBy(xpath = "//span[text()='«Меняй всё» за 2590 ']")
    private WebElement textIHaveEverythingFor2590;

    public DetailsOfTheTariffPage2590 clickDetaliesTarifflink() {
        detaliesTarifflink.click();
        return new DetailsOfTheTariffPage2590(driver);
    }

    public String textIhaveEverythingFor2590() {
        String text = textIHaveEverythingFor2590.getText();
        return text;
    }
}
