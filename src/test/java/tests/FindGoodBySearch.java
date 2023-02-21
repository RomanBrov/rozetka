package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class FindGoodBySearch extends TestInit {

    @Test
    public void findGoodBySearch(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateToHomePage();
        homePage.searchField().sendKeys("iphone 10\n");

    }
}
