package techproed.tests.day25tekrar;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GooglePages;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Tekrar {


    //Google sayfasına gidiniz
    //Driver.getDriver().get("https://google.com");
    //{"Volvo"},{"Mercedes"},{"Audi"},{"Honda"},{"Toyota"},{"Opel"},{"BMW"} araçları aratınız
    //Her aratmadan sonra sayfa resmi alınız
    @DataProvider
    public static Object[][] googleTest() {
        return new Object[][]{{"Volvo"},{"Mercedes"}};
    }
    @Test (dataProvider = "googleTest" )
    public void test01(String arabas) {
        //Google sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        //Driver.getDriver().get("https://google.com");
        GooglePages googlePages=new GooglePages();
        googlePages.aramaKutusu.sendKeys(arabas, Keys.ENTER);
        //{"Volvo"},{"Mercedes"},{"Audi"},{"Honda"},{"Toyota"},{"Opel"},{"BMW"} araçları aratınız
        //Her aratmadan sonra sayfa resmi alınız
    }
}
