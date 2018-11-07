package kz.TELE2.pages;

import kz.TELE2.Base;
import org.junit.*;

public class LoginFunctionalTest extends Base {
    //Позитивные тесты
    @Test
    public void loginTestPositiveOk47() {
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421247");
        loginPage.inputPasswordField("1234");
        loginPage.clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber();
        Assert.assertEquals("7076421247", phoneUser);
        phoneBoxPage.userLogout();
        System.out.println("TEST loginTestPositive47: Pass");

    }

    @Test
    public void loginTestPositiveOk48() {
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421248");
        loginPage.inputPasswordField("1234");
        loginPage.clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber1();
        Assert.assertEquals("7076421248", phoneUser);
        phoneBoxPage.userLogout();
        System.out.println("TEST loginTestPositive48: Pass");
    }

    //Негативные тесты
    @Test
    public void wrongPhoneNumber() {
        //Невалидный номер телефона
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7776665544");//wrong phone number
        loginPage.inputPasswordField("1234");
        loginPage.clickLoginButton();
        try {
            if (loginPage.isAlertWrongNumberOrPassword())
                System.out.println("TEST wrongPhoneNumber: Pass");
            else {
                throw new Throwable();
            }
        } catch (Throwable error) {
            System.out.println("TEST wrongPhoneNumber: Failed");
        }
        homePage.clickLogoButton();
    }

    @Test
    //Невалидный пароль
    public void wrongPassword() {
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421243");
        loginPage.inputPasswordField("3333");//wrong pass
        loginPage.clickLoginButton();
        try {
            if (loginPage.isAlertWrongNumberOrPassword())
                System.out.println("TEST wrongPassword: Pass");
            else {
                throw new Throwable();
            }
        } catch (Throwable error) {
            System.out.println("TEST wrongPassword: Failed");
        }
        homePage.clickLogoButton();
    }

    @Test
    //Тест на активность кнопки "Войти", на экране входа в личный кабинет
    public void disableLoginButton() {
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421243");
        loginPage.inputPasswordField("");
        loginPage.isDisableButton();
        try {
            if (loginPage.isDisableButton())
                System.out.println("TEST disableLoginButton: Pass");
            else {
                throw new Throwable();
            }
        } catch (Throwable error) {
            System.out.println("TEST disableLoginButton: Failed");
        }
    }

    @Test
    //Проверка валидации номера + отображение алерта "Номер телефона введен не корректно"
    // . Ввести некорректный номер телефона 707642124
    public void invalidPhoneNumber() {
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421243");
        loginPage.clearOneNumber();
        loginPage.inputPasswordField("1234");
        String wrongNumberPhone = loginPage.wrongPhoneNumber();
        Assert.assertEquals("Номер телефона введен не корректно", wrongNumberPhone);
        homePage.clickLogoButton();
        System.out.println("TEST phoneNumberNotActive: Pass");
    }

    @Test
    //Проверка отображения алерта "Поле не должно быть пустым"
    public void theFieldMustNotBeEmpty() {
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421243");
        loginPage.clearAllPhoneNumberField();
        loginPage.inputPasswordField("123456");
        String emptyFieldPhoneNumber = loginPage.emptyPhoneNumberField();
        Assert.assertEquals("Поле не должно быть пустым", emptyFieldPhoneNumber);
        homePage.clickLogoButton();
        System.out.println("TEST theFieldMustNotBeEmpty: Pass");
    }
}
