package tests.US11;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US11.PearlyMarketPage11;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Test_TC02 {

    //Orders, Downloads, addresses, account details,whislist ve Logout gorulmeli

    @Test
    public void testTC02() {

        PearlyMarketPage11 pearlyPage = new PearlyMarketPage11();
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

        //Vendor My Accaunt sayfasinin goruntulendigini dogrular
        Assert.assertTrue(pearlyPage.myAccountPage.isDisplayed());

        //Vendor orders butonunu goruntuler
        Assert.assertTrue(pearlyPage.Orders.isDisplayed());

        //Vendor downloads butonunu goruntuler
        Assert.assertTrue(pearlyPage.Downloads.isDisplayed());

        //Vendor addresses butonunu goruntuler
        Assert.assertTrue(pearlyPage.Addresses.isDisplayed());

        //Vendor account butonunu goruntuler
        Assert.assertTrue(pearlyPage.AccauntsDetails.isDisplayed());

        //Vendor whislist butonunu goruntuler
        Assert.assertTrue(pearlyPage.Wishlist.isDisplayed());

        //Vendor logout butonunu goruntuler
        Assert.assertTrue(pearlyPage.Logout.isDisplayed());

        Driver.closeDriver();

    }
}
