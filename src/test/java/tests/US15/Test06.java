package tests.US15;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.US15.ProductInventoryPage;
import pages.US15.ProductPage;
import utilities.Driver;
import java.time.Duration;
public class Test06 {
    ProductInventoryPage productInventoryPage;
    static JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    ProductPage productPage;
    @Test
    public void test06() throws InterruptedException {
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        Login login = new Login();
        login.login();
        Thread.sleep(2000);

       // Add add = new Add();
       // add.addProduct();
        Thread.sleep(1500);

        productPage = new ProductPage();
        productInventoryPage = new ProductInventoryPage();

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);
        Thread.sleep(1500);

        productPage.inventory.click();
        Thread.sleep(1500);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.SPACE,Keys.TAB,"1200").perform();
        Thread.sleep(1500);
        //add.submitButton();
    }
}