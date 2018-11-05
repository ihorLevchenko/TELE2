package kz.TELE2;

import kz.TELE2.pages.Base;
import org.junit.*;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;
import static com.sun.tools.javac.util.Assert.error;

public class LoginTest extends Base {

    @Test
    public void loginTestPositive47(){
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421247");
        loginPage.inputPasswordField("1234");
        loginPage.clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber();
        Assert.assertEquals("7076421247", phoneUser);
        phoneBoxPage.userLogout();
    }

    @Test
    public void loginTestPositive48(){
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421248");
        loginPage.inputPasswordField("1234");
        loginPage.clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber1();
        Assert.assertEquals("7076421248", phoneUser);
        phoneBoxPage.userLogout();
    }

    @Test
    public void loginTestNegativeWrongPassword() {
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421243");
        loginPage.inputPasswordField("333");
        loginPage.clickLoginButton();
        try {
            if (loginPage.isAlertWrongNumberOrPassword())
                System.out.println("TEST - 3 пройден!!!");
        } catch (Throwable error) {
            System.out.println("TEST - 3 не пройден!!!" + error.getMessage());

        }
        homePage.clickLogoButton();
    }

    @Test
    public void loginTestNegativeEmptyPasswordField() {
        homePage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421243");
        loginPage.inputPasswordField("3333");
        try {
            if (loginPage.isDisableButton())
                System.out.println("TEST - 4 пройден!!!");
            else {
                throw new Throwable();
            }
        } catch (Throwable error) {
            System.out.println("TEST - 4 не пройден ");
        }
    }
}
