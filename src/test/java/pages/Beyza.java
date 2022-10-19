package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.homework1.utilities.Driver;
import java.util.List;

public class Beyza {

    public Beyza(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//*[@class='w-icon-account'])[1]")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[text()='Sign In'])[2]")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement signOut;

    @FindBy (xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy (xpath = ("(//*[@class='text'])[4]"))
    public WebElement products;

    @FindBy (xpath = ("(//*[text()='Status'])[1]"))
    public WebElement status;

    @FindBy (xpath = ("(//*[text()='Stock'])[1]"))
    public WebElement stock;

    @FindBy (xpath = ("(//*[text()='Price'])[1]"))
    public WebElement price;

    @FindBy (xpath = ("(//*[text()='Date'])[1]"))
    public WebElement date;

    @FindBy (xpath = ("(//*[text()='Add New'])[1]"))
    public WebElement addNew;

    @FindBy (xpath = ("(//*[text()='Virtual'])[1]"))
    public WebElement virtual;

    @FindBy(xpath = ("(//*[text()='Downloadable'])[1]"))
    public WebElement downloadable;

    @FindBy (xpath = ("(//*[@href='https://pearlymarket.com/store-manager/products-manage/'])[3"))
    public WebElement productsAddNew;

    @FindBy (xpath = ("//*[@id='pro_title']"))
    public WebElement productTitle;

    @FindBy (xpath = ("//*[@id='gallery_img_gimage_0_display']"))
    public WebElement photo;

    @FindBy (xpath = ("//*[text()='Select Files']"))
    public WebElement selectFiles;

    @FindBy (xpath = ("//*[text()='Media Library']"))
    public WebElement mediaLibrary;

    @FindBy (xpath = ("(//*[@class='thumbnail'])[1]"))
    public WebElement mediaPhoto;

    @FindBy (xpath = ("//*[@class='button media-button button-primary button-large media-button-select']"))
    public WebElement addToGallery;

    @FindBy (xpath = ("//*[@id='gallery_img_gimage_0_display']"))
    public WebElement eklenenPhoto;


    @FindBy (xpath = ("(//*[text()='Sale Price ($)'])[1]"))
    public WebElement salePrice;

    @FindBy (xpath = ("//*[@id='featured_img_display']"))
    public WebElement addImage;

    @FindBy (xpath = ("//*[@id='gallery_img_gimage_0_display']"))
    public WebElement addImageBlog;

    @FindBy (xpath = ("//*[@id='insert-media-button']"))
    public WebElement sdAddMedia;

    @FindBy (xpath = ("(//*[@id='tinymce'])[1]"))
    public WebElement sdAddMediaYazi;

    @FindBy (xpath = ("(//*[@class='button insert-media add_media'])[2]"))
    public List<WebElement> dAddMedia;

    @FindBy (xpath = ("//*[@data-id='description']"))
    public List<WebElement> dAddMediaYazi;

    @FindBy (xpath = ("(//*[text()='Categories'])[1]"))
    public WebElement categories;

    @FindBy (xpath = ("//*[@id='product_cats_checklist']"))
    public List<WebElement> categoriesList;

}
