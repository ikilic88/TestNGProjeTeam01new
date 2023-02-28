package pages.US17.US17;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class ProductPage {
    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[10]")
    public WebElement advancedButton;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[9]")
    public WebElement toptanUrunButton;
    @FindBy(xpath = "//*[@id='wcfm_products_simple_draft_button']")
    public WebElement draftButton;
    @FindBy(xpath = "//*[@class='wcfmfa fa-arrow-alt-circle-right block-indicator']")
    public WebElement inventory;
    @FindBy(xpath = "//*[@id='catalog_visibility']")
    public WebElement until;
    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement virtualCheckBox;
    @FindBy(xpath = "//*[@class='wcfm-container wcfm-top-element-container']")
    public WebElement addProductText;
    @FindBy(xpath = "//*[@id='pro_title']")
    public WebElement productTitle;
    @FindBy(name = "regular_price")
    public WebElement price;
    @FindBy(xpath = "//*[@id='gallery_img_gimage_0_display']")
    public WebElement smallImg;
    @FindBy(xpath = "//*[@id='featured_img_display']")
    public WebElement bigImg;
    @FindBy(xpath = "//*[@id='menu-item-upload']")
    public WebElement uploadFilesText;
    @FindBy(xpath = "//*[@id='__wp-uploader-id-1']")
    public WebElement selectFilesButton;
    @FindBy(xpath = "//*[@class='button media-button button-primary button-large media-button-select']")
    public WebElement addToGalleryButton;
    @FindBy(xpath = "//*[@id='menu-item-browse']")
    public WebElement mediaLibraryText;
    @FindBy(xpath = "(//*[@class='thumbnail'])[2]")
    public WebElement secondPicture;

    @FindBy(xpath = "(//*[@class='attachment-preview js--select-attachment type-image subtype-jpeg landscape'])[10]")
    public WebElement secondPictureTwo;

    @FindBy(xpath = "(//*[@id='media-search-input'])[2]")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='button media-button button-primary button-large media-button-select'])[2]")
    public WebElement selectButton;

    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement simpleProductList;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[4]")
    public WebElement shipping;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[5]")
    public WebElement attributes;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[7]")
    public WebElement linked;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[8]")
    public WebElement seo;

    @FindBy(xpath = "//*[@id='wcfm_products_simple_submit_button']")
    public WebElement submit;

    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement productAcilirMenü;


    @FindBy(xpath = "(//*[text()='Select all'])[1]")
    public WebElement selectAllButton;

    @FindBy(xpath = "(//*[@class='select2-search__field'])[2]")
    public WebElement searchAtributeBox;

    @FindBy(xpath = "(//*[text()='Select none'])[1]")
    public WebElement selectNoneButton;

    @FindBy(xpath = "//*[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term']")
    public WebElement addNewButton;


    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_cat '])[26]")
    public WebElement electronicCheckBox;


    @FindBy(xpath = "(//*[text()='Description'])[1]")
    public WebElement biyer;







}
