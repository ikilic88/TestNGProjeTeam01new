package tests.US15;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US15.ProductInventoryPage;
import pages.US15.ProductPage;
import utilities.Driver;

public class Test08 {

    ProductInventoryPage productInventoryPage;
    ProductPage productPage;

    @Test
    public void test07() throws InterruptedException {
        Login login = new Login();
        login.login();
        Thread.sleep(2000);

        productPage = new ProductPage();
        productInventoryPage = new ProductInventoryPage();

        productPage.inventory.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.SPACE,Keys.TAB,"-1100").perform();

    }

}
