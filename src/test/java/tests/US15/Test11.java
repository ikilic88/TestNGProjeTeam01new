package tests.US15;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US15.ProductPage;
import utilities.Driver;


public class Test11 {

    ProductPage productPage;
    static JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    @Test
    public void test11() throws InterruptedException {
        Login login = new Login();
        login.login();
        Thread.sleep(3000);

        productPage = new ProductPage();


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMen├╝.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);

        Thread.sleep(1500);

        productPage.shipping.click();
        Thread.sleep(1500);
        actions.sendKeys(Keys.TAB,"12500").perform();

    }

}
