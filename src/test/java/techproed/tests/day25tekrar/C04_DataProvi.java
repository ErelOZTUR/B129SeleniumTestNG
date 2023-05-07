package techproed.tests.day25tekrar;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GooglePages;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C04_DataProvi {



    /*
    Eğer farklı bir test methodu için aynı dataProvider methodu kullanılacaksa
    @DataProvider(name = "googleTest") şeklinde dataprovider notasyonundan sonra name paremetresine yeni olusturduğumuz
    methodun adını yazarız
     */

    @Test (dataProvider = "test")
    public void asd(String data) {
        System.out.println(data);
    }

    @DataProvider (name = "test")
    public static Object[][] test() {
        return new Object[][]{{"Volvo"}, {"Mercedes"}, {"Audi"}, {"Honda"}, {"Toyota"}, {"Opel"}, {"BMW"}};
    }
    @Test(dataProvider = "test")
    public void google(String araclar) {
        //Google sayfasına gidiniz
        //Driver.getDriver().get("https://google.com");
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        //{"Volvo"},{"Mercedes"},{"Audi"},{"Honda"},{"Toyota"},{"Opel"},{"BMW"} araçları aratınız
        GooglePages googlePages = new GooglePages();
        googlePages.aramaKutusu.sendKeys(araclar, Keys.ENTER);
        //Her aratmadan sonra sayfa resmi alınız
        ReusableMethods.tumSayfaResmi();
        ReusableMethods.bekle(2);
        Driver.closeDriver();

    }


}
