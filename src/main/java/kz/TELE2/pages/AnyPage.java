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

    @FindBy(xpath = "//li[@class='_1g9a1Y']//a[@class='_1TUp3t _1FF0US'][contains(text(),'Личный кабинет')]")
    private WebElement personalAreaButton; //элемент главной страницы, кнопка "Личный кабинет"

    @FindBy(xpath = "//div[@class='uoBndM']//img")
    private WebElement logoButton;

    @Override
    public void clickPersonalAreaButton() {
        personalAreaButton.click();
    }

    @Override
    public void clickLogoButton() {
        logoButton.click();
    }
}
