package tests.US01;
import com.github.javafaker.Faker;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.US01.FakerPage;
import pages.US01.HomePage;
import pages.US01.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_01 {

    @Test
    public void TC_01() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        FakerPage fakerPage = new FakerPage();
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        homePage.registerButton.click();
        Faker faker = new Faker();
        String username = faker.name().username();
        loginPage.username.click();
        loginPage.username.sendKeys(username);
        loginPage.username.isDisplayed();
        Reporter.log("USERNAME GİRİLDİ");
        String registerPncr=Driver.getDriver().getWindowHandle();
        Thread.sleep(2000);
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("fakerMailUrl"));
        String fakerUrlpncr=Driver.getDriver().getWindowHandle();
        System.out.println(fakerPage.fakerEmail.getText());
        String fakerEmailstr =fakerPage.fakerEmail.getText();
        Driver.getDriver().switchTo().window(registerPncr);
        loginPage.email.sendKeys(fakerEmailstr);
        Reporter.log("EMAIL GİRİLDİ");
        loginPage.password.click();
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.password.isDisplayed();
        Reporter.log("PASSWORD GİRİLDİ");
        loginPage.signUpButton.click();
        Assert.assertTrue(loginPage.customerLogin.isDisplayed());
        Reporter.log("KAYIT OLUNMADI");
    }


    @Test
    public void TC_02() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        FakerPage fakerPage = new FakerPage();
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        homePage.registerButton.click();
        Faker faker = new Faker();
        String username = faker.name().username();
        loginPage.username.click();
        loginPage.username.sendKeys(username);
        loginPage.username.isDisplayed();
        Reporter.log("USERNAME GİRİLDİ");
        String registerPncr=Driver.getDriver().getWindowHandle();
        Thread.sleep(2000);
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("fakerMailUrl"));
        String fakerUrlpncr=Driver.getDriver().getWindowHandle();
        System.out.println(fakerPage.fakerEmail.getText());
        String fakerEmailstr =fakerPage.fakerEmail.getText();
        Driver.getDriver().switchTo().window(registerPncr);
        loginPage.email.sendKeys(fakerEmailstr);
        Reporter.log("EMAIL GİRİLDİ");
        loginPage.password.click();
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.password.isDisplayed();
        Reporter.log("PASSWORD GİRİLDİ");
        loginPage.registerPolicy.click();
        loginPage.registerPolicy.isDisplayed();
        Reporter.log("REGISTER POLİCY KUTUSU TIKLANDI");
        loginPage.signUpButton.click();
        Thread.sleep(4000);
        loginPage.signUpButton.isEnabled();
        Reporter.log("SIGN BUTONUNA TIKLANDI");
        loginPage.signOutButton.isDisplayed();
        Reporter.log("KAYIT OLUNDU");
    }


    //  Driver.closeDriver();




}

