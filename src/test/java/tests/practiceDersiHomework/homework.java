package tests.practiceDersiHomework;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SauceDemoPage;
import tests.homework1.utilities.ConfigReader;
import tests.homework1.utilities.Driver;

public class homework {

    /*
     * Navigate to  https://www.saucedemo.com/
     * Enter the username  as standard_user
     * Enter the password as   secret_sauce
     * Click on login button
     * Choose price low to high and verify that PRICE (LOW TO HIGH) is visible

     * https://www.saucedemo.com/ adresine gidin
     * Kullanıcı adını standard_user olarak girin
     * Şifreyi secret_sauce olarak girin
     * Giriş düğmesine tıklayın
     * Düşükten yükseğe fiyatı seçin ve FİYATIN (DÜŞÜKTEN YÜKSEK) görünür olduğunu doğrulayın
     */

    @Test
    public void SauceDemoPage() throws InterruptedException {
        //* https://www.saucedemo.com/ adresine gidin
        //* Kullanıcı adını standard_user olarak girin
        //* Şifreyi secret_sauce olarak girin
        //* Giriş düğmesine tıklayın
        Driver.getDriver().get(ConfigReader.getProperty("sauceDemoUrl"));
        SauceDemoPage sauceDemoPage = new SauceDemoPage();
        sauceDemoPage.userName.sendKeys(ConfigReader.getProperty("userNameSD"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("passwordSD"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        //* Düşükten yükseğe fiyatı seçin ve FİYATIN (DÜŞÜKTEN YÜKSEK) görünür olduğunu doğrulayın
        Thread.sleep(2000);
        actions.click(sauceDemoPage.addToCart1).click(sauceDemoPage.addToCart2).click(sauceDemoPage.addToCart3)
                .click(sauceDemoPage.addToCart4).click(sauceDemoPage.addToCart5).click(sauceDemoPage.addToCart6).perform();
        sauceDemoPage.priceButton.click();
        Select options = new Select(sauceDemoPage.priceButton);
        options.selectByVisibleText("Price (low to high)");
        Assert.assertTrue(sauceDemoPage.priceButton.isDisplayed());
    }
}
