package tests.US16;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US16.JustOnePage;
import utilities.Driver;

public class Test05 {

    @Test
    public void test05() throws InterruptedException {
        Login01 login01 = new Login01();
        login01.login01();

        JustOnePage justOnePage = new JustOnePage();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();

        justOnePage.productTitle.click();
        actions.sendKeys(Keys.TAB,"-14",Keys.TAB,"-14").perform();
    }
}
