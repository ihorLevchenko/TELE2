package kz.TELE2.pages;

import kz.TELE2.Base;
import org.junit.Assert;
import org.junit.Test;

public class RoamingPageTest extends Base {

    //проверка первого блока "безлимитный whatsApp за границей", на наличие стран - Азербайджан, Армения
    @Test
    public void checkForCorrectCountriesFirstBlock() {
        anyPage
                .clickPersonalAreaButton();
        loginPage
                .inputPhoneNumberField("7076421248")
                .inputPasswordField("1234")
                .clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber48();
        Assert.assertEquals("7076421248", phoneUser);//проверка на то, что номер юзера соответствует подлиности
        phoneBoxPage
                .clickProfileLink()
                .clickProfileTabLink("Роуминг");
        tabRoamingPage.clickBlockInternetPackagesAndServicesInRoaming("1");
        String alert = tabRoamingPage.getDrop_downListOfCountriesDostupRoaming(2);
        Assert.assertEquals("Азербайджан", alert);
        String alert1 = tabRoamingPage.getDrop_downListOfCountriesDostupRoaming(4);
        Assert.assertEquals("Армения", alert1);
        phoneBoxPage.userLogout();
        anyPage.clickLogoButton();
        System.out.println("TEST checkForCorrectCountries: Pass");
    }

    @Test
    public void checkForCorrectCountriesSecondBlock() {
        anyPage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421248")
                .inputPasswordField("1234")
                .clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber48();
        Assert.assertEquals("7076421248", phoneUser);//проверка на то, что номер юзера соответствует подлиности
        phoneBoxPage
                .clickProfileLink()
                .clickProfileTabLink("Роуминг");
        tabRoamingPage.clickBlockInternetPackagesAndServicesInRoaming("2");
        String alert = tabRoamingPage.getDrop_downListOfCountriesDostupRoaming(10);
        Assert.assertEquals("Бразилия", alert);
        String alert1 = tabRoamingPage.getDrop_downListOfCountriesDostupRoaming(12);
        Assert.assertEquals("Венгрия", alert1);
        phoneBoxPage.userLogout();
        anyPage.clickLogoButton();
        System.out.println("TEST checkForCorrectCountriesSecondBlock: Pass");
    }

    @Test
    public void checkForCorrectCountriesThirdBlock() {
        anyPage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421248")
                .inputPasswordField("1234")
                .clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber48();
        Assert.assertEquals("7076421248", phoneUser);//проверка на то, что номер юзера соответствует подлиности
        phoneBoxPage
                .clickProfileLink()
                .clickProfileTabLink("Роуминг");
        tabRoamingPage.clickBlockInternetPackagesAndServicesInRoaming("3");
        String alert = tabRoamingPage.getDrop_downListOfCountriesDostupRoaming(15);
        Assert.assertEquals("Германия", alert);
        String alert1 = tabRoamingPage.getDrop_downListOfCountriesDostupRoaming(16);
        Assert.assertEquals("Гонконг", alert1);
        phoneBoxPage.userLogout();
        anyPage.clickLogoButton();
        System.out.println("TEST checkForCorrectCountriesSecondBlock: Pass");
    }

    @Test
    public void checkForCorrectCountriesFourthBlock() {
        anyPage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421248")
                .inputPasswordField("1234")
                .clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber48();
        Assert.assertEquals("7076421248", phoneUser);//проверка на то, что номер юзера соответствует подлиности
        phoneBoxPage
                .clickProfileLink()
                .clickProfileTabLink("Роуминг");
        tabRoamingPage.clickBlockInternetPackagesAndServicesInRoaming("4");
        String alert = tabRoamingPage.getDrop_downListOfCountriesDostupRoaming(20);
        Assert.assertEquals("Египет", alert);
        String alert1 = tabRoamingPage.getDrop_downListOfCountriesDostupRoaming(25);
        Assert.assertEquals("Ирак", alert1);
        phoneBoxPage.userLogout();
        anyPage.clickLogoButton();
        System.out.println("TEST checkForCorrectCountriesSecondBlock: Pass");
    }

    @Test
    public void checkForCorrectCountriesFifthBlock() {
        anyPage.clickPersonalAreaButton();
        loginPage.inputPhoneNumberField("7076421248")
                .inputPasswordField("1234")
                .clickLoginButton();
        String phoneUser = phoneBoxPage.getUserPhoneNumber48();
        Assert.assertEquals("7076421248", phoneUser);//проверка на то, что номер юзера соответствует подлиности
        phoneBoxPage
                .clickProfileLink()
                .clickProfileTabLink("Роуминг");
        tabRoamingPage.clickBlockInternetPackagesAndServicesInRoaming("5");
        String alert = tabRoamingPage.getDrop_downListOfCountriesDostupRoaming(73);
        Assert.assertEquals("Украина", alert);
        String alert1 = tabRoamingPage.getDrop_downListOfCountriesDostupRoaming(80);
        Assert.assertEquals("Швейцария", alert1);
        phoneBoxPage.userLogout();
        anyPage.clickLogoButton();
        System.out.println("TEST checkForCorrectCountriesSecondBlock: Pass");
    }
}
