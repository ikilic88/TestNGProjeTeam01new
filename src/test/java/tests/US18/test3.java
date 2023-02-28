package tests.US18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.US17.PearlyEfsanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class test3 {
    @Test
    public void us17Tc02(){
        PearlyEfsanPage pearlyEfsanPage = new PearlyEfsanPage();

        // Kullanıcı URL'ye gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        ReusableMethods.waitFor(2);


        // Sing in butonuna basar
        pearlyEfsanPage.signIn.click();

        // valid bir e-mail adresi girer, valid bir password girer, singin butonuna basar
        pearlyEfsanPage.userName.sendKeys(ConfigReader.getProperty("e-mail"));
        pearlyEfsanPage.Password.sendKeys(ConfigReader.getProperty("Password"));
        pearlyEfsanPage.login.click();
        ReusableMethods.waitFor(3);

        // sayfanın en altına inip my account'a tıklar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        pearlyEfsanPage.myAccountButton.click();

        // acılan sayfada store manager'a tıklar
        pearlyEfsanPage.storeManagerButton.click();

        // aılan sayfada Prdocuts'ın üzerine gelir
        ReusableMethods.waitFor(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pearlyEfsanPage.productsButton.click();

        // gelen add new'e basar
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.addNewButton.click();

        // simple product dropdown'ından variable product'ı seçer
        ReusableMethods.waitFor(2);
        Select select = new Select(pearlyEfsanPage.simpleProductDropdownonclick);
        select.selectByVisibleText("Variable Product");

        //Kullanıcı sayfa sonundaki menüde 'Advanced' seçeneği görünür olana kadar sayfayı aşağı kaydırır
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(pearlyEfsanPage.advencedButton);

        //Kullanıcı Attributes seçeneğine tıklar
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(pearlyEfsanPage.attributesButton);


        //Kullanıcı Size boxunu seçer
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(pearlyEfsanPage.sizeBoxButton);

        //Kullanıcı Search for an attribute ... kutusuna data girer
        //  ReusableMethods.waitFor(2);
        //  actions.sendKeys(Keys.PAGE_DOWN)
        //         .sendKeys(Keys.PAGE_DOWN).perform();
        //  ReusableMethods.waitFor(2);
        //  ReusableMethods.clickByJS(pearlyEfsanPage.sizeTextBox);

        // //Kullanıcı Select All butonuna tıklar
        //  ReusableMethods.waitFor(2);
        //  ReusableMethods.clickByJS(pearlyEfsanPage.selectAllButton);

        //ürün ekle
        pearlyEfsanPage.dataImgButton.click();
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.mediaLibraryButton.click();
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.crocsButton.click();
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.selectButton.click();
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.liitleDataImgButton.click();
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.mediaLibraryButton.click();
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.crocsButton.click();
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.selectButton.click();
        ReusableMethods.waitFor(2);
    }

}
