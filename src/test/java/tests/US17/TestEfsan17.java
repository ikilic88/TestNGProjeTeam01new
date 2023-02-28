package tests.US17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US15.ProductInventoryPage;
import pages.US15.ProductPage;
import pages.US17.PearlyEfsanPage;
import tests.US15.Login;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;



public class TestEfsan17 {

    @Test
    public void us17Tc01(){
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
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
    }

    private void executeScript(String s, WebElement signIn) {
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void us17Tc03() throws InterruptedException {
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

      // Kullanıcı sayfada attribute'u bulup tıklar
        ReusableMethods.waitFor(2);
       ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].click;",pearlyEfsanPage.attributesButton);

      // Kullanıcı color dropdown'ına gelir
        ReusableMethods.waitFor(2);
        pearlyEfsanPage.colorBoxButton.click();
        Select select2 = new Select(pearlyEfsanPage.colorTextBox);
        select2.selectByVisibleText("red");

      // Kullanıcı color için bir değer girer
        ReusableMethods.waitFor(2);
      // Kullanıcı size dropdown'ına gelir
        ReusableMethods.waitFor(2);
      // Kullanıcı size için bir değer girer
        ReusableMethods.waitFor(2);
      // Kullanıcı add butonuna basar
        ReusableMethods.waitFor(2);

       //----------------------------------------------------------------------------------------------------------------
        //tc03sercanhoca 03
            ProductPage productPage = new ProductPage();
            productPage.simpleProductList.click();
            actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
            actions.perform();
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", productPage.until);
            Assert.assertTrue(productPage.inventory.isDisplayed());
            Assert.assertTrue(productPage.shipping.isDisplayed());
            Assert.assertTrue(productPage.attributes.isDisplayed());
            Assert.assertTrue(productPage.linked.isDisplayed());
            Assert.assertTrue(productPage.seo.isDisplayed());
            Assert.assertTrue(productPage.toptanUrunButton.isDisplayed());
            Assert.assertTrue(productPage.advancedButton.isDisplayed());

            //04
        Thread.sleep(2000);
        ProductInventoryPage productInventoryPage = new ProductInventoryPage();
        productPage = new ProductPage();
        productPage.inventory.click();
        Thread.sleep(1500);
        actions.sendKeys(Keys.TAB,"1200").perform();

        //05
            Thread.sleep(2000);
            productInventoryPage = new ProductInventoryPage();
            productPage = new ProductPage();
            productPage.inventory.click();
            Thread.sleep(1500);
            actions.sendKeys(Keys.TAB,"-1200").perform();

            //06
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);
        Thread.sleep(1500);

        productPage.inventory.click();
        Thread.sleep(1500);
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.SPACE,Keys.TAB,"1200").perform();
        Thread.sleep(1500);
        //add.submitButton();

        //07
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.SPACE,Keys.TAB,"1100").perform();

        //08
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.SPACE,Keys.TAB,"-1100").perform();

        //09
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER,Keys.DOWN,Keys.ENTER).perform();
        actions.sendKeys(Keys.ENTER,Keys.DOWN,Keys.ENTER).perform();
        //10
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.SPACE).perform();
        //11
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMenü.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);

        Thread.sleep(1500);

        productPage.shipping.click();
        Thread.sleep(1500);
        actions.sendKeys(Keys.TAB,"12500").perform();

        //12
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMenü.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);

        Thread.sleep(1500);

        productPage.shipping.click();
        Thread.sleep(1500);
        actions.sendKeys(Keys.TAB,"-12500").perform();

        //13
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMenü.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);

        Thread.sleep(1500);

        productPage.shipping.click();
        Thread.sleep(1500);
        actions.sendKeys(Keys.TAB,Keys.TAB,"-12500").perform();

        //14
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMenü.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);

        Thread.sleep(1500);

        productPage.shipping.click();
        Thread.sleep(1500);
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,"-12500").perform();

        // 15
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMenü.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);

        Thread.sleep(1500);

        productPage.shipping.click();
        Thread.sleep(1500);
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"-12500").perform();

        // 16
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMenü.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);

        Thread.sleep(1500);

        productPage.shipping.click();
        Thread.sleep(1500);
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
        // 17
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMenü.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);

        Thread.sleep(1500);

        productPage.shipping.click();
        Thread.sleep(1500);
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER,Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.ENTER,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
        // 18
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMenü.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);

        Thread.sleep(1500);

        productPage.attributes.click();
        Thread.sleep(1500);

        actions.sendKeys(Keys.TAB,Keys.SPACE,Keys.TAB,"beyaz",Keys.ENTER).perform();
        // 19
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMenü.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);

        Thread.sleep(1500);

        productPage.attributes.click();
        Thread.sleep(1500);

        actions.sendKeys(Keys.TAB,Keys.SPACE).perform();
        Thread.sleep(1500);

        productPage.searchAtributeBox.sendKeys("beyaz");
        actions.sendKeys(Keys.ENTER).perform();

        Thread.sleep(1500);
        productPage.selectAllButton.click();


        // 20
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMenü.click();
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.until);

        Thread.sleep(1500);

        productPage.attributes.click();
        Thread.sleep(1500);

        actions.sendKeys(Keys.TAB,Keys.SPACE).perform();
        Thread.sleep(1500);

        productPage.searchAtributeBox.sendKeys("beyaz");
        actions.sendKeys(Keys.ENTER).perform();

        Thread.sleep(1500);
        productPage.selectNoneButton.click();

        // 21
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP).perform();

        Thread.sleep(1500);

        productPage.productAcilirMenü.click();
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
        Thread.sleep(1500);

        jse.executeScript("arguments[0].scrollIntoView(true);", productPage.until);

        Thread.sleep(1500);

        productPage.attributes.click();
        Thread.sleep(1500);

        actions.sendKeys(Keys.TAB,Keys.SPACE).perform();
        Thread.sleep(1500);

        productPage.addNewButton.click();
        Driver.getDriver().switchTo().alert().sendKeys("bej");
        Driver.getDriver().switchTo().alert().accept();

    }

    //-----------------------------------------------------------------------------------------------------------------

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void us17Tc07(){
        PearlyEfsanPage pearlyEfsanPage = new PearlyEfsanPage();

        // Kullanıcı URL'ye gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        ReusableMethods.waitFor(3);

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

        // Kullanıcı product yazısının üzerine tıklar
        ReusableMethods.waitFor(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pearlyEfsanPage.productsButton.click();

        //Kullanıcı açılan sayfada yüklediği ürünü görür
        Assert.assertTrue(pearlyEfsanPage.addedProduct.isDisplayed()); //??????
    }

}
