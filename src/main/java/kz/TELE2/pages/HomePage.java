package kz.TELE2.pages;

import app.AppHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage implements AppHomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div/div[3]/div/nav/li[4]")
    private WebElement personalAreaButton; //элемент главной страницы, кнопка "Личный кабинет"

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div/div[3]/div/a/div/img")
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
