package tests.US18;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US17.PearlyEfsanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestEfsan18 {

    @Test
    public void us18Tc01() {
        PearlyEfsanPage pearlyEfsanPage = new PearlyEfsanPage();

        // Kullanıcı URL'ye gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        ReusableMethods.waitFor(2);

        // Sing in butonuna basar
        pearlyEfsanPage.signIn.click();

        // valid bir e-mail adresi girer, valid bir password girer, singin butonuna basar
        pearlyEfsanPage.userName.sendKeys(ConfigReader.getProperty("e-mail"));
        pearlyEfsanPage.Password.sendKeys(ConfigReader.getProperty("Password"));
        pearlyEfsanPage.login.click();
        ReusableMethods.waitFor(3);

        // sayfanın en altına inip my account'a tıklar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        pearlyEfsanPage.myAccountButton.click();

        // acılan sayfada store manager'a tıklar
        pearlyEfsanPage.storeManagerButton.click();

        // aılan sayfada Prdocuts'ın üzerine gelir
        ReusableMethods.waitFor(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pearlyEfsanPage.productsButton.click();

        // gelen add new'e basar
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.addNewButton.click();

        // simple product dropdown'ından External/Affiliate Product'ı seçer
        ReusableMethods.waitFor(2);
        Select select = new Select(pearlyEfsanPage.simpleProductDropdownonclick);
        select.selectByVisibleText("External/Affiliate Product");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void us18Tc02() {
        PearlyEfsanPage pearlyEfsanPage = new PearlyEfsanPage();

        // Kullanıcı URL'ye gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        ReusableMethods.waitFor(2);

        // Sing in butonuna basar
        pearlyEfsanPage.signIn.click();

        // valid bir e-mail adresi girer, valid bir password girer, singin butonuna basar
        pearlyEfsanPage.userName.sendKeys(ConfigReader.getProperty("e-mail"));
        pearlyEfsanPage.Password.sendKeys(ConfigReader.getProperty("Password"));
        pearlyEfsanPage.login.click();
        ReusableMethods.waitFor(3);

        // sayfanın en altına inip my account'a tıklar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        pearlyEfsanPage.myAccountButton.click();

        // acılan sayfada store manager'a tıklar
        pearlyEfsanPage.storeManagerButton.click();

        // aılan sayfada Prdocuts'ın üzerine gelir
        ReusableMethods.waitFor(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pearlyEfsanPage.productsButton.click();

        // gelen add new'e basar
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.addNewButton.click();

        // simple product dropdown'ından External/Affiliate Product'ı seçer
        ReusableMethods.waitFor(2);
        Select select = new Select(pearlyEfsanPage.simpleProductDropdownonclick);
        select.selectByVisibleText("External/Affiliate Product");

        // Url Textbox'ı tıklanabilir olmalıdır
        // Url Textbox'ı edit edilebilir olmalıdır.
        // Kullanıcı Textbox'a data girer
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", pearlyEfsanPage.urlTextBox);
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.urlTextBox.sendKeys("qwerty123");
        ReusableMethods.waitFor(2);

        // Price Textbox'ı edit  tıklanabilir olmalıdır
        // Price Textbox'ı edit edilebilir olmalıdır.
        // Kullanıcı Textbox'a data girer
        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver();
        js1.executeScript("arguments[0].click()", pearlyEfsanPage.priceTextBox);
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.priceTextBox.sendKeys("123");
        ReusableMethods.waitFor(2);
        // Kullanıcı Price textbox'ına rakam ve nokta dışında değer giremez

        // Button Textbox'ı edit  tıklanabilir olmalıdır
        // Button Textbox'ı edit edilebilir olmalıdır.
        // Kullanıcı Textbox'a data girer
        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
        js2.executeScript("arguments[0].click()", pearlyEfsanPage.buttonTextBox);
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.buttonTextBox.sendKeys("qwerty123");
        ReusableMethods.waitFor(2);
        // Kullanıcı Price textbox'ına rakam ve nokta dışında değer giremez

        // Sale Price Textbox'ı edit  tıklanabilir olmalıdır
        // Sale Price Button Textbox'ı edit edilebilir olmalıdır.
        // Kullanıcı Textbox'a data girer
        JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
        js3.executeScript("arguments[0].click()", pearlyEfsanPage.salePriceTextBox);
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.salePriceTextBox.sendKeys("120");
        ReusableMethods.waitFor(2);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test

    public void us18Tc04() {
        PearlyEfsanPage pearlyEfsanPage = new PearlyEfsanPage();


        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici signin butonuna tiklar
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.signIn.click();

        //"Kullanici Username or email address alanina sisteme kayitli username bilgisini girer"
        pearlyEfsanPage.userName.sendKeys(ConfigReader.getProperty("username"));

        //Kullanici password alanini,Sisteme kayıtlı sifresini girer
        pearlyEfsanPage.Password.sendKeys(ConfigReader.getProperty("password"));

        //Kullanıcı Sıng In butonuna Tıklar
        pearlyEfsanPage.login.click();

        // valid bir e-mail adresi girer, valid bir password girer, singin butonuna basar
        pearlyEfsanPage.userName.sendKeys(ConfigReader.getProperty("e-mail"));
        pearlyEfsanPage.Password.sendKeys(ConfigReader.getProperty("Password"));
        pearlyEfsanPage.login.click();
        ReusableMethods.waitFor(3);

        // sayfanın en altına inip my account'a tıklar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        pearlyEfsanPage.myAccountButton.click();

        // acılan sayfada store manager'a tıklar
        pearlyEfsanPage.storeManagerButton.click();

        // Kullanıcı product yazısının üzerine tıklar
        ReusableMethods.waitFor(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pearlyEfsanPage.productsButton.click();

        //Kullanıcı açılan sayfada yüklediği ürünü görür
        Assert.assertTrue(pearlyEfsanPage.addedProduct.isDisplayed()); //??????
    }

}

