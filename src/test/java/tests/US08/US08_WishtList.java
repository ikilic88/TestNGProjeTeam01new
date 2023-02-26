package tests.US08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US08.PearlyMarketPageUS_08;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US08_WishtList {





    @Test
    public void test01() throws InterruptedException, IOException {

        PearlyMarketPageUS_08 pearlyMarketPage = new PearlyMarketPageUS_08();

        //1. Kullanıcı URL' e gider
        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));

        //2. Kullanıcı Signin butonuna tıklar
        pearlyMarketPage.singInButonu.click();

        //3. Kullanıcı e-mail satırına veri girer
        pearlyMarketPage.emailKutusu.sendKeys(ConfigReader.getProperty("pearlyDogruMailTncr"));

        //4. Kullanıcı password satırına veri girer
        pearlyMarketPage.passwordKutusu.sendKeys(ConfigReader.getProperty("pearlyDogruSifreTncr"));

        //5. Kullanıcı Sıng In butonuna tıklar
        pearlyMarketPage.singInGirisTikla.click();
        ReusableMethods.waitFor(3);


        //6.Kullanıcı search box tan xiaomi phone aramasi yapar
        pearlyMarketPage.searcBoxButonu.sendKeys("xiaomi phone"+ Keys.ENTER);

        //7.Kullanıcı beğendiği ürünleri wishlist'e tıklayarak ekler
        Actions actions =new Actions(Driver.getDriver());
        actions.moveToElement(pearlyMarketPage.ilkUrun).perform();
        pearlyMarketPage.favoriEkleButonu1.click();
        ReusableMethods.waitFor(2);

        ReusableMethods.clickByJS(pearlyMarketPage.favoriEkleButonu2);
        ReusableMethods.waitFor(2);


        //8.Kullanıcı sağ üst kısımda bulunan wishlist butonuna tıklar
        ReusableMethods.clickByJS(pearlyMarketPage.wishlistGoruntuleButonu);

        //9.Wishlistteki ürünlerin özelliklerini görüntüleyebilmeli (QUICK VIEW) tıklar
        pearlyMarketPage.qucickWiew1.click();
        ReusableMethods.waitFor(3);
        pearlyMarketPage.escButonu.click();
        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS(pearlyMarketPage.qucickWiew2);
        ReusableMethods.waitFor(3);
        pearlyMarketPage.escButonu.click();

        //10.Whishlisteki X butonunu kullanarak tek ürün bırakır
        pearlyMarketPage.wishListtekUrunicinESCButonu.click();
        ReusableMethods.waitFor(3);


        //11.Whishlisteki tek üründe Add To Cart butonuna tıklar
        ReusableMethods.clickByJS(pearlyMarketPage.addToCartButonu);
        ReusableMethods.waitFor(3);

        //  Kullanıcı ekranda “Xiaomi Phone -4” has been added to your cart. yazısı çıktıgını gorur
        ReusableMethods.takeScreenShotOfPage();

        // Kullanıcı sayfayı kapatır
        Driver.closeDriver();

    }


    @Test
    public void test02() throws IOException {
        PearlyMarketPageUS_08 pearlyMarketPage = new PearlyMarketPageUS_08();

        //1. Kullanıcı URL' e gider
        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));

        //2. Kullanıcı Signin butonuna tıklar
        pearlyMarketPage.singInButonu.click();

        //3. Kullanıcı e-mail satırına veri girer
        pearlyMarketPage.emailKutusu.sendKeys(ConfigReader.getProperty("pearlyDogruMailTncr"));

        //4. Kullanıcı password satırına veri girer
        pearlyMarketPage.passwordKutusu.sendKeys(ConfigReader.getProperty("pearlyDogruSifreTncr"));

        //5. Kullanıcı Sıng In butonuna tıklar
        pearlyMarketPage.singInGirisTikla.click();
        ReusableMethods.waitFor(3);

        //6. Kullanıcı Cart butonuna tıklar
        pearlyMarketPage.cart.click();

        //7.Kullanıcı Vıew Cart butonuna tıklar
        pearlyMarketPage.vievCartButonu.click();
        ReusableMethods.waitFor(3);

        //8.Kullanıcı Proceed To Chckout butonuna tıklar
        ReusableMethods.clickByJS(pearlyMarketPage.proceedToCheckOutButonu);


        //9."Kullanıcı acılan Checkout sayfasında BILLING DETAILS menüsünü görür"
        Assert.assertTrue(pearlyMarketPage.billingDetails.isDisplayed());

        //10.Kullanıcı gerekli fatura bilgilerini girer
        //Kullanıcı First name butonuna bir veri girer
        //Kullanıcı Last name butonuna bir veri girer
        pearlyMarketPage.billingFirstName.clear();

        pearlyMarketPage.billingFirstName.sendKeys(ConfigReader.getProperty("billing_FirstNameTncr"),
                Keys.TAB, ConfigReader.getProperty("billing_LastNameTncr"), Keys.TAB, "Beytullah");

        //Kullanıcı Country / Region butonuna bir veri girer
        Select select = new Select(pearlyMarketPage.country);
        select.selectByVisibleText("Turkey");

        //Kullanıcı Street address butonuna bir veri girer
        pearlyMarketPage.billingStreetAdress1.sendKeys(ConfigReader.getProperty("billing_Street_Address1Tncr"));

        //Kullanıcı Street address butonuna bir veri girer
        pearlyMarketPage.billingStreetAdress2.sendKeys(ConfigReader.getProperty("billing_Street_Address2Tncr"));

        //Kullanıcı ZIP Code butonuna bir veri girer
        pearlyMarketPage.billingPostCode.sendKeys(ConfigReader.getProperty("billing_PostCodeTncr"));

        //Kullanıcı Town / City butonuna bir veri girer
        pearlyMarketPage.billingCity.sendKeys(ConfigReader.getProperty("billing_Town_CityTncr"));

        //Kullanıcı Province  butonuna bir veri girer
        Select select1 = new Select(pearlyMarketPage.billingProvince);
        select1.selectByValue("TR34");

        //Kullanıcı Phone butonuna bir veri girer
        pearlyMarketPage.billingPhone.clear();
        pearlyMarketPage.billingPhone.sendKeys(ConfigReader.getProperty("billing_PhoneTncr"));


        //11.Kullanıcı EFT ödeme seçenegini seçer Place Order butonuna tıklar
        Actions actions1 = new Actions(Driver.getDriver());
        actions1.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.clickByJS(pearlyMarketPage.placeOrder);

        //"Kullanıcı acılan Order Complete sayfasında Thank you. Your order has been received. Mesajını gorur"
        ReusableMethods.waitFor(2);
        Assert.assertTrue(pearlyMarketPage.thankyoumesaj.isDisplayed());
        ReusableMethods.takeScreenShotOfPage();

        // Kullanıcı sayfayı kapatır
           Driver.closeDriver();

    }


    @Test
    public void test03() throws InterruptedException, IOException {

        PearlyMarketPageUS_08 pearlyMarketPage = new PearlyMarketPageUS_08();

        //1. Kullanıcı URL' e gider
        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));

        //2. Kullanıcı Signin butonuna tıklar
        pearlyMarketPage.singInButonu.click();

        //3. Kullanıcı e-mail satırına veri girer
        pearlyMarketPage.emailKutusu.sendKeys(ConfigReader.getProperty("pearlyDogruMailTncr"));

        //4. Kullanıcı password satırına veri girer
        pearlyMarketPage.passwordKutusu.sendKeys(ConfigReader.getProperty("pearlyDogruSifreTncr"));

        //5. Kullanıcı Sıng In butonuna tıklar
        pearlyMarketPage.singInGirisTikla.click();
        ReusableMethods.waitFor(3);

        //6.Kullanıcı search box tan xiaomi phone aramasi yapar
        pearlyMarketPage.searcBoxButonu.sendKeys("xiaomi phone"+ Keys.ENTER);

        //7.Kullanıcı beğendiği ürünleri wishlist'e tıklayarak ekler
        Actions actions =new Actions(Driver.getDriver());
        actions.moveToElement(pearlyMarketPage.ilkUrun).perform();
        pearlyMarketPage.favoriEkleButonu1.click();
        ReusableMethods.waitFor(2);

        ReusableMethods.clickByJS(pearlyMarketPage.favoriEkleButonu2);
        ReusableMethods.waitFor(2);


        //8.Kullanıcı sağ üst kısımda bulunan wishlist butonuna tıklar
        ReusableMethods.clickByJS(pearlyMarketPage.wishlistGoruntuleButonu);

        //9.Wishlistteki ürünlerin özelliklerini görüntüleyebilmeli (QUICK VIEW) tıklar
        pearlyMarketPage.qucickWiew1.click();
        ReusableMethods.waitFor(3);
        pearlyMarketPage.escButonu.click();
        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS(pearlyMarketPage.qucickWiew2);
        ReusableMethods.waitFor(3);
        pearlyMarketPage.escButonu.click();

        //10.Whishlisteki X butonunu kullanarak tek ürün bırakır
        pearlyMarketPage.wishListtekUrunicinESCButonu.click();
        ReusableMethods.waitFor(3);


        //11.Whishlisteki tek üründe Add To Cart butonuna tıklar
        ReusableMethods.clickByJS(pearlyMarketPage.addToCartButonu);
        ReusableMethods.waitFor(3);

        //  Kullanıcı ekranda “Xiaomi Phone -4” has been added to your cart. yazısı çıktıgını gorur
        ReusableMethods.takeScreenShotOfPage();

        // Kullanıcı sayfayı kapatır
        Driver.closeDriver();

    }

    @Test
    public void test04() throws IOException {
        PearlyMarketPageUS_08 pearlyMarketPage = new PearlyMarketPageUS_08();

        //1. Kullanıcı URL' e gider
        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));

        //2. Kullanıcı Signin butonuna tıklar
        pearlyMarketPage.singInButonu.click();

        //3. Kullanıcı e-mail satırına veri girer
        pearlyMarketPage.emailKutusu.sendKeys(ConfigReader.getProperty("pearlyDogruMailTncr"));

        //4. Kullanıcı password satırına veri girer
        pearlyMarketPage.passwordKutusu.sendKeys(ConfigReader.getProperty("pearlyDogruSifreTncr"));

        //5. Kullanıcı Sıng In butonuna tıklar
        pearlyMarketPage.singInGirisTikla.click();
        ReusableMethods.waitFor(3);

        //6. Kullanıcı Cart butonuna tıklar
        pearlyMarketPage.cart.click();

        //7.Kullanıcı Vıew Cart butonuna tıklar
        pearlyMarketPage.vievCartButonu.click();
        ReusableMethods.waitFor(3);

        //8.Kullanıcı Proceed To Chckout butonuna tıklar
        ReusableMethods.clickByJS(pearlyMarketPage.proceedToCheckOutButonu);


        //9."Kullanıcı acılan Checkout sayfasında BILLING DETAILS menüsünü görür"
        Assert.assertTrue(pearlyMarketPage.billingDetails.isDisplayed());

        //10.Kullanıcı gerekli fatura bilgilerini girer
        //Kullanıcı First name butonuna bir veri girer
        //Kullanıcı Last name butonuna bir veri girer
        pearlyMarketPage.billingFirstName.clear();

        pearlyMarketPage.billingFirstName.sendKeys(ConfigReader.getProperty("billing_FirstNameTncr"),
                Keys.TAB, ConfigReader.getProperty("billing_LastNameTncr"), Keys.TAB, "Beytullah");

        //Kullanıcı Country / Region butonuna bir veri girer
        Select select = new Select(pearlyMarketPage.country);
        select.selectByVisibleText("Turkey");

        //Kullanıcı Street address butonuna bir veri girer
        pearlyMarketPage.billingStreetAdress1.clear();
        pearlyMarketPage.billingStreetAdress1.sendKeys(ConfigReader.getProperty("billing_Street_Address1Tncr"));

        //Kullanıcı Street address butonuna bir veri girer
        pearlyMarketPage.billingStreetAdress2.sendKeys(ConfigReader.getProperty("billing_Street_Address2Tncr"));

        //Kullanıcı ZIP Code butonuna bir veri girer
        pearlyMarketPage.billingPostCode.clear();
        pearlyMarketPage.billingPostCode.sendKeys(ConfigReader.getProperty("billing_PostCodeTncr"));

        //Kullanıcı Town / City butonuna bir veri girer
        pearlyMarketPage.billingCity.clear();
        pearlyMarketPage.billingCity.sendKeys(ConfigReader.getProperty("billing_Town_CityTncr"));

        //Kullanıcı Province  butonuna bir veri girer
        Select select1 = new Select(pearlyMarketPage.billingProvince);
        select1.selectByValue("TR34");

        //Kullanıcı Phone butonuna bir veri girer
        pearlyMarketPage.billingPhone.clear();
        pearlyMarketPage.billingPhone.sendKeys(ConfigReader.getProperty("billing_PhoneTncr"));
        ReusableMethods.waitFor(2);


        //11.Kullanıcı Pay at the door ödeme seçenegini seçer Place Order butonuna tıklar
        Actions actions1 = new Actions(Driver.getDriver());
        actions1.sendKeys(Keys.PAGE_DOWN).perform();
        pearlyMarketPage.payAtTheDoor.click();
        ReusableMethods.clickByJS(pearlyMarketPage.placeOrder);

        //"Kullanıcı acılan Order Complete sayfasında Thank you. Your order has been received. Mesajını gorur"
        ReusableMethods.waitFor(2);
        Assert.assertTrue(pearlyMarketPage.thankyoumesaj.isDisplayed());
        ReusableMethods.takeScreenShotOfPage();

        // Kullanıcı sayfayı kapatır
        Driver.closeDriver();
    }
}
