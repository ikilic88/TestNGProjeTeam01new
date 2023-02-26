package tests.US15;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US15.ProductPage;
import utilities.Driver;


public class Test10 {

    ProductPage productPage;

    @Test
    public void test10() throws InterruptedException {
        Login login = new Login();
        login.login();
        Thread.sleep(2000);

        productPage = new ProductPage();
        productPage.inventory.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.SPACE).perform();

    }

}
