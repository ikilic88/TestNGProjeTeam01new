package pages.US17.US17;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductInventoryPage {
    public void ProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='wcfm-text']")
    public WebElement sku;

    @FindBy(xpath = "//*[@id='wcfm_products_simple_draft_button']")
    public WebElement draft;









}
