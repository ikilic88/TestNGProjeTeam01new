package pages.US15;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StoreManagerPage {

    public StoreManagerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='wcfmfa fa-cube'])[1]")
    public WebElement productsButton;

    @FindBy(xpath = "//*[@href='https://pearlymarket.com/store-manager/products-manage/']")
    public WebElement addNewButton;










}
