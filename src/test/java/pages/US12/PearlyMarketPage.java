package pages.US12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyMarketPage {

    public PearlyMarketPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //ortak
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


}
