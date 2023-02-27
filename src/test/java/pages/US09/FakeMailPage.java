package pages.US09;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FakeMailPage {
    public FakeMailPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='email']")
    public WebElement fakemail;

    @FindBy(id = "schranka")
    public WebElement SendCode;

    @FindBy(xpath = "//b[1]")
    public WebElement fakecode;

}
