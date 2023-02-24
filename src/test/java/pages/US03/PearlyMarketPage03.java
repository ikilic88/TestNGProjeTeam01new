package pages.US03;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.US18.utilities.Driver;


public class PearlyMarketPage03 {

    public PearlyMarketPage03(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement girisyap;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement secondSignInButton;

}
