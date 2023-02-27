package tests.US02;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.US02.HomePage;
import pages.US02.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_02 {
    @Test
    public void login() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        homePage.registerButton.click();
        loginPage.username.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("us-02username"));
        loginPage.username.isDisplayed();
        Reporter.log("USERNAME GİRİLDİ");
        loginPage.email.click();
        loginPage.email.sendKeys(ConfigReader.getProperty("us-02email"));
        loginPage.email.isDisplayed();
        Reporter.log("EMAIL GİRİLDİ");
        loginPage.password.click();
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.password.isDisplayed();
        Reporter.log("PASSWORD GİRİLDİ");
        loginPage.registerPolicy.click();
        loginPage.registerPolicy.isDisplayed();
        Reporter.log("REGISTER POLİCY KUTUSU TIKLANDI");
        loginPage.signUpButton.click();
        loginPage.signUpButton.isEnabled();
        Reporter.log("SIGN BUTONUNA TIKLANDI");
        loginPage.kayıtlı.isDisplayed();
        Reporter.log("ZATEN KAYITLI YAZISI GÖRÜLDÜ");
        // Driver.closeDriver();

    }
}

