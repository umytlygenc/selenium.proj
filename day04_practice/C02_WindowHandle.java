package day04_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase1;

public class C02_WindowHandle extends TestBase1 {


    @Test
    public void test02() {

        // ...Exercise 2...

        // 1- https://www.amazon.com sayfasina gidelim
        //driver.get("https://www.amazon.com");
        // 2- url'in 'amazon' icerdigini test edelim
        // 3- yeni bir pencere acip https://www.bestbuy.com sayfasina gidelim
        // 4- title'in 'Best Buy' icerdigini test edelim
        // 5- ilk sayfaya(amazon) donup sayfada java aratalım
        // 6- arama sonuclarının 'Java' icerdigini test edelim
        // 7- ikinci sayfaya(bestbuy) donelim
        // 8- logonun
        // 1- https://www.amazon.com sayfasina gidelim
        driver.get("https://www.amazon.com");
        String firstHandle = driver.getWindowHandle();
        // 2- url'in 'amazon' icerdigini test edelim
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("amazon"));
        // 3- yeni bir pencere acip https://www.bestbuy.com sayfasina gidelim
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");
        String secondHandle = driver.getWindowHandle();
        // 4- title'in 'Best Buy' icerdigini test edelim
        String baslik = driver.getTitle();
        Assert.assertTrue(baslik.contains("Best Buy"));
        // 5- ilk sayfaya(amazon) donup sayfada java aratalım
        driver.switchTo().window(firstHandle);
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("java", Keys.ENTER);
        // 6- arama sonuclarının 'Java' icerdigini test edelim
        WebElement result = driver.findElement(By.xpath("(//*[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
        String resultText = result.getText();
        Assert.assertTrue(resultText.contains("Java"));
        // 7- ikinci sayfaya(bestbuy) donelim
        driver.switchTo().window(secondHandle);
        // 8- logonun gorundugunu test edelim
        WebElement logo = driver.findElement(By.xpath("(//*[@class='logo'])[1]"));
        Assert.assertTrue(logo.isDisplayed());
    }
}
