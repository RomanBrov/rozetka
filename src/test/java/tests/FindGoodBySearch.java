package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResutSearch_SamsungGalaxyS21;

public class FindGoodBySearch extends TestInit {

    @Test
    public void findGoodBySearch(){
        HomePage homePage = new HomePage(driver);
        
        homePage.navigateToHomePage();
        homePage.searchField().sendKeys("Samsung Galaxy S21");
        homePage.submitBtnBySearchField().click();

        ResutSearch_SamsungGalaxyS21 resutSearch_SamsungGalaxyS21 = new ResutSearch_SamsungGalaxyS21(driver);

        for (WebElement product:  resutSearch_SamsungGalaxyS21.samsungGoods()) {
            Assert.assertTrue(product.isDisplayed());
            for (WebElement productDescription: resutSearch_SamsungGalaxyS21.descriptionSamsungGoods()) {
                Assert.assertTrue(productDescription.getText().contains("Samsung Galaxy S21"));
            }
        }

    }
}
