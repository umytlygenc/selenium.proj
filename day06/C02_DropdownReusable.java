package day06;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
public class C02_DropdownReusable {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }

    //    REUSABLE METHOD: Dropdown icin tekrar tekrar kullanabilecegimiz bir method olusturalim.
    public void selectFromDropdown(WebElement dropdown, String secenek) {
//        selectFromDropdown(driver.findElement(By.xpath("//select[@id='year']")), "2005"); -> year dan 2005
//        selectFromDropdown(driver.findElement(By.xpath("//select[@id='month']")), "January"); -> month January
//        selectFromDropdown(driver.findElement(By.id("day")), "12"); -> Day 12
//        Gonderilen dropdown elemention tum optionslari alinir
        List<WebElement> options = dropdown.findElements(By.tagName("option"));//Tum option tagli elementleri aliyorum
        for (WebElement eachOption : options) {
            if (eachOption.getText().equals(secenek)) {
                eachOption.click();
                break;
            }
        }

    }
    /*
    tomasyon adimlari nelerdir?
1) Test kabul kriterleri dikkatlice okunur
2) Test case olusturulur
3) İlk once manuel test edilir
4) Her sey yolundaysa, otomasyon senaryolarinin testi yapilir
5) Hata ya da eksiklik varsa developerla konusulur, developer (gelistirici) sorunu duzelttiginde tekrar test edilir
6) Otomasyon testi tamamlandiginda konuyla ilgili rapor hazirlanir
i) Html raporu olusturulur
ii) Raporlar Jıra ya yuklenir
iii)Rapor hazırlarken, manuel testler icin ek
Test PASS durumunda;
Rapor hazırlanip JIRA'ya yuklenir

Test FAIL durumunda;
Basarisiz olmasinin nedeni ya veri ya da bug(hata) olabilir
Hatadan emin olmak icin yeniden test edilir
Eger bug kaynakli ise developerlarla konusulur ve  hatalari duzeltmeleri icin sure verilir
Hata duzeltildiginde tekrar test edilir ve rapor JIRA ya yuklenir
     */

    @Test
    public void selectFromDropdown(){
        selectFromDropdown(driver.findElement(By.xpath("//select[@id='year']")), "2005");//2005 i secti
    }
//    NOTE: sonraki dersde tekrar ve kullanimi
@After
public void tearDown() {
    driver.close();
}
}