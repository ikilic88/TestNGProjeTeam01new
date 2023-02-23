package pages.US21;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyPage {

    public PearlyPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "login")
    public WebElement login;

    @FindBy(xpath = "//*[text()=\"Sign Out\"]")
    public WebElement singOut;

    @FindBy(xpath = "//*[text()='Account details']")
    public WebElement accountDetails;

    @FindBy(name = "account_first_name")
    public WebElement firstName;

    @FindBy(xpath = "//*[@name=\"save_account_details\"]")
    public WebElement saveChanges;

    @FindBy(id = "tinymce")
    public WebElement Biografi;

    @FindBy(xpath = "//*[@name=\"password_current\"]")
    public WebElement password1;

    @FindBy(xpath = "//*[@class=\"woocommerce-password-hint\"]")
    public WebElement missingPasswordMesaj;
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy(name = "s")
    public WebElement search;

    @FindBy(xpath = "(//*[@class=\"attachment-woocommerce_thumbnail size-woocommerce_thumbnail\"])[7]")
    public WebElement appleIphone14;

    @FindBy(name = "add-to-cart")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@class=\"w-icon-cart\"]")
    public WebElement card;

    @FindBy(xpath = "(//*[@class=\"attachment-woocommerce_thumbnail size-woocommerce_thumbnail\"])[3]")
    public WebElement kitchen;

    @FindBy(xpath = "//*[@class=\"fas fa-times\"]")
    public WebElement urunCikartma1;

    @FindBy(xpath = "(//*[@class=\"fas fa-times\"])[2]")
    public WebElement urunCikartma2;

    @FindBy(xpath = "//*[text()=\"Checkout\"]")
    public WebElement checkout;

    @FindBy(xpath = "//*[text()=\"Billing details\"]")
    public WebElement billingDetails;

    @FindBy (name = "billing_first_name")
    public WebElement billingFirstName;

    @FindBy(id = "billing_country")
    public WebElement country;

    @FindBy(id = "billing_address_1")
    public WebElement billingStreetAdress1;

    @FindBy (id = "billing_address_2")
    public WebElement billingStreetAdress2;

    @FindBy(id = "billing_postcode")
    public WebElement billingPostCode;

    @FindBy(id = "billing_city")
    public WebElement billingCity;

    @FindBy(id = "billing_state")
    public WebElement billingProvince;

    @FindBy (id = "billing_phone")
    public WebElement billingPhone;

    @FindBy(id = "billing_email")
    public WebElement billingEmail;

    @FindBy(id = "place_order")
    public WebElement placeOrder;

    @FindBy(xpath = "//*[text()=\"Thank you. Your order has been received.\"]")
    public WebElement thankyoumesaj;

    @FindBy(xpath = "//*[@class=\"button wc-forward\"]")
    public WebElement viewCart;

    @FindBy(xpath = "//*[@class=\"checkout-button button alt wc-forward\"]")
    public WebElement proceedToCheckout;

    ////////////////////////////////////////////////////////////////////////////////

    @FindBy (xpath = "//*[@alt=\"toka\"]")
    public WebElement tokaSeti;

    @FindBy(id = "coupon_code")
    public WebElement couponCode;

    @FindBy(xpath = "//*[@name=\"apply_coupon\"]")
    public WebElement applyCoupon;

    @FindBy(xpath = "//*[@class=\"checkout-button button alt wc-forward\"]")
    public WebElement proceedToCheckoutCoupon;
}
