package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class SauceDemoPage {
    public SauceDemoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//*[@id='user-name']")
    public WebElement userName;
    //@FindBy(xpath="//*[@id='password']")
    //public WebElement password;
    @FindBy(xpath ="(//*[@class='inventory_item_price'])[5]")
    public WebElement enDusukFiyat1;
    @FindBy(xpath ="(//*[@class='inventory_item_price'])[2]")
    public WebElement enDusukFiyat2;
    @FindBy(xpath ="(//*[@class='inventory_item_price'])[6]")
    public WebElement enDusukFiyat3;
    @FindBy (xpath = "(//*[@class='inventory_item_price'])[3]")
    public WebElement enDusukFiyat4;
    @FindBy (xpath ="(//*[@class='inventory_item_price'])[1]")
    public WebElement enDusukFiyat5;
    @FindBy (xpath ="(//*[@class='inventory_item_price'])[4]")
    public WebElement enDusukFiyat6;

    @FindBy(xpath="(//*[text()='Add to cart'])[5]")
    public WebElement addToCart1;
    @FindBy(xpath="(//*[text()='Add to cart'])[2]")
    public WebElement addToCart2;
    @FindBy(xpath="(//*[text()='Add to cart'])[6]")
    public WebElement addToCart3;
    @FindBy(xpath="(//*[text()='Add to cart'])[3]")
    public WebElement addToCart4;
    @FindBy(xpath="(//*[text()='Add to cart'])[1]")
    public WebElement addToCart5;
    @FindBy(xpath="(//*[text()='Add to cart'])[4]")
    public WebElement addToCart6;

    @FindBy(xpath ="//*[@class='shopping_cart_link']")
    public WebElement sepet;

    @FindBy(xpath ="//*[@class='product_sort_container']")
    public WebElement priceButton;


}
