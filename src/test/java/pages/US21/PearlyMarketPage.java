package pages.US21;

import org.openqa.selenium.support.PageFactory;
import pages.US18.utilities.Driver;

public class PearlyMarketPage {

    public PearlyMarketPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
