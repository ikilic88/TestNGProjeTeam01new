package tests.US10;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US09.PearlyMarketPage;
import pages.US09.VendorRegister;
import utilities.ConfigReader;
import utilities.Driver;

public class Test03 {

    @Test
    public void test3() throws InterruptedException {
        PearlyMarketPage pearlyMarketPage = new PearlyMarketPage();
        VendorRegister vendorRegister = new VendorRegister();

        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));
        pearlyMarketPage.register.click();
        pearlyMarketPage.becomeAVendor.click();
        Thread.sleep(3000);
        //vendorRegister.reSendCode.sendKeys(ConfigReader.getProperty());
        vendorRegister.vendoremail.sendKeys(ConfigReader.getProperty("pearlyDogruMail"));
        vendorRegister.reSendCode.sendKeys(ConfigReader.getProperty("emailVerification"));
        vendorRegister.registrationPassword.sendKeys(ConfigReader.getProperty("short.pwd"));
        Assert.assertTrue(vendorRegister.tooShortMessage.isDisplayed());
        vendorRegister.registrationPassword.sendKeys(ConfigReader.getProperty("weak.pwd"));
        Assert.assertTrue(vendorRegister.weakMessage.isDisplayed());
        vendorRegister.registrationPassword.sendKeys(ConfigReader.getProperty("good.pwd"));
        Assert.assertTrue(vendorRegister.goodMessage.isDisplayed());
        vendorRegister.registrationPassword.sendKeys(ConfigReader.getProperty("strong.pwd"));
        Assert.assertTrue(vendorRegister.strongMessage.isDisplayed());
        Driver.closeDriver();
    }
}
