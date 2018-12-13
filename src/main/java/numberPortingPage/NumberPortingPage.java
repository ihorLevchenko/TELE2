package numberPortingPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NumberPortingPage {
    private WebDriver driver;

    public NumberPortingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //форма "Заявка на перенос номера"
    @FindBy(xpath = "//h2[text()='Перенос номера']")
    private WebElement textNumberPorting;
    @FindBy(xpath = "//div[@class='_2iinAU']//*[@class='_2Hhuqe']")
    private WebElement codeNumberPhone;
    @FindBy(xpath = "//div[@class='_3wxcTl']//*[@class='_2Hhuqe']")
    private WebElement kazCity;
    @FindBy(xpath = "//input[@name='phoneToBeChanged']")
    private WebElement phoneNumber;
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastname;
    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement middleName;
    @FindBy(xpath = "//input[@name='contactPhone']")
    private WebElement contactPhone;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@value='rulesAgreement']")
    private WebElement checkbox;
    @FindBy(xpath = "//button[contains(text(),'Отправить заявку')]")
    private WebElement saidButton;
    @FindBy(xpath = "//div[@class='_1rXTfI PrqN70']")
    private WebElement closeAlert;

    //
    @FindBy(xpath = "//div[@class='_2JSVnc']")
    private WebElement forma;

    //ошибки формы "переноса номера"
    @FindBy(xpath = "//p[@class='PynFgb' and text()='Поле не должно быть пустым']")
    private WebElement the_field_must_not_be_empty;
    @FindBy(xpath = "//p[@class='PynFgb' and text()='Номер телефона введен не корректно']")
    private WebElement the_phone_number_entered_is_not_correct;
    @FindBy(xpath = "//p[@class='PynFgb' and text()='Введите корректный email']")
    private WebElement enter_a_valid_email_address;

    //методы для ошибок
    public String errorFieldMustNotBeEmpty() {
        String alert = the_field_must_not_be_empty.getText();
        return alert;
    }

    public String errorPhoneNumberEnteredIsNotCorrect() {
        String alert = the_phone_number_entered_is_not_correct.getText();
        return alert;
    }

    public String errorEnterValidEmailAdress() {
        String alert = enter_a_valid_email_address.getText();
        return alert;
    }


    //методы для очистки полей
    public NumberPortingPage clearallPhoneNumberField() {
        phoneNumber.sendKeys(Keys.BACK_SPACE);
        phoneNumber.sendKeys(Keys.BACK_SPACE);
        phoneNumber.sendKeys(Keys.BACK_SPACE);
        phoneNumber.sendKeys(Keys.BACK_SPACE);
        phoneNumber.sendKeys(Keys.BACK_SPACE);
        phoneNumber.sendKeys(Keys.BACK_SPACE);
        phoneNumber.sendKeys(Keys.BACK_SPACE);
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage clearOnePhoneNumberField() {
        phoneNumber.sendKeys(Keys.BACK_SPACE);
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage clearAllFirstNameField() {
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        firstName.sendKeys(Keys.BACK_SPACE);
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage clearAllLastNameField() {
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        lastname.sendKeys(Keys.BACK_SPACE);
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage clearAllEmailField() {
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        email.sendKeys(Keys.BACK_SPACE);
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage clearOneEmailField() {
        email.sendKeys(Keys.BACK_SPACE);
        return new NumberPortingPage(driver);
    }

    //метод для скрола страницы к заполнению формы переноса формы
    public NumberPortingPage scrollOnFormNumberPorting() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,950)", "");
        return new NumberPortingPage(driver);
    }

    // методы для логики
    public void choiceBlockOperatorCodePhoneNumber(String numberOperatorCode) {
        String listXpath = String.format("//div[@class='_1jFVk4 _1_JAuT OP0RzE _2IqpR7']//div[@class='_1jLcgi']//span[%s]", numberOperatorCode);
        driver.findElement(By.xpath(listXpath)).click();
    }

    public void choiseBlockCityKaz(String citiKaz) {
        String listXpath = String.format("//div[@class='_1jFVk4 _1_JAuT OP0RzE _2IqpR7']//div[@class='_1jLcgi']//span[%s]", citiKaz);
        driver.findElement(By.xpath(listXpath)).click();
    }

    public String textNumberPorting() {
        String text = textNumberPorting.getText();
        return text;
    }

    public NumberPortingPage clickBlockButtonCityKaz() {
        kazCity.click();
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage clickBlockPhoneCodeNumber() {
        codeNumberPhone.click();
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage inputPhoneNumber(String phone) {
        phoneNumber.sendKeys(phone);
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage inputFirstName(String firstNameIn) {
        firstName.sendKeys(firstNameIn);
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage inputLastname(String lastnameIn) {
        lastname.sendKeys(lastnameIn);
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage inputMiddleName(String middleNameIn) {
        middleName.sendKeys(middleNameIn);
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage inputContactPhone(String contactPhoneIn) {
        contactPhone.sendKeys(Keys.HOME + contactPhoneIn);
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage inputEmail(String emailIn) {
        email.sendKeys(emailIn);
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage clickCheckBox() {
        checkbox.click();
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage clickSaidButton() {
        saidButton.click();
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage clickCloseAlert() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        closeAlert.click();
        return new NumberPortingPage(driver);
    }

    public String formOnPortingPage() {
        String alert = forma.getText();
        return alert;
    }

    public boolean selectCheckBox() {
        if (!checkbox.isSelected()) {
            checkbox.click();
            return true;
        } else
            System.out.println("Check already check");
        return false;
    }
}
