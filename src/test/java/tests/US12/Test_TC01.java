package tests.US12;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US11.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Test_TC01 {
    //"First name, Last name, Country/Region, Street address,
//Town / City, State, ZIP Code ve Phone girilmeli



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

        //Vendor sistemde my account sayfasinigoruntuler
        Assert.assertTrue(pearlyPage.myAccountPage.isDisplayed());

        //Vendor dashboard altinda adresses butonuna tiklar
        pearlyPage.dashboardAddresses.click();
        ReusableMethods.waitFor(2);

        //Vendor ADD yazisini tiklar





        //Vendor First Name girebilir
        //Vendor Last Name girebilir
        //Vendor Country/Region girebilir
        //Vendor Street address girebilir
        //Vendor Town / City girebilir
        //Vendor State girebilir
        //Vendor Postcode girebilir
        //Vendor Phone girebilir



    }





}


