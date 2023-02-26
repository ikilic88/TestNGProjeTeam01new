package pages.US15;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id='menu-item-1079']")
    public WebElement myAccount;










}
