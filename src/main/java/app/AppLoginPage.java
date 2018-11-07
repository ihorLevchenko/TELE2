package app;

public interface AppLoginPage {
    void inputPhoneNumberField(String phone);

    void inputPasswordField(String pass);

    void clickLoginButton();

    void clearOneNumber();

    void clearAllPhoneNumberField();

    String emptyPhoneNumberField();

    String wrongPhoneNumber();

    boolean isAlertWrongNumberOrPassword();

    boolean isDisableButton();
}
