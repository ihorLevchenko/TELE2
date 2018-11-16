package kz.TELE2.pages.roamingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoamingPage {
    private WebDriver driver;

    public RoamingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h2[text()='Роуминг']")
    private WebElement textRoaming;

    public String textRoaming() {
        String text = textRoaming.getText();
        return text;
    }
}
