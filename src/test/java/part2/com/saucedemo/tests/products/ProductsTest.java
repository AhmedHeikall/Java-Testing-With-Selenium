package part2.com.saucedemo.tests.products;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed(){
        loginPage.lgIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductHeaderDisplayed(), "Header is not displayed");
    }

}
