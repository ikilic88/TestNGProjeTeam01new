package tests.US15;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US15.ProductInventoryPage;
import pages.US15.ProductPage;
import utilities.Driver;

public class Test04 {

    ProductInventoryPage productInventoryPage;
    ProductPage productPage;
    @Test
    public void test04() throws InterruptedException {
        Login login = new Login();
        login.login();


        Thread.sleep(2000);
        productInventoryPage = new ProductInventoryPage();
        productPage = new ProductPage();
        productPage.inventory.click();
        Thread.sleep(1500);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB,"1200").perform();






    }




}
