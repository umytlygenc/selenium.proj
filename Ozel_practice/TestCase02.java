package Ozel_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase1;

import java.util.List;

public class TestCase02 extends TestBase1 {

        /*
            TEST CASE2
         2. Home page with three Arrivals only
        1) Open the browser
        2) Enter the URL “http://practice.automationtesting.in/”
                    3) Click on Shop Menu
        4) Now click on Home menu button
        5) Test whether the Home page has Three Arrivals only
        6) The Home page must contains only three Arrivals

        TEST VAKA2
          2. Yalnızca üç Varış içeren ana sayfa
        1) Tarayıcıyı açın
        2) "http://practice.automationtesting.in/" URL'sini girin
        3) Mağaza Menüsüne tıklayın
        4) Şimdi Ana menü düğmesine tıklayın
        5) Ana sayfada yalnızca Üç Varış olup olmadığını test edin
        6) Ana sayfa yalnızca üç Varış içermelidir
        */

    @Test
    public void arrivals() throws InterruptedException {
        //2) "http://practice.automationtesting.in/" URL'sini girin
        driver.get("http://practice.automationtesting.in");

        //3) Click on Shop Menu
        driver.findElement(By.xpath("//*[text()='Shop']")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(3000);

        //4) Now click on Home menu button
        driver.findElement(By.xpath("//a[text()='Home']")).click();

        // 5) Test whether the Home page has Three Arrivals only
        List<WebElement> arrivals= driver.findElements(By.tagName("h3"));
        Thread.sleep(3000);
        Assert.assertEquals(3, arrivals.size());
        Assert.assertTrue(arrivals.size()==3);
    }
}