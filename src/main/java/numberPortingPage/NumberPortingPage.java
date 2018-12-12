package numberPortingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NumberPortingPage {
    private WebDriver driver;

    public NumberPortingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

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
    @FindBy(xpath = "//button[@class='_1d2SRC _3GoWgo _1aMikQ' and text()='Отправить заявку']")
    private WebElement appButton;

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

    public NumberPortingPage inputemail(String emailIn) {
        email.sendKeys(emailIn);
        return new NumberPortingPage(driver);
    }

    public NumberPortingPage clickCheckBox() {
        checkbox.click();
        return new NumberPortingPage(driver);
    }

    public boolean selectCheckBox() {
        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("TEST TRUE");
            return true;
        } else {
            return false;
        }
    }
}
