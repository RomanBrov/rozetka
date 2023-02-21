package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResutSearch_SamsungGalaxyS21 extends BasePage {
    public ResutSearch_SamsungGalaxyS21(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> samsungGoods(){
        return findElementsByXpath("//div[contains(@class, 'goods-tile ng-star-inserted')]");
    }

    public List<WebElement> descriptionSamsungGoods(){
        return findElementsByXpath("//span[contains(@class, 'goods-tile__title')]");
    }
}
