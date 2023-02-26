package tests.US13;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US13.PearlyMarketPage13;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class Test13{
    PearlyMarketPage13 pearlyMarketPage13;
    @Test
    public void adminLoginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));
        pearlyMarketPage13= new PearlyMarketPage13();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.waitFor(3);
       pearlyMarketPage13.myAccount.click();
    }


}
