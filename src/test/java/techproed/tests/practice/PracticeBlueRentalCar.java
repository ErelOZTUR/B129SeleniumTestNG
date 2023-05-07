package techproed.tests.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.MaviPages;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.security.Key;

public class PracticeBlueRentalCar {

    //Bluerantal car adresine gidelim.
    //Excel dosyamızdan aldıgımız ılk emaıl ve password ıle sayfaya login olalım.
    //Login oldugumuzu dogrulayalım.
    @DataProvider
    public static Object[][] blueCar() {
        String path="src/test/java/resources/mysmoketestdata.xlsx";
        String sheetname="customer_info";
        ExcelUtils excelUtils=new ExcelUtils(path,sheetname);
        return excelUtils.getDataArray();
    }
    @Test (dataProvider = "blueCar")
    public void test1(String emaill,String passwordd) {
        //Bluerantal car adresine gidelim.
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        MaviPages maviPages=new MaviPages();
        maviPages.login.click();

maviPages.email.sendKeys(emaill,Keys.TAB,passwordd);
maviPages.login2.click();
        //Login oldugumuzu dogrulayalım.
        Assert.assertTrue(maviPages.verify.isDisplayed());
        ReusableMethods.bekle(1);
maviPages.forlogout.click();
        ReusableMethods.bekle(1);
maviPages.logout.click();
        ReusableMethods.bekle(1);
maviPages.ok.click();
        ReusableMethods.bekle(1);
Driver.closeDriver();
    }

    @Test
    public void test2() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        MaviPages maviPages=new MaviPages();
        maviPages.login.click();
        maviPages.email.sendKeys(ConfigReader.getProperty("email1"),Keys.TAB,ConfigReader.getProperty("password1"));
        maviPages.login2.click();

        WebElement ddm=maviPages.aracSecimi;
        Select select=new Select(ddm);
        select.selectByVisibleText("BMW i3");
    }
}
