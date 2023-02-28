package tests.US04;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US03.PearlyMarketPage03;
import pages.US04.PearlyMarketPage04;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC_10 {

    @Test
    public void TC_10() {
        PearlyMarketPage04 pearlyMarketPage04 = new PearlyMarketPage04();
        PearlyMarketPage03 pearlyMarketPage03 = new PearlyMarketPage03();

        //Bu method bizi shipping add kismina kadar goturecek
        pearlyMarketPage04.upToShippingAddClick();
        //Kullanici First Name girer  -- Kullanici hatali Last Name girer
        pearlyMarketPage04.firstName.sendKeys(ConfigReader.getProperty("ahmetFirstName"));
        pearlyMarketPage04.lastName.sendKeys(ConfigReader.getProperty("ahmetWrongLastName"));
        //Kullanici Country/Region girer
        Select select = new Select(pearlyMarketPage04.selectCountry);
        select.selectByVisibleText(ConfigReader.getProperty("ahmetCountry"));
        //Kullanici Street address girer
        pearlyMarketPage04.streetAddress.sendKeys(ConfigReader.getProperty("ahmetStreetAddress"));
        //Kullanici Town / City girer
        pearlyMarketPage04.town.sendKeys(ConfigReader.getProperty("ahmetTown"));
        //Kullanici State girer
        Select select1 = new Select(pearlyMarketPage04.state);
        select1.selectByVisibleText("Michigan");
        //Kullanici ZIP Code girer
        pearlyMarketPage04.zipCode.sendKeys(ConfigReader.getProperty("ahmetZipCode"));
        //Kullanici SAVE ADDRESS butonuna tiklar
        ReusableMethods.clickByJS(pearlyMarketPage03.saveAddressButton);
        //Kullanici Address changed successfully yazisini gorur
        Assert.assertTrue(pearlyMarketPage03.saveAddressSuccessfully.isDisplayed());
    }
}
