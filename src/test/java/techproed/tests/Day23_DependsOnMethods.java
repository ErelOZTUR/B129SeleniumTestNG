package techproed.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Day23_DependsOnMethods {
    /*
   Test NG'de @Test metotları birbirinden bağımsız çalışır.
   Methodları bağımlı çalıştırmak istiyorsak "dependsOnMethods" parametresi kullanılır.
   Aşağıda seachTest() methodu homePageTest() methoduna bağlıdır.
   Eğer homePageTest() çalışırsa seachTest() de çalışır.
   Eğer homePageTest() fail olursa seachTest() çalışmaz, "ignore" edilir.
    */
    @Test
    public void homePageTest() {
        assertEquals(1, 2);//Burada "hard assertion" kullanıldığı için test fail olduğunda Java çalışmayı durdurur ve sonraki kodlar çalışmaz.
        System.out.println("Anasayfaya Gidildi");

    }

    @Test(dependsOnMethods = "homePageTest")
    public void searchTest() {
        System.out.println("Arama Yapıldı");

    }

    @Test(dependsOnMethods = "homePageTest")
    public void signInTest() {
        System.out.println("Giriş yapıldı");
    }
}
