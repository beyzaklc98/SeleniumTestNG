package tests.DENEME;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Beyza;
import tests.homework1.utilities.ConfigReader;
import tests.homework1.utilities.Driver;
import tests.homework1.utilities.ReusableMethods;

public class US006 {


    @Test
    public void test01(){

        Beyza beyza = new Beyza();


        //Kullanıcı https://pearlymarket.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Kullanıcı Sign-in sekmesine tiklar
        beyza.signIn.click();
        //Kullanıcı Username girer
        beyza.username.sendKeys("ahmtaylmz1@gmail.com");
        //Store Manager Password girer
        beyza.password.sendKeys("753159abc");
        //Kullanıcı Sign-in butonuna tiklar
        beyza.signInButton.click();
        //Kullanıcı 'Sign-Out' sekmesine tiklar
        beyza.signOut.click();
        //Kullanıcı sekmesine tiklar
        beyza.storeManager.click();
        //Kullanıcı Products sekmesine tiklar
        beyza.products.click();
        //Kullanıcı add new butonuna tıklar
        beyza.addNew.click();
        //Categories menusunun gorunur oldugunu dogrular
        Assert.assertTrue(beyza.categories.isDisplayed());
        //Kullanıcı secilen urunlerin kategorilerini belirleyebilmeli
        for (WebElement w:beyza.categoriesList) {

            JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
            js.executeScript("arguments[0].click();",w);
           // ReusableMethods.getSoftAssert().assertTrue(w.isSelected());


        }
    }
}
