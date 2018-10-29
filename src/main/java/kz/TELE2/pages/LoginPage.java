package kz.TELE2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    protected WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this); //
        this.driver = driver;
        //В конструкторе класса, необходимо прописать метод PageFactory.initElements(driver, this),
        // который будет заниматься инициализацией полей класса.
    }

    //Находим вэб элементы
    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/div/input")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/form/div[2]/div/div/div/input")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/form/div[3]/button")
    private WebElement loginButton;


    /*методы для работы со элементами*/
    public void inputPhoneNumberField(String phone){ //метод, для ввода логина
        phoneNumberField.sendKeys(Keys.HOME, phone);
    }
    public void inputPasswordField(String password){ //метод для ввода пароль
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }

}
