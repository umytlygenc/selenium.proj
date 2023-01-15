package Ozel_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumOdev {

    //Bir class olusturun: IframeOdev
//https://the-internet.herokuapp.com/iframe  sitesine gidiniz
//sayfadaki toplam iframe sayısını bulunuz.
//Sayfa basliginda 'Editor' yazını içerdiğini test edelim.
//Paragrafdaki yaziyi silelim
//Sonrasinda paragrafa "iframein icindeyim" yazisini yazdıralım
//Alt kısımdaki yazının 'Elemental Selenium' yazisini içerdiğini test edelim
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //-"amazon.com" adresine gidelim
        driver.get("https://www.trendyol.com/");


       // driver.findElement(By.xpath("//*[@href='/login']")).click();
    }
}
