package tests.US15;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US15.ProductPage;
import utilities.Driver;


public class Test19 {

    ProductPage productPage;
    static JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    @Test
    public void test19() throws InterruptedException {
        Login login = new Login();
        login.login();
        Thread.sleep(3000);

        productPage = new ProductPage();


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMenü.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);

        Thread.sleep(1500);

        productPage.attributes.click();
        Thread.sleep(1500);

        actions.sendKeys(Keys.TAB,Keys.SPACE).perform();
        Thread.sleep(1500);

        productPage.searchAtributeBox.sendKeys("beyaz");
        actions.sendKeys(Keys.ENTER).perform();

        Thread.sleep(1500);
        productPage.selectAllButton.click();


    }

}
