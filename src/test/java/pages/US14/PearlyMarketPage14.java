package pages.US14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyMarketPage14 {

    public PearlyMarketPage14(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    WebElement myAccount;




}
