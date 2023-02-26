package tests.US11;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US11.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Test_TC03 {
    //Dashboard altında ise; Store manager, orders, downloads,
    //addresses , account details, wishlist, Support tickets, followings ve log out olmali

    @Test
    public void testTC03() {
        PearlyMarketPage pearlyPage = new PearlyMarketPage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Vendor pearlymarket sayfa url`sine gider
        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));

        //Vendor sign in butonuna tiklar
        pearlyPage.singInButton.click();
        ReusableMethods.waitFor(2);

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

        //Vendor dashboard altinda store manager butonunun goruntulentigini dogrular
        Assert.assertTrue(pearlyPage.dashboardstoreManager.isDisplayed());

        //Vendor dashboard altinda orders butonunun goruntulentigini dogrular
        Assert.assertTrue(pearlyPage.dashboardOrders.isDisplayed());

        //Vendor dashboard altinda downloads butonunun goruntulentigini dogrular
        Assert.assertTrue(pearlyPage.dashboardDownloads.isDisplayed());

        //Vendor dashboard altinda addresses butonunun goruntulentigini dogrular
        Assert.assertTrue(pearlyPage.dashboardAddresses.isDisplayed());

        //Vendor dashboard altinda accaunt details butonunun goruntulentigini dogrular
        Assert.assertTrue(pearlyPage.dashboardAccountDetails.isDisplayed());

        //Vendor dashboard altinda wishlist butonunun goruntulentigini dogrular
        Assert.assertTrue(pearlyPage.dashboardWishlist.isDisplayed());

        //Vendor dashboard altinda support tickets butonunun goruntulentigini dogrular
        Assert.assertTrue(pearlyPage.dashboarSupportTickets.isDisplayed());

        //Vendor dashboard altinda followings butonunun goruntulentigini dogrular
        Assert.assertTrue(pearlyPage.dashboarFollowings.isDisplayed());

        //Vendor dashboard altinda log out butonunun goruntulentigini dogrular
        Assert.assertTrue(pearlyPage.dashboardLogOut.isDisplayed());

        Driver.closeDriver();


    }
}
