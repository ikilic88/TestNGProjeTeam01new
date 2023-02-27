package pages.US03;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class PearlyMarketPage03 {

    public PearlyMarketPage03(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement secondSignInButton;

    @FindBy(xpath = "(//a[.='My Account'])[1]")
    public WebElement myAccountButton;

    @FindBy(xpath = "//*[.='Addresses']")
    public WebElement addressesButton;

    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement billingAddButton;

    @FindBy(name = "billing_first_name")
    public WebElement firstName;

    @FindBy(name = "billing_last_name")
    public WebElement lastName;

    @FindBy(name = "billing_country")
    public WebElement selectCountry;

    @FindBy(name = "billing_address_1")
    public WebElement streetAddress;

    @FindBy(name = "billing_city")
    public WebElement town;

    @FindBy(id = "billing_state")
    public WebElement state;

    @FindBy(name = "billing_postcode")
    public WebElement zipCode;

    @FindBy(name = "billing_phone")
    public WebElement phone;

    @FindBy(xpath = "//*[.='Save address']")
    public WebElement saveAddressButton;

    @FindBy(xpath = "//*[@class='fas fa-check']")
    public WebElement saveAddressSuccessfully;

    @FindBy(xpath = "//*[@class='fas fa-exclamation-triangle']")
    public WebElement saveAddressError;

    @FindBy(xpath = "//*[@id='billing_email']")
    public WebElement emailBox;


    public void upToBillingAddClick() {
        PearlyMarketPage03 pearlyMarketPage03 = new PearlyMarketPage03();

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
        pearlyMarketPage03.billingAddButton.click();
    }
}
