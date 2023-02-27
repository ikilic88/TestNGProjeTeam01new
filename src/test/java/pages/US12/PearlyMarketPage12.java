package pages.US12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyMarketPage12 {

    public PearlyMarketPage12(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //ortak
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div/div/div[9]/div/div/a[1]/span")
    public WebElement singInButton;

    @FindBy(xpath="//*[@id='username']")
    public WebElement usernameEsra;

    @FindBy(xpath="//*[@id='password']")
    public WebElement passwordEsra;

    @FindBy(xpath="(//button[@type='submit'])[1]")
    public WebElement submitButton;

    @FindBy(xpath ="//*[@id=\"menu-item-1079\"]/a")
    public WebElement myAccount;

    @FindBy(xpath="//div[@class=\"page-header\"]")
    public WebElement myAccountPage;

    //TC01

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[5]")
    public WebElement dashboardAddresses;

    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement AddButton;

    @FindBy(xpath="(//*[@class=\"w-icon-long-arrow-right\"])[1]")
    public WebElement editButton;

    @FindBy(xpath="//*[@id=\"billing_first_name\"]")
    public WebElement FirstName;

    @FindBy(xpath="//*[@id=\"billing_last_name\"]")
    public WebElement LastName;

    @FindBy(xpath="//*[@id=\"select2-billing_country-container\"]/span")
    public WebElement selectCauntry;
    @FindBy(xpath="//*[@id=\"select2-billing_country-result-vtm3-US\"]")
    public WebElement selectUS;

    @FindBy(xpath="//*[@id=\"billing_address_1\"]")
    public WebElement streetAddress1;
    @FindBy(xpath="//*[@id=\"billing_address_2\"]")
    public WebElement streetAddress2;

    @FindBy(xpath="//*[@id=\"billing_city\"]")
    public WebElement city;

    @FindBy(xpath="(//span[@class=\"select2-selection__arrow\"])[2]")
    public WebElement selectState;

    @FindBy(xpath="//*[@id=\"billing_postcode\"]")
    public WebElement postCode;

    @FindBy(xpath="//*[@id=\"billing_phone\"]")
    public WebElement PhoneNumber;

    @FindBy(xpath="(//button[@type=\"submit\"])[2]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@class=;fas fa-check']")
    public WebElement saveAddressSuccessfully;

//div[@class="woocommerce-notices-wrapper"]




    //
    @FindBy(xpath="//*[@id=\"billing_email\"]")
    public WebElement email;













}
