package kz.TELE2.pages;

import kz.TELE2.Base;
import org.junit.Assert;
import org.junit.Test;

public class NavigationButtonsFunctionalTest extends Base {

    //переход с верхних кнопок
    @Test
    public void validLicenseOnHomePage() {
        //Проверка текстовки лицензии на главной странце странице (футер)
        String licenseTele2 = anyPage.getLicenseTELE2();
        Assert.assertEquals("2018 © Tele2 Лицензия АБА № 000950 выдана АИС РК", licenseTele2);
        anyPage.clickLogoButton();
        System.out.println("TEST validLicense: Pass");
    }

    @Test
    //переход на страницу тарифов + проверка главной текстовки + проверка лицензии
    public void сorrectGoToTheLinkTariff() {
        anyPage.clickTariffs();
        String text = tariffsPage.textChangeEverything();
        Assert.assertEquals("Меняй все", text);
        String licenseTele2 = anyPage.getLicenseTELE2();
        Assert.assertEquals("2018 © Tele2 Лицензия АБА № 000950 выдана АИС РК", licenseTele2);
        anyPage.clickLogoButton();
        System.out.println("TEST сorrectGoToTheLinkTariff: Pass");
    }

    @Test
    //переход на страницу Услуги + проверка главной текстовки
    public void correctGotoTheLinkServices() {
        anyPage.clickServices();
        String text = servicesPage.textServicesTELE2();
        Assert.assertEquals("Услуги Tele2", text);
        String licenseTele2 = anyPage.getLicenseTELE2();
        Assert.assertEquals("2018 © Tele2 Лицензия АБА № 000950 выдана АИС РК", licenseTele2);
        anyPage.clickLogoButton();
        System.out.println("TEST correctGotoTheLinkServices: Pass");
    }

    @Test
    public void correctGotoTheLinkRoaming() {
        //переход на страницу роуминга + проверка главной текстовки
        anyPage.clickRoaming();
        String text = roamingPage.textRoaming();
        Assert.assertEquals("Роуминг", text);
        String licenseTele2 = anyPage.getLicenseTELE2();
        Assert.assertEquals("2018 © Tele2 Лицензия АБА № 000950 выдана АИС РК", licenseTele2);
        anyPage.clickLogoButton();
        System.out.println("TEST correctGotoTheLinkRoaming: Pass");
    }

    //переход с нижних кнопок
    @Test
    //переход на страницу тарифов с нижних кнопок + проверка главной текстовки
    public void сorrectGoToTheLinkTariffDown() {
        anyPage.clickTariffPlansDown();
        String text = tariffsPage.textChangeEverything();
        Assert.assertEquals("Меняй все", text);
        String licenseTele2 = anyPage.getLicenseTELE2();
        Assert.assertEquals("2018 © Tele2 Лицензия АБА № 000950 выдана АИС РК", licenseTele2);
        anyPage.clickLogoButton();
        System.out.println("TEST сorrectGoToTheLinkTariff: Pass");
    }

    @Test
    //переход на страницу Услуги с нижних кнопок + проверка главной текстовки
    public void correctGotoTheLinkServicesDown() {
        anyPage.clickServicesDown();
        String text = servicesPage.textServicesTELE2();
        Assert.assertEquals("Услуги Tele2", text);
        String licenseTele2 = anyPage.getLicenseTELE2();
        Assert.assertEquals("2018 © Tele2 Лицензия АБА № 000950 выдана АИС РК", licenseTele2);
        anyPage.clickLogoButton();
        System.out.println("TEST correctGotoTheLinkServices: Pass");
    }

    @Test
    public void correctGotoTheLinkRoamingDown() {
        //переход на страницу роуминга + проверка главной текстовки
        anyPage.clickRoamingDown();
        String text = roamingPage.textRoaming();
        Assert.assertEquals("Роуминг", text);
        String licenseTele2 = anyPage.getLicenseTELE2();
        Assert.assertEquals("2018 © Tele2 Лицензия АБА № 000950 выдана АИС РК", licenseTele2);
        anyPage.clickLogoButton();
        System.out.println("TEST correctGotoTheLinkRoaming: Pass");
    }
}
