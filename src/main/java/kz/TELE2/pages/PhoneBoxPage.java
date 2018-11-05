package kz.TELE2.pages;

import app.AppPhoneBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

    @FindBy(xpath = "//span[text()='7076421247']")
    private WebElement userPhoneNumber7076421247;

    @FindBy(xpath = "//span[text()='7076421248']")
    private WebElement userPhoneNumber7076421248;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div/div[3]/div/nav/div/div")
    private WebElement logoutButton;

    @Override
    public String getUserPhoneNumber(){
        String userPhone = userPhoneNumber7076421247.getText();
        return userPhoneNumber7076421247.getText();
    }

    @Override
    public String getUserPhoneNumber1(){
        String userPhone = userPhoneNumber7076421248.getText();
        return userPhoneNumber7076421248.getText();
    }

   /* Старая логика
    public boolean isError() {
        if (userPhoneNumber.isDisplayed()) { //отслеживание ошибки при вводенекорретного
            return true;
        } else {
            return false;
        }
    }*/

    @Override
    public void userLogout() {
        logoutButton.click();
    }
}

