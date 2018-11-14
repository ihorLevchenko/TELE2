package kz.TELE2.pages;

import kz.TELE2.Base;
import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends Base {

    @Test
    public void validLicense() {
        String licenseTele2 = anyPage.getLicenseTELE2();
        Assert.assertEquals("2018 © Tele2 Лицензия АБА № 000950 выдана АИС РК", licenseTele2);
        System.out.println("TEST validLicense: Pass");
    }
}
