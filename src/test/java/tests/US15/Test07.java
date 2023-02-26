package tests.US15;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.US15.ProductInventoryPage;
import pages.US15.ProductPage;
import utilities.Driver;
import java.time.Duration;
public class Test07 {
    ProductInventoryPage productInventoryPage;
    ProductPage productPage;
    static JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    @Test
    public void test07() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        Login login = new Login();
        login.login();
        Thread.sleep(2000);

        productPage = new ProductPage();
        productInventoryPage = new ProductInventoryPage();
        productPage.inventory.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.SPACE,Keys.TAB,"1100").perform();

    }
}