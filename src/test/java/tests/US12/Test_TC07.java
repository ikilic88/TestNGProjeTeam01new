package tests.US12;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US12.PearlyMarketPage12;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Test_TC07 {
    @Test
    public void testTC07() throws Exception{

        PearlyMarketPage12 pearly12 = new PearlyMarketPage12();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Vendor pearlymarket sayfa url`sine gider
        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));

        //Vendor sign in butonuna tiklar
        pearly12.singInButton.click();

        //Vendor gecerli mail adresi ve password girer
        pearly12.usernameEsra.sendKeys(ConfigReader.getProperty("usernameEsra"));
        pearly12.passwordEsra.sendKeys(ConfigReader.getProperty("passwordEsra"));

        //Vendor giris yapmak icin sign in butonuna tiklar
        pearly12.submitButton.click();

        //Vendor my account sayfasini goruntuler
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//sayfayi asagi alir
        ReusableMethods.waitFor(2);

        pearly12.myAccount.click();
        ReusableMethods.waitFor(2);

        //Vendor dashboard altinda adresses butonunu tiklar
        pearly12.dashboardAddresses.click();
        ReusableMethods.waitFor(2);

        //Vendor ADD yazisini tiklar
        pearly12.AddButton.click();

        //Vendor First Name girer
        pearly12.FirstName.sendKeys(ConfigReader.getProperty("firstname_ash"));

        //Vendor Last Name girer
        pearly12.LastName.sendKeys(ConfigReader.getProperty("lastname_ash"));

        //Vendor Country/Region girer
        Select selectcountry = new Select(pearly12.selectCauntry);
        selectcountry.selectByVisibleText("United State (US)");

        //Vendor Street address girer
        pearly12.streetAddress1.sendKeys(ConfigReader.getProperty("street_ash"));

        //Vendor Town / City girer
        pearly12.city.sendKeys(ConfigReader.getProperty("city_ash"));

        //Vendor State girer
        Select selectstate = new Select(pearly12.selectState);
        selectstate.selectByVisibleText("New York");

        //Vendor Postcode girer
        pearly12.postCode.sendKeys(ConfigReader.getProperty("postcode_ash"));

        //Vendor Phone kismina 11 haneli rakam girer
        pearly12.PhoneNumber.sendKeys("12345678912", Keys.ENTER);

        //Vendor SAVE ADDRESS butonuna tiklar
        pearly12.saveButton.click();

        //Vendor Address changed successfully. yazisini gorur ve phone u 11 haneli olarak grildigini dogrular
        Assert.assertTrue(pearly12.saveAddressSuccessfully.isDisplayed());
        ReusableMethods.takeScreenShotOfPage();
    }
}
