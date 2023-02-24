package tests.US07;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.US07.PearlyMarketPageUS_07;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US07_Compare {

    @Test
    public void test01() throws IOException {

        PearlyMarketPageUS_07 pearlyMarketPage = new PearlyMarketPageUS_07();

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

        //7.Kullanıcı Compare ile en fazla 4 ürün ekler
        ReusableMethods.clickByJS(pearlyMarketPage.compare1);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.clickByJS(pearlyMarketPage.compare2);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.clickByJS(pearlyMarketPage.compare3);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.clickByJS(pearlyMarketPage.compare4);

        //8.Kullanıcı sayfanın sol kısımda çıkan clean all butonuna tıklar ürünleri siler
        ReusableMethods.clickByJS(pearlyMarketPage.cleanAllButonu);
        ReusableMethods.waitFor(3);
        ReusableMethods.takeScreenShotOfPage();

        // Kullanıcı sayfayı kapatır
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {

        PearlyMarketPageUS_07 pearlyMarketPage = new PearlyMarketPageUS_07();

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

        //7.Kullanıcı Compare ile en fazla 4 ürün ekler
        ReusableMethods.clickByJS(pearlyMarketPage.compare1);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.clickByJS(pearlyMarketPage.compare2);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.clickByJS(pearlyMarketPage.compare3);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.clickByJS(pearlyMarketPage.compare4);

        //8.Kullanıcı sayfa sağ alt kısmında bulunan Start Compare! butonuna tıklar
        ReusableMethods.clickByJS(pearlyMarketPage.startCompare);

        //9.Kullanıcı çıkan X butonunlarına tıklar
        ReusableMethods.clickByJS(pearlyMarketPage.urunSilButonu);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(pearlyMarketPage.urunSilButonu);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(pearlyMarketPage.urunSilButonu);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(pearlyMarketPage.urunSilButonu);
        ReusableMethods.waitFor(2);

        ReusableMethods.takeScreenShotOfPage();

        // Kullanıcı sayfayı kapatır
        Driver.closeDriver();

    }

    @Test
    public void test3() throws IOException {

        PearlyMarketPageUS_07 pearlyMarketPage = new PearlyMarketPageUS_07();

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

        //7.Kullanıcı Compare ile en fazla 5 ürün ekler
        ReusableMethods.clickByJS(pearlyMarketPage.compare1);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.clickByJS(pearlyMarketPage.compare2);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.clickByJS(pearlyMarketPage.compare3);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.clickByJS(pearlyMarketPage.compare4);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.clickByJS(pearlyMarketPage.compare5);
        ReusableMethods.waitFor(2);

        //8. 5 Urun ekleyemedigini test eder
        ReusableMethods.takeScreenShotOfPage();

        // Kullanıcı sayfayı kapatır
        Driver.closeDriver();

    }
}
