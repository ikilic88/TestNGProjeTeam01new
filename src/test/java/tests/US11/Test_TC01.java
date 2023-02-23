package tests.US11;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US11.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Test_TC01 {

    //Vendor olarak email ve şifre girilmeli ve sistemde My Accout görülmeli


    @Test
    public void testTC01() {

        PearlyMarketPage pearlyPage = new PearlyMarketPage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Vendor pearlymarket sayfa url`sine gider
        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));

        //Vendor sign in butonuna tiklar
        pearlyPage.singInButton.click();

        //Vendor gecerli mail adresi ve password girer
        pearlyPage.usernameEsra.click();
        pearlyPage.usernameEsra.sendKeys(ConfigReader.getProperty("usernameEsra"));
        pearlyPage.passwordEsra.click();
        pearlyPage.passwordEsra.sendKeys(ConfigReader.getProperty("passwordEsra"));

        //Vendor giris yapmak icin sign in butonuna tiklar
        pearlyPage.submitButton.click();

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        ReusableMethods.waitFor(2);
        pearlyPage.myAccount.click();
        ReusableMethods.waitFor(2);

        //Vendor sistemde my account goruldugunu dogrular
        Assert.assertTrue(pearlyPage.myAccountPage.isDisplayed());

        Driver.closeDriver();


    }
}
