package kz.TELE2.pages.servicesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {
    private WebDriver driver;

    public ServicesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h2[text()='Услуги Tele2']")
    private WebElement textServicesTELE2;

    public String textServicesTELE2() {
        String text = textServicesTELE2.getText();
        return text;
    }
}
