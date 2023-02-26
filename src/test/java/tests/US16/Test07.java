package tests.US16;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US16.JustOnePage;
import utilities.Driver;

public class Test07 {

    static JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void test07() throws InterruptedException {
        Login01 login01 = new Login01();
        login01.login01();

        JustOnePage justOnePage = new JustOnePage();


        jse.executeScript("arguments[0].scrollIntoView(true);",justOnePage.until);

        Thread.sleep(1500);

        justOnePage.attributes.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.SPACE,Keys.TAB,"100").perform();




    }
}
