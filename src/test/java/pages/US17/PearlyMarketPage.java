package pages.US17;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyMarketPage {

    public PearlyMarketPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@href='https://pearlymarket.com/my-account-2/'])[3]")
    public WebElement myAccountButton;

    @FindBy(xpath = "//*[@href='https://pearlymarket.com/store-manager/']")
    public WebElement storeManagerButton;

    @FindBy(xpath = "//*[@class='wcfm_menu_item active']")
    public WebElement productsButton;

    @FindBy(xpath = "(//*[@href='https://pearlymarket.com/store-manager/products-manage/'])[1]")
    public WebElement addNewButton;

    @FindBy(xpath = "//*[@name='product_type']")
    public WebElement simpleProductDropdownonclick;

    @FindBy(xpath = "//*[@value='variable']")
    public WebElement variableProductDropdownclick;

    @FindBy(xpath = "//*[@value='external']")
    public WebElement externalAffiliateProductDropdownclick;

    @FindBy(xpath = "//*[@name='attributes[1][is_active]']")
    public WebElement colorBoxButton;

    @FindBy(xpath = "//*[@name='attributes[2][is_active]']")
    public WebElement sizeBoxButton;

    @FindBy(xpath = "//*[@name='pro_title']")
    public WebElement productTitleTextBox;

    @FindBy(xpath = "//*[@name='product_url']")
    public WebElement urlTextBox;

    @FindBy(xpath = "//*[@name='button_text']")
    public WebElement buttonTextBox;

    @FindBy(xpath = "//*[@name='regular_price']")
    public WebElement priceTextBox;

    @FindBy(xpath = "//*[@name='sale_price']")
    public WebElement salePriceTextBox;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[1]")
    public WebElement colorTextBox;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[1]")
    public WebElement sizeTextBox;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[6]")
    public WebElement variationsButton;

    @FindBy(xpath = "//*[@id='featured_img_display']")
    public WebElement dataImgButton;

    @FindBy(xpath = "//*[@id='gallery_img_gimage_0_display']")
    public WebElement liitleDataImgButton;

    @FindBy(xpath = "//*[@class='product_cats_checklist_item checklist_item_229']")
    public WebElement categoriesAccessories;

    /*
      @FindBy(xpath = "//*[@class='thumbnail']")
    public WebElement choosImgFirstMedia;
     */
    @FindBy(xpath = "//*[@class='button media-button button-primary button-large media-button-select']")
    public WebElement selectButton;

    @FindBy(xpath = "//*[@name='variations[0][attribute_pa_size]']")
    public WebElement fanySizeDropdown;

    @FindBy(xpath = "//*[@name='variations[0][attribute_pa_color]']")
    public WebElement fanyColorDropdown;

    @FindBy(xpath = "//*[@id='variations_image_0_display']")
    public WebElement fimagebigbuttuon;

    @FindBy(xpath = "//*[@name='variations[0][regular_price]']")
    public WebElement fregularPriceTextBox;

    @FindBy(xpath = "//*[@name='variations[0][sale_price]']")
    public WebElement fsalePriceTextBox;

    @FindBy(xpath = "//*[@name='variations[0][sku]']")
    public WebElement fskuTextBox;

    @FindBy(xpath = "//*[@name='variations[0][weight]']")
    public WebElement fweightTextBox;

    @FindBy(xpath = "//*[@name='variations[0][length]']")
    public WebElement flenghtTextbox;

    @FindBy(xpath = "//*[@name='variations[0][width]']")
    public WebElement fwidthTextBox;

    @FindBy(xpath = "//*[@name='variations[0][height]']")
    public WebElement fheightTextBox;

    @FindBy(xpath = "//*[@name='variations[0][description]']")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//*[@name='submit-data']")
    public WebElement submitButton;










}
