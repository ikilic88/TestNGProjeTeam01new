package tests.US05;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US05.PearlyPage;
import utilities.ConfigReader;
import utilities.DataProviderUtils;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PearlyTest_US_05 {

    @Test
    public void US_05_TC_01() {
        PearlyPage pearlyPage = new PearlyPage();

        // Ana Sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        // Sıng In butonuna Tıklar
        ReusableMethods.waitFor(2);
        pearlyPage.signIn.click();

        //"Kullanici Username or email address alanina sisteme kayitli email adresini girer"
        pearlyPage.username.sendKeys(ConfigReader.getProperty("email"));

        //Kullanici password alanini,Sisteme kayıtlı sifresini girer
        pearlyPage.password.sendKeys(ConfigReader.getProperty("password"));

        //Kullanıcı Sıng In butonuna Tıklar
        pearlyPage.login.click();

        //Kullanıcı Sisteme Email ve Pasaport bilgileriyle giriş yapar
        Assert.assertTrue(pearlyPage.singOut.isDisplayed());

        // Sayfayı kapatalım
        Driver.closeDriver();
    }

    @Test(dataProvider = "kullaniciAdiPassword",dataProviderClass = DataProviderUtils.class)
    public void US_05_TC_02(String name, String password) {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici signin butonuna tiklar
        ReusableMethods.waitFor(2);
        pearlyPage.signIn.click();

        //"Kullanici Username or email address alanina sisteme kayitli username bilgisini girer"
        pearlyPage.username.sendKeys(name);

        //Kullanici password alanini,Sisteme kayıtlı sifresini girer
        pearlyPage.password.sendKeys(password);

        //Kullanıcı Sıng In butonuna Tıklar
        pearlyPage.login.click();

        //Kullanıcı Sisteme Username ve Pasaport bilgileriyle giriş yapar
        Assert.assertTrue(pearlyPage.singOut.isDisplayed());

        // Sayfayı kapatalım
        Driver.closeDriver();
    }


    @Test
    public void US_05_TC_03() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici signin butonuna tiklar
        ReusableMethods.waitFor(2);
        pearlyPage.signIn.click();

        //"Kullanici Username or email address alanina sisteme kayitli username bilgisini girer"
        pearlyPage.username.sendKeys(ConfigReader.getProperty("username"));

        //Kullanici password alanini,Sisteme kayıtlı sifresini girer
        pearlyPage.password.sendKeys(ConfigReader.getProperty("password"));

        //Kullanıcı Sıng In butonuna Tıklar
        pearlyPage.login.click();

        //Kullanıcı Sisteme Username ve Pasaport bilgileriyle giriş yapar
        Assert.assertTrue(pearlyPage.singOut.isDisplayed());

        // Kullanıcı sayfanın sag ust kısmında yer alan Sıng Out a click yapar
        pearlyPage.singOut.click();

        //"Kullanıcı Sayfanın Sol tarafında bulunan seceneklerden Account details butonuna tıklar"
        pearlyPage.accountDetails.click();

        //Kullanıcı First name kutusuna yeni bir deger girer
        //Kullanıcı Last name kutusuna yeni bir deger girer
        //Kullanıcı Display name kutusuna yeni bir deger girer
        //Kullanıcı Email kutusuna yeni bir email adresi girer

        pearlyPage.firstName.clear();
        pearlyPage.firstName.sendKeys(ConfigReader.getProperty("new_FirstName"),
                Keys.TAB,ConfigReader.getProperty("new_LastName"),
                Keys.TAB,ConfigReader.getProperty("new_DisplayName"),
                Keys.TAB,ConfigReader.getProperty("new_Email"));

        //Kullanıcı sayfanın sonundaki Save Changes butonuna tıklar
        ReusableMethods.waitFor(1);
        //ReusableMethods.clickByJS(pearlyPage.saveChanges);

            // 2. Yol
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",pearlyPage.saveChanges);

        //"Kullanıcı ekranda Account details changed successfully mesajını görür."

        ReusableMethods.scrollTopJS();
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        Driver.closeDriver();
}
    @Test
    public void US_05_TC_04()  {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici signin butonuna tiklar
        ReusableMethods.waitFor(2);
        pearlyPage.signIn.click();

        //"Kullanici Username or email address alanina sisteme kayitli email adresini girer"
        pearlyPage.username.sendKeys(ConfigReader.getProperty("new_Email"));

        //Kullanici password alanini,Sisteme kayıtlı sifresini girer
        pearlyPage.password.sendKeys(ConfigReader.getProperty("password"));

        //Kullanıcı Sıng In butonuna Tıklar
        pearlyPage.login.click();

        //Kullanıcı Sisteme Username ve Pasaport bilgileriyle giriş yapar
        Assert.assertTrue(pearlyPage.singOut.isDisplayed());

        // Sayfayı kapatalım
        Driver.closeDriver();

    }

    @Test
    public void US_05_TC_05() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici signin butonuna tiklar
        ReusableMethods.waitFor(2);
        pearlyPage.signIn.click();

        //"Kullanici Username or email address alanina sisteme kayitli username bilgisini girer"
        pearlyPage.username.sendKeys(ConfigReader.getProperty("username"));

        //Kullanici password alanini,Sisteme kayıtlı sifresini girer
        pearlyPage.password.sendKeys(ConfigReader.getProperty("password"));

        //Kullanıcı Sıng In butonuna Tıklar
        pearlyPage.login.click();

        //Kullanıcı Sisteme Username ve Pasaport bilgileriyle giriş yapar
        Assert.assertTrue(pearlyPage.singOut.isDisplayed());

        // Kullanıcı sayfanın sag ust kısmında yer alan Sıng Out a click yapar
        pearlyPage.singOut.click();

        //"Kullanıcı Sayfanın Sol tarafında bulunan seceneklerden Account details butonuna tıklar"
        pearlyPage.accountDetails.click();

        //Kullanıcı First name kutusuna yeni bir deger girer
        //Kullanıcı Last name kutusuna yeni bir deger girer
        //Kullanıcı Display name kutusuna yeni bir deger girer
        //Kullanıcı Email kutusuna yeni bir email adresi girer

        pearlyPage.firstName.clear();
        pearlyPage.firstName.sendKeys(ConfigReader.getProperty("new_FirstName"),
                Keys.TAB,ConfigReader.getProperty("new_LastName"),
                Keys.TAB,ConfigReader.getProperty("new_DisplayName"),
                Keys.TAB,ConfigReader.getProperty("new_Email"));

        //Kullanıcı Biography Alanına yeni  bir deger girer
        WebElement iframe = Driver.getDriver().findElement(By.xpath("//*[@id=\"user_description_ifr\"]"));
        Driver.getDriver().switchTo().frame(iframe);
        pearlyPage.Biografi.clear();
        ReusableMethods.waitFor(1);
        pearlyPage.Biografi.sendKeys(ConfigReader.getProperty("iframe_Biography"));
        Driver.getDriver().switchTo().parentFrame();

        //Kullanıcı sayfanın sonundaki Save Changes butonuna tıklar
        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(pearlyPage.saveChanges);

        // 2. Yol
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",pearlyPage.saveChanges);

        //"Kullanıcı ekranda Account details changed successfully mesajını görür."
        ReusableMethods.scrollTopJS();
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        Driver.closeDriver();

    }

    @Test
    public void US_05_TC_06() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici signin butonuna tiklar
        ReusableMethods.waitFor(2);
        pearlyPage.signIn.click();

        //"Kullanici Username or email address alanina sisteme kayitli username bilgisini girer"
        pearlyPage.username.sendKeys(ConfigReader.getProperty("username"));

        //Kullanici password alanini,Sisteme kayıtlı sifresini girer
        pearlyPage.password.sendKeys(ConfigReader.getProperty("password"));

        //Kullanıcı Sıng In butonuna Tıklar
        pearlyPage.login.click();

        //Kullanıcı Sisteme Username ve Pasaport bilgileriyle giriş yapar
        Assert.assertTrue(pearlyPage.singOut.isDisplayed());

        // Kullanıcı sayfanın sag ust kısmında yer alan Sıng Out a click yapar
        pearlyPage.singOut.click();

        //"Kullanıcı Sayfanın Sol tarafında bulunan seceneklerden Account details butonuna tıklar"
        pearlyPage.accountDetails.click();

        //Kullanıcı First name kutusunu bos bırakır
        //Kullanıcı Last name kutusuna bir deger girer
        //Kullanıcı Display name kutusuna bir deger girer
        //Kullanıcı Email kutusuna bir email adresi girer
        pearlyPage.firstName.clear();
        pearlyPage.firstName.sendKeys( Keys.TAB,ConfigReader.getProperty("new_LastName"),
                Keys.TAB,ConfigReader.getProperty("new_DisplayName"),
                Keys.TAB,ConfigReader.getProperty("new_Email"));

        //Kullanıcı Biography Alanına yeni  bir deger girer
        WebElement iframe = Driver.getDriver().findElement(By.xpath("//*[@id=\"user_description_ifr\"]"));
        Driver.getDriver().switchTo().frame(iframe);
        pearlyPage.Biografi.clear();
        ReusableMethods.waitFor(1);
        pearlyPage.Biografi.sendKeys(ConfigReader.getProperty("iframe_Biography"));
        Driver.getDriver().switchTo().parentFrame();

        //Kullanıcı sayfanın sonundaki Save Changes butonuna tıklar
        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(pearlyPage.saveChanges);

        //"Kullanıcı ekranda FIRST NAME is a required field mesajını görür.
       File image = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
       String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
       String path = System.getProperty("user.dir") + "/test-output/Screenshots/"+currentTime+"image.png";
       FileUtils.copyFile(image,new File(path));

        // Sayfayı kapatalım
        Driver.closeDriver();
    }

    @Test
    public void US_05_TC_07() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici signin butonuna tiklar
        ReusableMethods.waitFor(2);
        pearlyPage.signIn.click();

        //"Kullanici Username or email address alanina sisteme kayitli username bilgisini girer"
        pearlyPage.username.sendKeys(ConfigReader.getProperty("username"));

        //Kullanici password alanini,Sisteme kayıtlı sifresini girer
        pearlyPage.password.sendKeys(ConfigReader.getProperty("password"));

        //Kullanıcı Sıng In butonuna Tıklar
        pearlyPage.login.click();

        //Kullanıcı Sisteme Username ve Pasaport bilgileriyle giriş yapar
        Assert.assertTrue(pearlyPage.singOut.isDisplayed());

        // Kullanıcı sayfanın sag ust kısmında yer alan Sıng Out a click yapar
        pearlyPage.singOut.click();

        //"Kullanıcı Sayfanın Sol tarafında bulunan seceneklerden Account details butonuna tıklar"
        pearlyPage.accountDetails.click();

        //Kullanıcı First name kutusuna yeni bir deger girer
        //Kullanıcı Last name kutusuna yeni bir deger girer
        //Kullanıcı Display name kutusuna yeni bir deger girer
        //Kullanıcı Email kutusuna yeni bir email adresi girer

        pearlyPage.firstName.clear();
        pearlyPage.firstName.sendKeys(ConfigReader.getProperty("new_FirstName"),
                Keys.TAB,ConfigReader.getProperty("new_LastName"),
                Keys.TAB,ConfigReader.getProperty("new_DisplayName"),
                Keys.TAB,ConfigReader.getProperty("new_Email"));

        //"Kulllanıcı Password change alanındakı birinci kutuya sisteme kayıtlı password girer"
        //"Kulllanıcı Password change alanındakı ikinci kutuya yeni passwordunu girer "
        //"Kulllanıcı Password change alanındakı ucuncu kutuya yeni passwordunu tekrar girer"
       pearlyPage.password1.sendKeys(ConfigReader.getProperty("password"),
               Keys.TAB,ConfigReader.getProperty("new_password"),
               Keys.TAB,ConfigReader.getProperty("new_password"));

        //Kullanıcı sayfanın sonundaki Save Changes butonuna tıklar
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",pearlyPage.saveChanges);

        //"Kullanıcı ekranda Account details changed successfully mesajını görür."
        ReusableMethods.waitFor(1);
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        Driver.closeDriver();
    }

    @Test
    public void US_05_TC_08() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici signin butonuna tiklar
        ReusableMethods.waitFor(2);
        pearlyPage.signIn.click();

        //"Kullanici Username or email address alanina sisteme kayitli username bilgisini girer"
        pearlyPage.username.sendKeys(ConfigReader.getProperty("username"));

        //Kullanici password alanini,Sisteme kayıtlı sifresini girer
        pearlyPage.password.sendKeys(ConfigReader.getProperty("new_password"));

        //Kullanıcı Sıng In butonuna Tıklar
        pearlyPage.login.click();

        //Kullanıcı Sisteme Username ve Pasaport bilgileriyle giriş yapar
        Assert.assertTrue(pearlyPage.singOut.isDisplayed());

        // Kullanıcı sayfanın sag ust kısmında yer alan Sıng Out a click yapar
        pearlyPage.singOut.click();

        //"Kullanıcı Sayfanın Sol tarafında bulunan seceneklerden Account details butonuna tıklar"
        pearlyPage.accountDetails.click();

        //Kullanıcı First name kutusunu bos bırakır
        //Kullanıcı Last name kutusuna bir deger girer
        //Kullanıcı Display name kutusuna bir deger girer
        //Kullanıcı Email kutusuna bir email adresi girer
        pearlyPage.firstName.clear();
        pearlyPage.firstName.sendKeys( Keys.TAB,ConfigReader.getProperty("new_LastName"),
                Keys.TAB,ConfigReader.getProperty("new_DisplayName"),
                Keys.TAB,ConfigReader.getProperty("new_Email"));

        //Kulllanıcı Password change alanındakı birinci kutuya sisteme kayıtlı password girer"
        //Kulllanıcı Password change alanındakı ikinci kutuya yeni passwordunu girer "
        //Kulllanıcı Password change alanındakı ucuncu kutuya yeni passwordunu tekrar girer"
        pearlyPage.password1.sendKeys(ConfigReader.getProperty("new_password"),
                Keys.TAB,ConfigReader.getProperty("password"),
                Keys.TAB,ConfigReader.getProperty("password"));

        //Kullanıcı sayfanın sonundaki Save Changes butonuna tıklar
        ReusableMethods.clickByJS(pearlyPage.saveChanges);

        //"Kullanıcı ekranda FIRST NAME is a required field mesajını görür.
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        Driver.closeDriver();
    }

    @Test
    public void US_05_TC_09() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();

        // Kullanici anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        //Kullanici signin butonuna tiklar
        ReusableMethods.waitFor(2);
        pearlyPage.signIn.click();

        //"Kullanici Username or email address alanina sisteme kayitli username bilgisini girer"
        pearlyPage.username.sendKeys(ConfigReader.getProperty("username"));

        //Kullanici password alanini,Sisteme kayıtlı sifresini girer
        pearlyPage.password.sendKeys(ConfigReader.getProperty("new_password"));

        //Kullanıcı Sıng In butonuna Tıklar
        pearlyPage.login.click();

        //Kullanıcı Sisteme Username ve Pasaport bilgileriyle giriş yapar
        Assert.assertTrue(pearlyPage.singOut.isDisplayed());

        // Kullanıcı sayfanın sag ust kısmında yer alan Sıng Out a click yapar
        pearlyPage.singOut.click();

        //"Kullanıcı Sayfanın Sol tarafında bulunan seceneklerden Account details butonuna tıklar"
        pearlyPage.accountDetails.click();

        //Kullanıcı First name kutusuna yeni bir deger girer
        //Kullanıcı Last name kutusuna yeni bir deger girer
        //Kullanıcı Display name kutusuna yeni bir deger girer
        //Kullanıcı Email kutusuna yeni bir email adresi girer

        pearlyPage.firstName.clear();
        pearlyPage.firstName.sendKeys(ConfigReader.getProperty("new_FirstName"),
                Keys.TAB,ConfigReader.getProperty("new_LastName"),
                Keys.TAB,ConfigReader.getProperty("new_DisplayName"),
                Keys.TAB,ConfigReader.getProperty("new_Email"));

        //"Kulllanıcı Password change alanındakı birinci kutuya sisteme kayıtlı password girer"
        //"Kulllanıcı Password change alanındakı ikinci kutuya yeni passwordunu girer "
        //"Kulllanıcı Password change alanındakı ucuncu kutuya yeni passwordunu tekrar girer"
        ReusableMethods.waitFor(2);
        pearlyPage.password1.sendKeys(ConfigReader.getProperty("new_password"),
               Keys.TAB,"Ser");
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollIntoViewJS(pearlyPage.password1);
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();
        pearlyPage.password1.clear();
        pearlyPage.password1.sendKeys(ConfigReader.getProperty("new_password"),
                Keys.TAB,ConfigReader.getProperty("missing_password"),
                Keys.TAB,ConfigReader.getProperty("missing_password"));

        //Kullanıcı sayfanın sonundaki Save Changes butonuna tıklar
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",pearlyPage.saveChanges);

        //"Kullanıcı ekranda Account details changed successfully mesajını görür."
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();

        // Sayfayı kapatalım
        Driver.closeDriver();
    }

    // İLK SİFREYE DONUS YAPILDI.
    @Test
    public void US_05_TC_10() throws IOException {
        PearlyPage pearlyPage = new PearlyPage();
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));
        pearlyPage.signIn.click();
        pearlyPage.username.sendKeys(ConfigReader.getProperty("username"));
        pearlyPage.password.sendKeys(ConfigReader.getProperty("missing_password"));
        pearlyPage.login.click();
        pearlyPage.singOut.click();
        pearlyPage.accountDetails.click();
        pearlyPage.firstName.clear();
        pearlyPage.firstName.sendKeys(ConfigReader.getProperty("new_FirstName"),
                Keys.TAB,ConfigReader.getProperty("new_LastName"),
                Keys.TAB,ConfigReader.getProperty("new_DisplayName"),
                Keys.TAB,ConfigReader.getProperty("email"));

        pearlyPage.password1.sendKeys(ConfigReader.getProperty("missing_password"),
                Keys.TAB,ConfigReader.getProperty("password"),
                Keys.TAB,ConfigReader.getProperty("password"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",pearlyPage.saveChanges);
        Driver.closeDriver();
    }
}

