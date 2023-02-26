package tests.US09;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US09.PearlyMarketPage;
import pages.US09.VendorRegister;
import utilities.ConfigReader;
import utilities.Driver;

public class Test02 {
    @Test
    public void kayitliMail() throws InterruptedException {


        PearlyMarketPage pearlyMarketPage = new PearlyMarketPage();
        VendorRegister vendorRegister = new VendorRegister();

        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));
        Thread.sleep(3000);
        pearlyMarketPage.register.click();
        pearlyMarketPage.becomeAVendor.click();
        Thread.sleep(3000);
        //vendorRegister.reSendCode.sendKeys(ConfigReader.getProperty());
        vendorRegister.vendoremail.sendKeys(ConfigReader.getProperty("pearlyDogruMail"));
        vendorRegister.reSendCode.sendKeys(ConfigReader.getProperty("emailVerification"));
        vendorRegister.registrationPassword.sendKeys(ConfigReader.getProperty("pearlyDogruSifre"));
        vendorRegister.confirmPassword.sendKeys(ConfigReader.getProperty("pearlyDogruSifre"));
        vendorRegister.registerButton.click();
        Assert.assertTrue(vendorRegister.alreadyExists.isDisplayed());
        Driver.closeDriver();


    }
}
