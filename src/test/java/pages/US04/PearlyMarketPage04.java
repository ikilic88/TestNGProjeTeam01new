package pages.US04;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.US03.PearlyMarketPage03;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class PearlyMarketPage04 {

    public PearlyMarketPage04(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement shippingAddButton;

    @FindBy(name = "shipping_first_name")
    public WebElement firstName;

    @FindBy(name = "shipping_last_name")
    public WebElement lastName;

    @FindBy(name = "shipping_country")
    public WebElement selectCountry;

    @FindBy(name = "shipping_address_1")
    public WebElement streetAddress;

    @FindBy(name = "shipping_city")
    public WebElement town;

    @FindBy(id = "shipping_state")
    public WebElement state;

    @FindBy(name = "shipping_postcode")
    public WebElement zipCode;

    public void upToShippingAddClick() {
        PearlyMarketPage03 pearlyMarketPage03 = new PearlyMarketPage03();
        PearlyMarketPage04 pearlyMarketPage04 = new PearlyMarketPage04();
        //Kullanici pearlymarket sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));
        //Kullanici "Sign In" butonuna tiklar
        pearlyMarketPage03.signInButton.click();
        //Kullanici username veya email adresini ve sifresini yazar
        pearlyMarketPage03.username.sendKeys(ConfigReader.getProperty("pearlyDogruMail"));
        pearlyMarketPage03.password.sendKeys(ConfigReader.getProperty("pearlyDogruSifre"));
        //Kullanici "Sign In" butonuna tiklar
        pearlyMarketPage03.secondSignInButton.click();
        //Kullanici My Account butonuna tiklar
        ReusableMethods.scrollIntoViewJS(pearlyMarketPage03.myAccountButton);
        Driver.getDriver().navigate().refresh();
        pearlyMarketPage03.myAccountButton.click();
        //Kullanici Adresses secenegine tiklar
        pearlyMarketPage03.addressesButton.click();
        //Kullanici Billing Adress altindaki ADD secenegine tiklar
        pearlyMarketPage04.shippingAddButton.click();
    }
}
