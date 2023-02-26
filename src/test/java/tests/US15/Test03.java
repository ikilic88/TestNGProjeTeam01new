package tests.US15;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US15.ProductPage;
import utilities.Driver;

public class Test03 {
    static JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    ProductPage productPage;
        @Test
        public void test03() throws InterruptedException {
            Login login = new Login();
            login.login();
            productPage = new ProductPage();
            productPage.simpleProductList.click();
            Actions actions = new Actions(Driver.getDriver());
            actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
            actions.perform();
            jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);
            Assert.assertTrue(productPage.inventory.isDisplayed());
            Assert.assertTrue(productPage.shipping.isDisplayed());
            Assert.assertTrue(productPage.attributes.isDisplayed());
            Assert.assertTrue(productPage.linked.isDisplayed());
            Assert.assertTrue(productPage.seo.isDisplayed());
            Assert.assertTrue(productPage.toptanUrunButton.isDisplayed());
            Assert.assertTrue(productPage.advancedButton.isDisplayed());




        }



}
