package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class AmazonPage {
    public AmazonPage(){ //Constructor oluşturup public yapmamız gerekir

        PageFactory.initElements(Driver.getDriver(),this);
    }

    /*
    PageFactory bizlere nesne deposu oluşturmaya imkan veren, sürdürülebilir,
    yeniden kullanılabilir ve elementleri tek bir yerden yönetmeyi sağlayan bir Page object model konseptidir.

    Page Factory’i kullanımına bakacak olursak PageFactory model, Web elementlerini @FindBy annotionu ile algılar.
    How kalıbı ile birlikte elementlerin ayırt edici locator’ından hangisini kullanacaksak belirtilir.

    Sonrasında ise o ayırt edici locator’ın adı tanımlanır.
    Public WebElement ile birlikte test senaryolarında kullanmak üzere isimlendirmesi yaparız.
    Burada isimlendirme daha sonra baktığında anlayabilmek için önemlidir, okunaklı olmalıdır.
     */

    @FindBy (id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy (xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucWE;

}