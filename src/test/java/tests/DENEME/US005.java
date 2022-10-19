package tests.DENEME;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Beyza;
import tests.homework1.utilities.ConfigReader;
import tests.homework1.utilities.Driver;

public class US005 {

    @Test
    public void test01() throws InterruptedException {

        Beyza beyza = new Beyza();
        Actions actions = new Actions(Driver.getDriver());

        //Store Manager  https://pearlymarket.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Store Manager Sign-in sekmesine tiklar
        beyza.signIn.click();
        //Store Manager Username girer
        beyza.username.sendKeys("ahmtaylmz1@gmail.com");
        //Store Manager Password girer
        beyza.password.sendKeys("753159abc");
        //Store Manager Sign-in butonuna tiklar
        beyza.signInButton.click();
        //Store Manager 'Sign-Out' sekmesine tiklar
        beyza.signOut.click();
        //Store Manager sekmesine tiklar
        beyza.storeManager.click();
        //Store Manager Products sekmesine tiklar
        beyza.products.click();
        //Store Manager status,stock,price,date görünürlügünü doğrular
        Assert.assertTrue(beyza.status.isDisplayed());
        Assert.assertTrue(beyza.stock.isDisplayed());
        Assert.assertTrue(beyza.price.isDisplayed());
        Assert.assertTrue(beyza.date.isDisplayed());


        //Store Manager add new product secenegine tıklar
        beyza.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Store Manager urun icin Virtual ve Downloadable checbaxları görünürlügünü doğrular
        Assert.assertTrue(beyza.virtual.isDisplayed());
        Assert.assertTrue(beyza.downloadable.isDisplayed());


        //Store Manager Product Title sekmesine tiklar ve urun ismi yazar
        beyza.productTitle.click();
        beyza.productTitle.sendKeys("phone");
        //Store Manager Price($)  sekmesine  tiklar ve fiyat yazar
        actions.sendKeys(Keys.TAB).sendKeys("1000").sendKeys(Keys.TAB).sendKeys("1200").perform();


        //Store Manager acilan pencerede photo ustune tiklar
        beyza.photo.click();
        //Store Manager Media Libraryden eklenecek foto secilir
        beyza.mediaLibrary.click();
        beyza.mediaPhoto.click();
        //Store Manager Add to Gallary botununa tiklar
        beyza.addToGallery.click();
        //Store Manager fotograf eklendigini gorur
        Assert.assertTrue(beyza.eklenenPhoto.isDisplayed());
        Thread.sleep(1000);


        //Store Manager Short description bolumune tiklar
        //Store Manager urunle ilgili kisa bilgilendirme yazar
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("bir urun secildi").perform();
        //Store Manager  description bolumune tiklar
        //Store Manager urunle ilgili  bilgilendirme yazar
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("secilen urun gallarydeki ilk urun").perform();

    }
}


