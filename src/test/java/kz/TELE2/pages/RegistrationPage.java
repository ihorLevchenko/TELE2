package kz.TELE2.pages;

public class RegistrationPage  {

/*
    @Test
    public void positiveTest() {
        System.out.println("1-------");
        //driver.manage().window().setPosition(new Point(55, 66)); //позиция окна
        //driver.manage().window().setSize(new Dimension(1100, 900)); //размер окна
        driver.get("https://tele2.kz/");

        WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[3]/div/nav/li[4]"));
        createAccountButton.click();

        WebElement fieldNumberAccount = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/div/input"));
        fieldNumberAccount.click();
        fieldNumberAccount.sendKeys("7076421247");

        WebElement fieldPassAccount = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/form/div[2]/div/div/div/input"));
        fieldPassAccount.click();
        fieldPassAccount.sendKeys("1234");

        WebElement buttonInput = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/form/div[3]/button"));
        buttonInput.sendKeys(Keys.ENTER);

        WebElement numProfile = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[3]/div/nav/div/span[2]"));
        String numUser = numProfile.getText();
        Assert.assertEquals("7076421247", numUser);

        WebElement out = driver.findElement(By.linkText("Выйти"));
        out.click();

        */
/*WebElement out = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[3]/div/nav/div/div"));
        if (out.isDisplayed()) {
            out.click();
        }
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[3]/div/a/div/img"));
        logo.click();*//*

        System.out.println("positiveTest check");
        System.out.println();
    }

*/
/*    @Test
    public void negativeTest() {
        System.out.println("2-------");
        driver.get("https://tele2.kz/");
        WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[3]/div/nav/li[4]"));
        createAccountButton.click();

        WebElement fieldNumberAccount = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/div/input"));
        fieldNumberAccount.click();
        fieldNumberAccount.sendKeys("7076421248");

        WebElement fieldPassAccount = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/form/div[2]/div/div/div/input"));
        fieldPassAccount.click();
        fieldPassAccount.sendKeys("1235");

        WebElement buttonInput = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/form/div[3]/button"));
        buttonInput.sendKeys(Keys.ENTER);

        //try {
        WebElement errorInput = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/form/div[4]"));
        if (errorInput.isDisplayed()) {  //проверка на правильный эррор
            System.out.println("Negative account test check");
        }
        //} catch (Throwable error) {
        // System.out.println("Throwable negativeTest: " + error.getClass());
        //return; //останавливаем тест и выдаем ошибку
        //}
    }*//*


    @Test
    public void getLogBrowser(){//получение логов браузера, драйвера или клиента
*/
/*        System.out.println(driver.manage().logs().getAvailableLogTypes());
        driver.manage().logs().get("browser").forEach(l ->System.out.println(l));*//*
 //логи браузера
    }
}


        */
/*JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");*//*
 //Scroll

*/
}

