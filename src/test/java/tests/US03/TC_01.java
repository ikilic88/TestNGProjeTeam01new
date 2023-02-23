package tests.US03;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.US03.PearlyMarketPage03;
import pages.US11.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {

    @Test
    public void TC_01() {
        PearlyMarketPage03 pearlyMarketPage03 = new PearlyMarketPage03();

        //Kullanici pearlymarket sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));
        //Kullanici "Sign In" butonuna tiklar
        pearlyMarketPage03.girisyap.click();
        //Kullanici username veya email adresini ve sifresini yazar
        pearlyMarketPage03.username.sendKeys(ConfigReader.getProperty("pearlyDogruMail"));
        pearlyMarketPage03.password.sendKeys(ConfigReader.getProperty("pearlyDogruSifre"));
        pearlyMarketPage03.secondSignInButton.click();
    }
}
