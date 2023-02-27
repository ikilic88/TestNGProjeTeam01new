package pages.US01;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="reg_username")
    public WebElement username;

    @FindBy(name="email")
    public WebElement email;

    @FindBy(id="reg_password")
    public WebElement password;

    @FindBy(id="register-policy")
    public WebElement registerPolicy;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement signUpButton;

    @FindBy(xpath ="(//*[@class='submit-status'])[2]")
    public WebElement kayıtlı;

    @FindBy(xpath = "(//*[.='Sign Out'])[1]")
    public WebElement signOutButton;

    @FindBy(xpath = "(//*[@class='logo'])[1]")
    public WebElement  customerLogin;


}


