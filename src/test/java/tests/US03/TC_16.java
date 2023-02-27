package tests.US03;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US03.PearlyMarketPage03;
import utilities.ConfigReader;

public class TC_16 {

    @Test
    public void TC_16() {

        PearlyMarketPage03 pearlyMarketPage03 = new PearlyMarketPage03();

        //Bu method billing add kismina kadar bizi goturecek
        pearlyMarketPage03.upToBillingAddClick();
        //Kullanici email address kisminda kayit oldugu e-postayi gorur.
        Assert.assertEquals(ConfigReader.getProperty("pearlyDogruMail"), pearlyMarketPage03.emailBox.getText());
    }
}
