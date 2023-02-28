package pages.US01;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[@class='register inline-type']")
    public WebElement registerButton;

}

