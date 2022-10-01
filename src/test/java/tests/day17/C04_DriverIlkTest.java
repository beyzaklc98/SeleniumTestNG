package tests.day17;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBaseBeforeClassAfterClass;
public class C04_DriverIlkTest {

    @Test
    public void test01() {
     /*
     TestBase class'ına extend ederek kullandığımız driver yerine artık
     Driver class'ından kullanacağımız getDriver() static method'unu kullanırız
     */
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://bestbuy.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://hepsiburada.com");
        Driver.closeDriver();
    }
}
    // testlerimizi calistirdigimizda her seferinde yeni driver oludturdugu icin
    // her test methodu icin yeni bir pencere (driver) aciyor
    // eger driver'a bir deger atanmamissa yani driver == null ise
    // bir kere driver'i calistir diyerek bir kere if icini calistiracak
    // ve driver artik bir kere calistigi icin ve deger atandigi icin null olmayacak
    // ve direk return edecek ve diger testlerimiz ayni pencere (driver) uzerinde calisacak