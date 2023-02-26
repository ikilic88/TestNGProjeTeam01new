package pages.US09;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyMarketPage {

    public PearlyMarketPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Register']")
    public WebElement register;

    @FindBy(xpath = "//a[.='Become a Vendor']")
    public WebElement becomeAVendor;


}
