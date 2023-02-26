package tests.US16;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US16.JustOnePage;

public class Test03 {

    @Test
    public void test03() throws InterruptedException {
        Login01 login01 = new Login01();
        login01.login01();

        JustOnePage justOnePage = new JustOnePage();
        justOnePage.virtualBox.click();
        justOnePage.downBox.click();


    }
}
