package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToHomePage(){
        driver.get("https://rozetka.com.ua/");
    }

    public WebElement searchField(){
        return findElementByXpath("//input[contains(@class, 'search-form__input')]");
    }

    public WebElement submitBtnBySearchField(){
        return findElementByXpath("//button[contains(@class, 'search-form__submit')]");
    }
}
