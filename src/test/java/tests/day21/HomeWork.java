package tests.day21;
import org.testng.annotations.Test;
import tests.homework1.utilities.ConfigReader;
import tests.homework1.utilities.Driver;
public class HomeWork {

    //Hepsiburada sayfasına gidiniz
    //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
    //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
    //Sayfayı kapatalım

    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("hpsbrdUrl"));
    }
}
