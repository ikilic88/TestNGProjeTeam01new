package tests.US12;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.US12.PearlyMarketPage12;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Test_TC01 {
    //"First name, Last name, Country/Region, Street address,
//Town / City, State, ZIP Code ve Phone girilmeli



    @Test
    public void testTC01() {

        PearlyMarketPage12 pearly12 = new PearlyMarketPage12();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Vendor pearlymarket sayfa url`sine gider
        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));

        //Vendor sign in butonuna tiklar
        pearly12.singInButton.click();

        //Vendor gecerli mail adresi ve password girer
        pearly12.usernameEsra.click();
        pearly12.usernameEsra.sendKeys(ConfigReader.getProperty("usernameEsra"));
        pearly12.passwordEsra.click();
        pearly12.passwordEsra.sendKeys(ConfigReader.getProperty("passwordEsra"));

        //Vendor giris yapmak icin sign in butonuna tiklar
        pearly12.submitButton.click();

        //Vendor sistemde my account sayfasinigoruntuler//sayfayi asagi alir
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//sayfayi
        ReusableMethods.waitFor(2);
        pearly12.myAccount.click();
        ReusableMethods.waitFor(2);

        //Vendor sistemde my account sayfasinigoruntuler
        Assert.assertTrue(pearly12.myAccountPage.isDisplayed());

        //Vendor dashboard altinda adresses butonuna tiklar
        pearly12.dashboardAddresses.click();
        ReusableMethods.waitFor(2);

        //Vendor ADD yazisini tiklar
        pearly12.AddButton.click();

        //Vendor First Name girebilir
        pearly12.FirstName.sendKeys(ConfigReader.getProperty("firstname_ash"));
        ReusableMethods.waitFor(2);

        //Vendor Last Name girebilir
        pearly12.LastName.sendKeys(ConfigReader.getProperty("lastname_ash"));
        ReusableMethods.waitFor(2);

        //Vendor Country/Region girebilir
        Select selectcountry = new Select(pearly12.selectCauntry);
        selectcountry.selectByVisibleText("United State (US)");
        ReusableMethods.waitFor(2);

        //Vendor Street address girebilir
        pearly12.streetAddress1.sendKeys(ConfigReader.getProperty("street_ash"));

        //Vendor Town / City girebilir
        pearly12.city.sendKeys(ConfigReader.getProperty("city_ash"));

        //Vendor State girebilir
        Select selectstate = new Select(pearly12.selectState);
        selectstate.selectByVisibleText("New York");

        //Vendor Postcode girebilir
        pearly12.postCode.sendKeys(ConfigReader.getProperty("postcode_ash"));


        //Vendor Phone girebilir
        pearly12.PhoneNumber.sendKeys(ConfigReader.getProperty("phone_ash"));



    }





}


