package pages.US11;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import org.openqa.selenium.WebElement;

public class PearlyMarketPage {

    public PearlyMarketPage(){PageFactory.initElements(Driver.getDriver(),this);}
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


    //TC02
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/div")
    public WebElement Orders;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div")
    public WebElement Downloads;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[2]/div/div/div[3]/div")
    public WebElement Addresses;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[2]/div/div/div[4]/div")
    public WebElement AccauntsDetails;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[2]/div/div/div[5]/div")
    public WebElement Wishlist;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[2]/div/div/div[6]/div")
    public WebElement Logout;


  //TC03
    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[2]/a")
    public WebElement dashboardstoreManager;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[3]/a")
    public WebElement dashboardOrders;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[4]/a")
    public WebElement dashboardDownloads;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[5]/a")
    public WebElement dashboardAddresses;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[6]/a")
    public WebElement dashboardAccountDetails;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[7]/a")
    public WebElement dashboardWishlist;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[8]/a")
    public WebElement dashboarSupportTickets;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[9]/a")
    public WebElement dashboarFollowings;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[10]/a")
    public WebElement dashboardLogOut;




}
