package pages.US08;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyMarketPageUS_08 {

public PearlyMarketPageUS_08(){
    PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//*[@class='w-icon-cart'])[1]")
    public WebElement cart;

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[1]")
    public WebElement compare1;

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[4]")
    public WebElement compare2;

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[5]")
    public WebElement compare3;

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[6]")
    public WebElement compare4;

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[7]")
    public WebElement compare5;

    @FindBy(xpath = "//*[@class='btn btn-dark btn-rounded']")
    public WebElement startCompare;

    @FindBy(xpath = "(//*[@type='search'])[1]")
    public WebElement searcBoxButonu;

    @FindBy(xpath = "(//*[@class='btn btn-quickview btn-outline btn-default btn-rounded btn-sm mr-lg-2'])[1]")
    public WebElement qucickWiew1;

    @FindBy(xpath = "(//*[@class='btn btn-quickview btn-outline btn-default btn-rounded btn-sm mr-lg-2'])[2]")
    public WebElement qucickWiew2;

    @FindBy(xpath = "//*[@class='btn btn-dark btn-rounded btn-sm add_to_cart alt']")
    public WebElement addToCartButonu;

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement cikisButonu;

    @FindBy(xpath = "(//*[@class='btn btn-quickview btn-outline btn-default btn-rounded btn-sm mr-lg-2'])[1]")
    public WebElement wishlistButonu;

    @FindBy(xpath = "//*[@class='w-icon-heart']")
    public WebElement wishlistGoruntuleButonu;

    @FindBy(xpath = "//*[@id='place_order']")
    public WebElement placeOrderButonu;

    @FindBy(xpath = "//*[@id='payment_method_cod']")
    public WebElement payAtTheDoor;

    @FindBy(xpath = "//*[@class='button wc-forward']")
    public WebElement vievCartButonu;

    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
    public WebElement proceedToCheckOutButonu;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement singInButonu;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement singInGirisTikla;

    @FindBy(xpath = "(//*[@class='yith-wcwl-add-button'])[1]")
    public WebElement favoriEkleButonu1;

    @FindBy(xpath = "(//*[@class='add_to_wishlist single_add_to_wishlist'])[4]")
    public WebElement favoriEkleButonu2;

    @FindBy(xpath = "(//*[@class='yith-wcwl-add-button'])[5]")
    public WebElement favoriEkleButonu3;

    @FindBy(xpath = "(//*[@class='yith-wcwl-add-button'])[6]")
    public WebElement favoriEkleButonu4;

    @FindBy(xpath = "(//*[@class='yith-wcwl-add-button'])[7]")
    public WebElement favoriEkleButonu5;

    @FindBy(xpath = "(//*[@class='product-wrap'])[1]")
    public WebElement ilkUrun;

    @FindBy(xpath = "(//*[@class='product-media'])[4]")
    public WebElement ikinciUrun;

    @FindBy(xpath = "(//*[@class='product-wrap'])[5]")
    public WebElement ucuncuUrun;

    @FindBy(xpath = "(//*[@class='product-wrap'])[6]")
    public WebElement dortuncuUrun;

    @FindBy(xpath = "(//*[@class='product-wrap'])[7]")
    public WebElement besinciUrun;

    @FindBy(xpath = "//*[@title='Close (Esc)']")
    public WebElement escButonu;

    @FindBy(xpath = "(//*[@title='Remove this product'])[1]")
    public WebElement wishListtekUrunicinESCButonu;

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


}