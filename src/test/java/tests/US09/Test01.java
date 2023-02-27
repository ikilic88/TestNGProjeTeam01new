package tests.US09;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.US09.FakeMailPage;
import pages.US09.PearlyMarketPage;
import pages.US09.VendorRegister;
import utilities.ConfigReader;
import utilities.Driver;

/*
Sign Up ekranından "Become a Vendor" linki ile giriş yapılabilmeli
e-mail adresi girmeli
Verification Code text kutusuna geldiğinde "Verification code sent to your email: abc@abc.com." mesajını görmeli
Mail adresine gelen konu Verification Code text kutusuna girmeli
Password yazmalı. Password: kucuk harf, büyük harf, rakam ve special karakter içermeli
Password'ü tekrar yazmalı
Register butonuna tıklayarak vendor olarak kayıtı tamamlamalı
Kayıtlı bir e-mail adresi ile kayıt olmaya çalıştığında "This Email already exists. Please login to the site and apply as vendor." mesajını almalı
 */
public class Test01 {




    @Test
    public void test1() throws InterruptedException {
        PearlyMarketPage pearlyMarketPage = new PearlyMarketPage();
        FakeMailPage fakeMailPage = new FakeMailPage();
        VendorRegister vendorRegister = new VendorRegister();

        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));

        pearlyMarketPage.register.click();
        Thread.sleep(3000);
        pearlyMarketPage.becomeAVendor.click();
        Thread.sleep(3000);
        String vendorwindow = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("fakeMailUrl09"));
        String fakerwindow = Driver.getDriver().getWindowHandle();
        String maill = fakeMailPage.fakemail.getText();
        Driver.getDriver().switchTo().window(vendorwindow);
        vendorRegister.vendoremail.sendKeys(maill);
        vendorRegister.reSendCode.click();
        Driver.getDriver().switchTo().window(fakerwindow);
        Thread.sleep(3000);
        Driver.getDriver().navigate().refresh();
        fakeMailPage.SendCode.click();
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("iframeMail")));
        String fakeCodestr = fakeMailPage.fakecode.getText();
        System.out.println("fakeCodestr = " + fakeCodestr);
        Driver.getDriver().switchTo().window(vendorwindow);
        vendorRegister.reSendCode.sendKeys(fakeCodestr);
        Thread.sleep(2000);
        Assert.assertTrue(vendorRegister.verifyCodeSend.isDisplayed());

        vendorRegister.registrationPassword.sendKeys(ConfigReader.getProperty("regisrationPassword"));
        vendorRegister.confirmPassword.sendKeys(ConfigReader.getProperty("regisrationPassword"));
        vendorRegister.registerButton.click();
        vendorRegister.SuccesfullyRegistered.isDisplayed();
        Driver.getDriver().quit();

    }
}
