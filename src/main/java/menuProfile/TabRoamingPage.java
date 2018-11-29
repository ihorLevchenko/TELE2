package menuProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TabRoamingPage {
    private WebDriver driver;

    public TabRoamingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='_3M9Dbo iTBOpW']//div[@class='_3lHw0U']")
    private List<WebElement> listAvailableCountries;


    public String getDrop_downListOfCountriesDostupRoaming(int countrieNumber) {
        String text = listAvailableCountries.get(countrieNumber).getText();
        return text;
    }


    public void clickBlockInternetPackagesAndServicesInRoaming(String numberPackagesService) {
        String listXpath = String.format("//div[@class='_1yvoUF']/div[%s]/div[2]/div[3]/div[1]/div[1]/div[1]/*[1]", numberPackagesService);
        driver.findElement(By.xpath(listXpath)).click();
    }

}
