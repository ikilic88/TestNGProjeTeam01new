package tests.US16;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US15.LoginPage;
import pages.US15.MyAccountPage;
import pages.US15.ProductPage;
import pages.US15.StoreManagerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Login01 {

    static LoginPage loginPage;
    static MyAccountPage myAccountPage;
    static StoreManagerPage storeManagerPage;

    static ProductPage productPage;
    static JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    @Test
    public void login01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("PearlyMarketUrl"));
        loginPage = new LoginPage();
        loginPage.loginButton.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("pearlyDogruMail"));
        loginPage.password.sendKeys(ConfigReader.getProperty("pearlyDogruSifre"));
        loginPage.signInButton.click();
        Driver.getDriver().navigate().refresh();

        jse.executeScript("arguments[0].scrollIntoView(true);",loginPage.myAccount);
        Thread.sleep(3000);
        loginPage.myAccount.click();

        myAccountPage = new MyAccountPage();
        myAccountPage.storeManager.click();

        storeManagerPage=new StoreManagerPage();
        ReusableMethods.hover(storeManagerPage.productsButton);
        ReusableMethods.hover(storeManagerPage.addNewButton);
        storeManagerPage.addNewButton.click();

        productPage= new ProductPage();


    }

}
