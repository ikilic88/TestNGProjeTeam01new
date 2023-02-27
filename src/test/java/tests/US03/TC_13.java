package tests.US03;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US03.PearlyMarketPage03;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC_13 {

    @Test
    public void TC_13() {

        PearlyMarketPage03 pearlyMarketPage03 = new PearlyMarketPage03();

        //Bu method billing add kismina kadar bizi goturecek
        pearlyMarketPage03.upToBillingAddClick();
        //Kullanici First Name girer  -- Kullanici Last Name girer
        pearlyMarketPage03.firstName.sendKeys(ConfigReader.getProperty("ahmetFirstName"));
        pearlyMarketPage03.lastName.sendKeys(ConfigReader.getProperty("ahmetLastName"));
        //Kullanici Country/Region girer
        Select select = new Select(pearlyMarketPage03.selectCountry);
        select.selectByVisibleText(ConfigReader.getProperty("ahmetCountry"));
        //Kullanici Street address girer
        pearlyMarketPage03.streetAddress.sendKeys(ConfigReader.getProperty("ahmetStreetAddress"));
        //Kullanici Town / City girer
        pearlyMarketPage03.town.sendKeys(ConfigReader.getProperty("ahmetTown"));
        //Kullanici State girer
        Select select1 = new Select(pearlyMarketPage03.state);
        select1.selectByVisibleText("Michigan");
        //Kullanici ZIP Code girer
        pearlyMarketPage03.zipCode.sendKeys(ConfigReader.getProperty("ahmetZipCode"));
        //Kullanici hatali Phone girer
        pearlyMarketPage03.phone.sendKeys(ConfigReader.getProperty("ahmetWrongPhone2"));
        //Kullanici SAVE ADDRESS butonuna tiklar
        ReusableMethods.clickByJS(pearlyMarketPage03.saveAddressButton);
        //Kullanici Address changed successfully yazisini gorur
        Assert.assertTrue(pearlyMarketPage03.saveAddressSuccessfully.isDisplayed());
    }
}
