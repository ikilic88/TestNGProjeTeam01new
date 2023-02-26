package tests.US15;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.US15.ProductPage;
import utilities.Driver;
public class Add {


    public void addProduct() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        ProductPage productPage = new ProductPage();
        productPage.inventory.click(); // Kullanıcı Inventory seçeneğine tıklar
        jse.executeScript("arguments[0].scrollIntoView(true);",productPage.addProductText);
        Thread.sleep(1500);
        productPage.virtualCheckBox.click();    // Kullanıcı sayfa üst kısmında virtual box ını seçer
        productPage.productTitle.click();       // Kullanıcı Product Title alanına tıklar
        productPage.productTitle.sendKeys("mouse"); // Kullanıcı Product Title alanına mouse yazar
        Thread.sleep(1500);
        productPage.price.click();              // Kullanıcı Price alanına tıklar
        productPage.price.sendKeys("14");           // Kullanıcı Price alanına 14 yazar
        productPage.smallImg.click();           // Kullanıcı sayfa sağ üst kısmında bulunan küçük resim ekleme alanına tıklar
        productPage.uploadFilesText.click();
        Thread.sleep(1500);
        productPage.mediaLibraryText.click();
        Thread.sleep(1500);
        productPage.secondPicture.click();
        Thread.sleep(1500);
        productPage.addToGalleryButton.click();
        productPage.bigImg.click();
        Thread.sleep(1500);
        productPage.searchBox.sendKeys("mouse", Keys.ENTER);
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB,Keys.ENTER).perform();
        Thread.sleep(2500);
        productPage.selectButton.click();
        Thread.sleep(1500);
        productPage.electronicCheckBox.click();
        Thread.sleep(1500);
    }
    //public void submitButton() throws InterruptedException {
       // ProductPage productPage = new ProductPage();
       // Actions actions = new Actions(Driver.getDriver());
       // productPage.biyer.click();
       // Thread.sleep(1500);
       // actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        //Thread.sleep(1500);
        //productPage.submit.click();
   // }
}
