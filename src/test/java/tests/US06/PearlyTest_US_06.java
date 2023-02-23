package tests.US06;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US06.PearlyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PearlyTest_US_06 {

    @Test
    public void US_06_TC_01() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici Search butonuna tiklar
        ReusableMethods.waitFor(2);
        pearlyPage.search.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("Apple", Keys.ENTER);

        //Kullanıcı aramak istediği ürünlerin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        Driver.closeDriver();
    }

    @Test
    public void US_06_TC_02() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici Search butonuna tiklar
        pearlyPage.search.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("Apple", Keys.ENTER);

        //Kullanıcı aramak istediği ürünlerin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Apple Iphone 14 ürününe clic yapar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(pearlyPage.appleIphone14).click().perform();

        //Kullanıcı urun sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        // Sayfayı kapatalım
        Driver.closeDriver();

    }

    @Test
    public void US_06_TC_03() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici Search butonuna tiklar
        pearlyPage.search.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("Apple", Keys.ENTER);

        //Kullanıcı aramak istediği ürünlerin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Apple Iphone 14 ürününe clic yapar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(pearlyPage.appleIphone14).click().perform();

        //Kullanıcı urun sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        // Kullanıcı sayfanın sağ ust kısmındakı Cart butonuna tıklar
        pearlyPage.card.click();

        //"Kullanıcı Apple Iphone 14 urununun Shoppıng Cart bolumde eklendiğini görür"
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        Driver.closeDriver();
    }

    @Test
    public void US_06_TC_04() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici Search butonuna tiklar
        pearlyPage.search.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("Apple", Keys.ENTER);

        //Kullanıcı aramak istediği ürünlerin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Apple Iphone 14 ürününe clic yapar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(pearlyPage.appleIphone14).click().perform();

        //Kullanıcı urun sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        // "Kullanıcı urunler sayfasına  “Apple iPhone 14 has been added to your cart mesajını gorur."
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("kitchen", Keys.ENTER);

        //Kullanıcı kitchen ürünlerinin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Kıtchen cooker  ürünune clic yapar
        pearlyPage.kitchen.click();

        //Kullanıcı Kıtchen cooker sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        //kullanıcı urunler sayfasında  “Kitchen Cooker” has been added to your cart mesajını gorur
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        Driver.closeDriver();
    }

    @Test
    public void US_06_TC_05() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici Search butonuna tiklar
        pearlyPage.search.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("Apple", Keys.ENTER);

        //Kullanıcı aramak istediği ürünlerin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Apple Iphone 14 ürününe clic yapar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(pearlyPage.appleIphone14).click().perform();

        //Kullanıcı urun sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("kitchen", Keys.ENTER);

        //Kullanıcı kitchen ürünlerinin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Kıtchen cooker  ürünune clic yapar
        pearlyPage.kitchen.click();

        //Kullanıcı Kıtchen cooker sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        // kullanici sayfanin sag  ust kosesindeki  cart butonuna tiklar
        pearlyPage.card.click();

        //Kullanici shopping cart menusundeki urunleri gorur
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanici shopping cart menusundeki sepetten cikrmak istedigi urunun sag ust kosesindeki “x” isaretine tiklar
        pearlyPage.urunCikartma1.click();
        ReusableMethods.waitFor(1);
        pearlyPage.urunCikartma2.click();
        ReusableMethods.waitFor(2);

        //Kullanıcı Shopping Cart menusunde eklediği urunleri cıkarttıgı zaman No Products In The Cart meajını gorur
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        Driver.closeDriver();
    }

    @Test
    public void US_06_TC_06() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici Search butonuna tiklar
        pearlyPage.search.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("Apple", Keys.ENTER);

        //Kullanıcı aramak istediği ürünlerin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Apple Iphone 14 ürününe clic yapar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(pearlyPage.appleIphone14).click().perform();

        //Kullanıcı urun sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("kitchen", Keys.ENTER);

        //Kullanıcı kitchen ürünlerinin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Kıtchen cooker  ürünune clic yapar
        pearlyPage.kitchen.click();

        //Kullanıcı Kıtchen cooker sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        // kullanici sayfanin sag  ust kosesindeki  cart butonuna tiklar
        pearlyPage.card.click();

        // Kullanici shopping cart menusundeki VIEW CART butonuna tiklar
        pearlyPage.viewCart.click();

        //Kullanıcı cart sayfasında Proceed To Checkout butonuna tıklar
        ReusableMethods.scrollIntoViewJS(pearlyPage.proceedToCheckout);
        ReusableMethods.clickByJS(pearlyPage.proceedToCheckout);

        //Kullanıc ıCheckout sayfasında BILLING DETAILS menusunu gorur
        Assert.assertTrue(pearlyPage.billingDetails.isDisplayed());
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        Driver.closeDriver();
    }

    @Test
    public void US_06_TC_07() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici Search butonuna tiklar
        pearlyPage.search.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("Apple", Keys.ENTER);

        //Kullanıcı aramak istediği ürünlerin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Apple Iphone 14 ürününe clic yapar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(pearlyPage.appleIphone14).click().perform();

        //Kullanıcı urun sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("kitchen", Keys.ENTER);

        //Kullanıcı kitchen ürünlerinin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Kıtchen cooker  ürünune clic yapar
        pearlyPage.kitchen.click();

        //Kullanıcı Kıtchen cooker sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        // kullanici sayfanin sag  ust kosesindeki  cart butonuna tiklar
        pearlyPage.card.click();

        // Kullanici shopping cart menusundeki CHECKOUT butonuna tiklar
        pearlyPage.checkout.click();

        //"Kullanıcı acılan Checkout sayfasında BILLING DETAILS menüsünü görür"
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
        Driver.closeDriver();

    }

    @Test
    public void US_06_TC_08() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici Search butonuna tiklar
        pearlyPage.search.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("Apple", Keys.ENTER);

        //Kullanıcı aramak istediği ürünlerin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Apple Iphone 14 ürününe clic yapar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(pearlyPage.appleIphone14).click().perform();

        //Kullanıcı urun sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("kitchen", Keys.ENTER);

        //Kullanıcı kitchen ürünlerinin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Kıtchen cooker  ürünune clic yapar
        pearlyPage.kitchen.click();

        //Kullanıcı Kıtchen cooker sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        // kullanici sayfanin sag  ust kosesindeki  cart butonuna tiklar
        pearlyPage.card.click();

        // Kullanici shopping cart menusundeki CHECKOUT butonuna tiklar
        pearlyPage.checkout.click();

        //"Kullanıcı acılan Checkout sayfasında BILLING DETAILS menüsünü görür"
        Assert.assertTrue(pearlyPage.billingDetails.isDisplayed());

        //Kullanıcı First name butonunu bos bırakır
        //Kullanıcı Last name butonuna bir veri girer
        pearlyPage.billingFirstName.sendKeys(Keys.TAB, ConfigReader.getProperty("billing_LastName"),
                Keys.TAB, "Serhat");

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

        // Kullanıcı acılan Checkout sayfasında BILLING FIRST NAME is a required field     mesajını gorur
        ReusableMethods.waitFor(3);
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        Driver.closeDriver();

    }

    @Test
    public void US_06_TC_09() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici Search butonuna tiklar
        pearlyPage.search.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("Apple", Keys.ENTER);

        //Kullanıcı aramak istediği ürünlerin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Apple Iphone 14 ürününe clic yapar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(pearlyPage.appleIphone14).click().perform();

        //Kullanıcı urun sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        //Kullanıcı Aramak istediği ürünün ismini Search Butonuna girer
        //Kullanıcı Enter tusuna basar
        pearlyPage.search.sendKeys("kitchen", Keys.ENTER);

        //Kullanıcı kitchen ürünlerinin listesini görür
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        //Kullanıcı Kıtchen cooker  ürünune clic yapar
        pearlyPage.kitchen.click();

        //Kullanıcı Kıtchen cooker sayfasında Add to Card butonuna tıklar
        pearlyPage.addToCart.click();

        // kullanici sayfanin sag  ust kosesindeki  cart butonuna tiklar
        pearlyPage.card.click();

        // Kullanici shopping cart menusundeki CHECKOUT butonuna tiklar
        pearlyPage.checkout.click();

        //"Kullanıcı acılan Checkout sayfasında BILLING DETAILS menüsünü görür"
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

        // Kullanıcı Cart butonuna tıklar
        pearlyPage.card.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        Driver.closeDriver();
    }
}