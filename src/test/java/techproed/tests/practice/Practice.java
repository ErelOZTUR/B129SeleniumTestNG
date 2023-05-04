package techproed.tests.practice;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Practice {
    //https://demoqa.com/ url'ine gidin.

    @Test
    public void test1() {
        Driver.getDriver().get(ConfigReader.getProperty("https://demoqa.com/"));
    }

//Alerts, Frame & Windows Butonuna click yap
//""Please select an item from left to start practice."" yazısının görünür olduğunu doğrula
//Sol'da açılan Menu den ""Browser Windows"" butonuna click yap
//New Tab butonunun görünür olduğunu doğrula
//New Tab butonuna click yap
//Açılan yeni Tab da ""This is a sample page"" yazısının görünür olduğunu doğrula
//İlk Tab'a geri dön
////New Tab butonunun görünür olduğunu doğrula
}
