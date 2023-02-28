package pages.US17;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class PearlyEfsanPage {


    public PearlyEfsanPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "//*[@name='login']")
   public WebElement signIn;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement Password;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='menu-item-1079']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//*[@href='https://pearlymarket.com/store-manager/']")
    public WebElement storeManagerButton;

    @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/products/']")
    public WebElement productsButton;

    @FindBy(id = "add_new_product_dashboard")
    public WebElement addNewButton;

    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement simpleProductDropdownonclick;

    @FindBy(xpath = "//*[@value='variable']")
    public WebElement variableProductDropdownclick;

    @FindBy(xpath = "//*[@value='external']")
    public WebElement externalAffiliateProductDropdownclick;

    @FindBy(xpath = "//*[@id='attributes_is_active_1']")
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

    @FindBy(xpath = "(//*[@class='select2 select2-container select2-container--default select2-container--below select2-container--focus']")
    public WebElement sizeTextBox;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[5]")
    public WebElement attributesButton;

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

    @FindBy(id = "wcfm_products_manage_form_advanced_head")
    public WebElement advencedButton;

    @FindBy(xpath = "//*[@class='button wcfm_add_attribute_term wcfm_select_all_attributes']")
    public WebElement selectAllButton;

    @FindBy(xpath = "(//*[@class='odd'])[1]")
    public WebElement addedProduct;

   // @FindBy(xpath = "((//*[@class='sorting_1'])[1]")
   // public WebElement addedProduct;

    @FindBy(xpath = "(//*[@id='menu-item-browse'])[2]")
    public WebElement mediaLibraryButton;

    @FindBy(xpath = "(//*[@class='thumbnail'])[1]")
    public WebElement crocsButton;

    @FindBy(xpath = "//*[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement singIn2Button;










}
