package kz.TELE2.pages;

import kz.TELE2.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class NumberPortingPageTest extends Base {

    @Test
    public void test() {
        anyPage.clickNumberPortingPage();
        String textPage = numberPortingPage.textNumberPorting();
        Assert.assertEquals("Перенос номера", textPage);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,950)", "");
        numberPortingPage
                .inputPhoneNumber("7778899")
                .clickBlockPhoneCodeNumber()
                .choiceBlockOperatorCodePhoneNumber("5");
        numberPortingPage
                .clickBlockButtonCityKaz()
                .choiseBlockCityKaz("3");
        numberPortingPage
                .inputFirstName("Ihor")
                .inputLastname("Levchenko")
                .inputMiddleName("Vasilievich")
                .inputContactPhone("0634447777")
                .inputemail("ii@ll.com")
                .clickCheckBox()
                .selectCheckBox();
    }
}
