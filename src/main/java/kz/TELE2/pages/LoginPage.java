package kz.TELE2.pages;

import app.AppLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage implements AppLoginPage {
    private WebDriver driver;

    /*private static String URL_MATCH = "registration";*/

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this); //
        this.driver = driver;
        //В конструкторе класса, необходимо прописать метод PageFactory.initElements(driver, this),
        // который будет заниматься инициализацией полей класса.
    }

    //Находим вэб элементы
    @FindBy(xpath = "//input[contains(@value,'+7')]")
    private WebElement phoneNumberField;
    @FindBy(xpath = "//input[contains(@name,'pass')]")
    private WebElement passwordField;
    @FindBy(xpath = "//button[text()='Войти']")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@class='_1P2sUh' and text()='Неверный телефон или пароль']")
    private WebElement alertWrongPassOrNumber;
    @FindBy(xpath = "//p[@class='PynFgb' and string-length(text())]")
    private WebElement alertWrongPhoneNumberOrEmptyField;


    /*методы для работы со элементами*/
    @Override
    public String wrongPhoneNumberOrEmptyField() {
        String alert = alertWrongPhoneNumberOrEmptyField.getText();
        return alert;
    }

    public String wrongPhoneNumberOrPass() {
        String alert = alertWrongPassOrNumber.getText();
        return alert;
    }

    @Override
    public LoginPage inputPhoneNumberField(String phone) {
        phoneNumberField.sendKeys(Keys.HOME + phone);
        return new LoginPage(driver);
    }

    @Override
    public LoginPage inputPasswordField(String password) {
        passwordField.sendKeys(password);
        return new LoginPage(driver);
    }

    @Override
    public LoginPage clickLoginButton() {
        loginButton.click();
        return new LoginPage(driver);
    }

    @Override
    public LoginPage clearAllPhoneNumberField() {
        phoneNumberField.sendKeys(Keys.BACK_SPACE);
        phoneNumberField.sendKeys(Keys.BACK_SPACE);
        phoneNumberField.sendKeys(Keys.BACK_SPACE);
        phoneNumberField.sendKeys(Keys.BACK_SPACE);
        phoneNumberField.sendKeys(Keys.BACK_SPACE);
        phoneNumberField.sendKeys(Keys.BACK_SPACE);
        phoneNumberField.sendKeys(Keys.BACK_SPACE);
        phoneNumberField.sendKeys(Keys.BACK_SPACE);
        phoneNumberField.sendKeys(Keys.BACK_SPACE);
        phoneNumberField.sendKeys(Keys.BACK_SPACE);
        return new LoginPage(driver);
    }

    @Override
    public LoginPage clearOneNumber() {
        phoneNumberField.sendKeys(Keys.BACK_SPACE);
        return new LoginPage(driver);
    }

    @Override
    public boolean isDisableButton() { //Кнокпа войти, состояние активно или нет
        // (состояние кнопки Disable)
        if (!loginButton.isEnabled()) {
            return true;
        } else
            return false;
    }
}

    /*public String getAllertWrongNumberOrPassword(){
        String wrongPassOrNumber = allert.getText();
        return allert.getText();
    }*/

    /*    public AppLoginPage (WebDriver driver) {
            // проверить, что вы находитесь на верной странице
            if (!driver.getCurrentUrl().contains(URL_MATCH)) {
                throw new IllegalStateException(
                        "This is not the page you are expected"
                );
            }

            PageFactory.initElements(driver, this);
            this.driver = driver;
        }*/

/*    public boolean clickOnElement(WebElement element) {
        try { //другая реализация
            element.click();
            log.info("Element was clicked");
            return true;
        } catch (Exception e) {
            log.error("Element was not click");
            return false;
        }
    }*/

