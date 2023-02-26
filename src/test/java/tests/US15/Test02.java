package tests.US15;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US15.ProductPage;
import utilities.Driver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.time.Duration;
public class Test02 {
    static JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    ProductPage productPage;
    @Test
    public void test02() throws InterruptedException, FileNotFoundException {
        Login login = new Login();
        login.login();

        productPage = new ProductPage();

        Driver.getDriver().navigate().refresh();
        Assert.assertTrue(productPage.inventory.isDisplayed()); // inventory gorunur mu?
       // Add add = new Add();
        //add.addProduct();

       // Driver.closeDriver();

    }
}