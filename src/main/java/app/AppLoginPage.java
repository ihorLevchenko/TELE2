package app;

import kz.TELE2.pages.LoginPage;

public interface AppLoginPage {
    LoginPage inputPhoneNumberField(String phone);

    LoginPage inputPasswordField(String pass);

    LoginPage clickLoginButton();

    LoginPage clearOneNumber();

    LoginPage clearAllPhoneNumberField();

    String wrongPhoneNumberOrEmptyField();

    boolean isDisableButton();
}
