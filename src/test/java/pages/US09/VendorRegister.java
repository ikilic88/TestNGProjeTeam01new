package pages.US09;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VendorRegister {
    public VendorRegister() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user_email")
    public WebElement vendoremail;

    @FindBy(name = "wcfm_email_verified_input")
    public WebElement reSendCode;

    @FindBy(xpath = "//*[@id='passoword']")
    public WebElement registrationPassword;

    @FindBy(xpath = "//*[@id='confirm_pwd']")
    public WebElement confirmPassword;

    @FindBy(id = "wcfm_membership_register_button")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@class='wcfm-message email_verification_message wcfm-success']")
    public WebElement verifyCodeSend;
    @FindBy(xpath = "//*[@class='wcfm-message wcfm-success']")
    public WebElement SuccesfullyRegistered;
    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")
    public WebElement alreadyExists;
    @FindBy(xpath = "//*[.='Too short']")
    public WebElement tooShortMessage;
    @FindBy(xpath = "//*[@class='weak']")
    public WebElement weakMessage;
    @FindBy(xpath = "//*[@class='good']")
    public WebElement goodMessage;
    @FindBy(xpath = "//*[@class='strong']")
    public WebElement strongMessage;


}
