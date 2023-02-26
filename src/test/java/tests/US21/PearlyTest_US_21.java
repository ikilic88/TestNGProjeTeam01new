package tests.US21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US21.PearlyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PearlyTest_US_21 {



    @Test
    public void US_21_TC_01() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici Search butonuna tiklar
        pearlyPage.search.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("Toka", Keys.ENTER);

        //Kullanıcı aramak istediği ürünlerin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //"Kullanıcı secmek istediği Monalisa 4’lü Siyah Mat Mandal Toka Seti ürününe clic yapar"
        pearlyPage.tokaSeti.click();

        //Kullanıcı acılan urunler sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        //kullanici sayfanin sag  ust kosesindeki  cart butonuna tiklar
        pearlyPage.card.click();

        //Kullanici shopping cart menusundeki VIEW CART butonuna tiklar
        pearlyPage.viewCart.click();

        //Kullanıcı Enter Coupon code here butonuna Kupon codunu girer
        pearlyPage.couponCode.sendKeys(ConfigReader.getProperty("coupon_code"));

        //Kullanıcı APPLY COUPON butonuna click yapar
        ReusableMethods.clickByJS(pearlyPage.applyCoupon);

        //"Kullanıcı cart sayfasında Coupon code applied successfully mesajını gorur"
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı cart sayfasında Proceed To Checkout butonuna tıklar
        ReusableMethods.clickByJS(pearlyPage.proceedToCheckoutCoupon);

        //"Kullanıcı acılan Checkout sayfasında BILLING DETAILS menüsünü görür"
        ReusableMethods.waitFor(2);
        Assert.assertTrue(pearlyPage.billingDetails.isDisplayed());

        //Kullanıcı First name butonuna bir veri girer
        //Kullanıcı Last name butonuna bir veri girer
        pearlyPage.billingFirstName.sendKeys(ConfigReader.getProperty("billing_FirstName"),
                Keys.TAB, ConfigReader.getProperty("billing_LastName"), Keys.TAB, "Serhat");

        //Kullanıcı Country / Region butonuna bir veri girer
        Select select = new Select(pearlyPage.country);
        select.selectByVisibleText("Turkey");

        //Kullanıcı Street address butonuna bir veri girer
        pearlyPage.billingStreetAdress1.sendKeys(ConfigReader.getProperty("billing_Street_Address1"));

        //Kullanıcı Street address butonuna bir veri girer
        pearlyPage.billingStreetAdress2.sendKeys(ConfigReader.getProperty("billing_Street_Address2"));

        //Kullanıcı ZIP Code butonuna bir veri girer
        pearlyPage.billingPostCode.sendKeys(ConfigReader.getProperty("billing_PostCode"));

        //Kullanıcı Town / City butonuna bir veri girer
        pearlyPage.billingCity.sendKeys(ConfigReader.getProperty("billing_Town_City"));

        //Kullanıcı Province  butonuna bir veri girer
        Select select1 = new Select(pearlyPage.billingProvince);
        select1.selectByValue("TR34");

        //Kullanıcı Phone butonuna bir veri girer
        pearlyPage.billingPhone.sendKeys(ConfigReader.getProperty("billing_Phone"));

        //Kullanıcı Email address butonuna bir veri girer
        pearlyPage.billingEmail.sendKeys(ConfigReader.getProperty("billing_Email_Address"));

        //Kullanıcı Payment Methods menusundeki Wire transfer/EFT  Checkbox veya Pay at the door Checkbox sını secer
        //Kullanıcı Pleace order butonuna tıklar
        Actions actions1 = new Actions(Driver.getDriver());
        actions1.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.clickByJS(pearlyPage.placeOrder);

        //"Kullanıcı acılan Order Complete sayfasında Thank you. Your order has been received. Mesajını gorur"
        ReusableMethods.waitFor(2);
        Assert.assertTrue(pearlyPage.thankyoumesaj.isDisplayed());
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }
}
