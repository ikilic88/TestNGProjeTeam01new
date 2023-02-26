package pages.US19;

import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class PearlyMarketPage {

    public PearlyMarketPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
