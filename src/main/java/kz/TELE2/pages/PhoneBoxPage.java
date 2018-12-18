package kz.TELE2.pages;

import app.AppPhoneBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneBoxPage implements AppPhoneBoxPage {
    private WebDriver driver;

    public PhoneBoxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /*@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div/div[3]/div/nav/div/span[2]")
    private WebElement userPhoneNumber;*/

    @FindBy(xpath = "//span[contains(text(),'7076421247')]")
    private WebElement userPhoneNumber7076421247;

    @FindBy(xpath = "//span[text()='7076421248']")
    private WebElement userPhoneNumber7076421248;

    @FindBy(xpath = "//span[@class='_1pA6RH']")
    private WebElement logoutButton;

    @FindBy(xpath = "//a[contains(text(),'Тест/КД/Махонина Ольга')]")
    private WebElement profileLink;


    public void clickProfileTabLink(String listName) {
        String listXpath = String.format("//div[@class='_1mVUHT']/a[text()='%s']", listName);
        driver.findElement(By.xpath(listXpath)).click();
    }

    @Override
    public String getUserPhoneNumber47() {
        String userPhone = userPhoneNumber7076421247.getText();
        return userPhoneNumber7076421247.getText();
    }

    @Override
    public String getUserPhoneNumber48() {
        String userPhone = userPhoneNumber7076421248.getText();
        return userPhoneNumber7076421248.getText();
    }

    @Override
    public PhoneBoxPage userLogout() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logoutButton.click();
        return new PhoneBoxPage(driver);
    }

    public PhoneBoxPage clickProfileLink() {
        profileLink.click();
        return new PhoneBoxPage(driver);
    }
}

