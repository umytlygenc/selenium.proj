package day07;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase1;

public class C01_TestBaseDemo extends TestBase1 {
    /*
    UTILITIES:
    -Utilities tekrar takrar kullanacagimiz classlari koydugumuz paketin adidir
        - TestBase -> BUGUN
        - Driver -> Sonra
        - ExcelUtil -> Sonra
        - Configuration -> Sonra
    -Utilities paketinde Test case ler yazilmaz
    -Sadece Tekrar kullanilabilecek desdek siniflari(support class) olusturulur.
    -Bu support classlar test caseslerin yazilmasini hizlandirir
     */
    @Test
    public void test1(){
//        techproeducation ana sayfasina git
        driver.get("https://www.techproeducation.com");

//        ve titlein 'Bootcamps' kelimesini icerdigini test edelim
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Bootcamps"));
    }
}