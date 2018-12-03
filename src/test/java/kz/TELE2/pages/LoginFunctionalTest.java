package kz.TELE2.pages;

import kz.TELE2.Base;
import org.junit.*;

public class LoginFunctionalTest extends Base {
    //Позитивные тесты
    @Test
    public void loginTestPositiveOk47() throws InterruptedException {
        anyPage
                .clickPersonalAreaButton();
        loginPage
                .inputPhoneNumberField("7076421247")
                .inputPasswordField("1234")
                .clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber47();
        Assert.assertEquals("7076421247", phoneUser);
        phoneBoxPage.userLogout();
        anyPage.clickLogoButton();
        System.out.println("TEST loginTestPositive47: Pass");
    }

    @Test
    public void loginTestPositiveOk48() {
        anyPage
                .clickPersonalAreaButton();
        loginPage
                .inputPhoneNumberField("7076421248")
                .inputPasswordField("1234")
                .clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber48();
        Assert.assertEquals("7076421248", phoneUser);
        phoneBoxPage.userLogout();
        anyPage.clickLogoButton();
        System.out.println("TEST loginTestPositive48: Pass");
    }

    //Негативные тесты
    @Test
    public void wrongPhoneNumber() {
        //Невалидный номер телефона
        anyPage
                .clickPersonalAreaButton();
        loginPage
                .inputPhoneNumberField("7776665544")//wrong phone number
                .inputPasswordField("1234")
                .clickLoginButton();
        String alert = loginPage.wrongPhoneNumberOrPass();
        Assert.assertEquals("Неверный телефон или пароль", alert);
        anyPage.clickLogoButton();
    }

    @Test
    //Невалидный пароль
    public void wrongPassword() {
        anyPage
                .clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421243")
                .inputPasswordField("33333")//wrong pass
                .clickLoginButton();
        String alert = loginPage.wrongPhoneNumberOrPass();
        Assert.assertEquals("Неверный телефон или пароль", alert);
        anyPage.clickLogoButton();
    }

    @Test
    //Тест на активность кнопки "Войти", на экране входа в личный кабинет
    public void disableLoginButton() {
        anyPage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421243")
                .inputPasswordField("")
                .isDisableButton();
        try {
            if (loginPage.isDisableButton())
                System.out.println("TEST disableLoginButton: Pass");
            else {
                throw new Throwable();
            }
        } catch (Throwable error) {
            System.out.println("TEST disableLoginButton: Failed");
        }
        anyPage.clickLogoButton();
    }

    @Test
    //Проверка валидации номера + отображение алерта "Номер телефона введен не корректно"
    // . Ввести некорректный номер телефона 707642124
    public void invalidPhoneNumber() {
        anyPage
                .clickPersonalAreaButton();
        loginPage
                .inputPhoneNumberField("7076427777")
                .clearOneNumber()
                .inputPasswordField("1234");
        String wrongNumberPhone = loginPage.wrongPhoneNumberOrEmptyField();
        Assert.assertEquals("Номер телефона введен не корректно", wrongNumberPhone);
        anyPage.clickLogoButton();
        System.out.println("TEST phoneNumberNotActive: Pass");
    }

    @Test
    //Проверка отображения алерта "Поле не должно быть пустым"
    public void theFieldMustNotBeEmpty() {
        anyPage
                .clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421243")
                .clearAllPhoneNumberField()
                .inputPasswordField("123456");
        String emptyFieldPhoneNumber = loginPage.wrongPhoneNumberOrEmptyField();
        Assert.assertEquals("Поле не должно быть пустым", emptyFieldPhoneNumber);
        anyPage.clickLogoButton();
        System.out.println("TEST theFieldMustNotBeEmpty: Pass");
    }
}
