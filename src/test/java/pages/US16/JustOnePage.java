package pages.US16;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JustOnePage {

    public JustOnePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement dogrulamaAcilir;

    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement virtualBox;

    @FindBy(xpath = "//*[@id='is_downloadable']")
    public WebElement downBox;


    @FindBy(xpath = "//*[@id='pro_title']")
    public WebElement productTitle;

    @FindBy(xpath = "//*[@id='catalog_visibility']")
    public WebElement until;

    @FindBy(xpath = "//*[@class='wcfmfa fa-arrow-alt-circle-right block-indicator']")
    public WebElement inventory;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[5]")
    public WebElement attributes;








}
