package kz.TELE2.pages;

import app.AppLoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

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
    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/div/input")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//input[@name='pass']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(css = "div._1GxBaJ div._1eMxx_ div.zhDPuI div._2UkYYV div._3etfZQ div._9NvMTO form.TrzPzY > div._1P2sUh:nth-child(4)")
    private WebElement alertWrongPassOrNumber;

    @FindBy(css = "div._1GxBaJ div._1eMxx_ div.zhDPuI div._2UkYYV div._3etfZQ div._9NvMTO form.TrzPzY div.BbY4rI._1b3TVJ:nth-child(1) div.zgdVwM._3dzd4E._1X-NIB > p.PynFgb")
    private WebElement alertWrongPhoneNumber;

    @FindBy(css = "div._1GxBaJ div._1eMxx_ div.zhDPuI div._2UkYYV div._3etfZQ div._9NvMTO form.TrzPzY div.BbY4rI._1b3TVJ:nth-child(1) div.zgdVwM._3dzd4E._1X-NIB > p.PynFgb")
    private WebElement alertEmptyPhoneNumberField;

    /*методы для работы со элементами*/

    public String emptyPhoneNumberField() {
        String alert = alertEmptyPhoneNumberField.getText();
        return alertEmptyPhoneNumberField.getText();
    }

    public String wrongPhoneNumber() {
        String alert = alertWrongPhoneNumber.getText();
        return alertWrongPhoneNumber.getText();
    }

    @Override
    public void inputPhoneNumberField(String phone) {
        phoneNumberField.sendKeys(Keys.HOME + phone);
    }

    @Override
    public void clearOneNumber() {
        phoneNumberField.sendKeys(Keys.BACK_SPACE);
    }

    @Override
    public void clearAllPhoneNumberField() {
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
    }

    @Override
    public void inputPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    @Override
    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean isAlertWrongNumberOrPassword() {
        if (alertWrongPassOrNumber.isDisplayed()) { //отслеживание ошибки при вводе некорретного пароля или номера
            return true;
        } else {
            return false;
        }
    }

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

