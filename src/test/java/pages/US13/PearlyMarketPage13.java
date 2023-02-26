package pages.US13;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyMarketPage13 {

    public PearlyMarketPage13(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@href='https://pearlymarket.com/my-account-2/'])[3]")
    public WebElement myAccount;
}
