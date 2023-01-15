package day12;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase1;

import static utilities.TestBase1.waitFor;

public class C01_FileUpload extends TestBase1 {
    //    Tests packagenin altina bir class oluşturun : C05_UploadFile
//    https://the-internet.herokuapp.com/upload adresine gidelim
    @Test
    public void fileUploadTest(){
        driver.get("https://the-internet.herokuapp.com/upload");
//    chooseFile butonuna basalim
        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));
//    Yuklemek istediginiz dosyayi secelim.
        String dosyaYolu = System.getProperty("user.home")+"//OneDrive//Desktop//logo.jpeg";
        chooseFileButton.sendKeys(dosyaYolu);
        waitFor(5);

//    Upload butonuna basalim.

//    “File Uploaded!” textinin goruntulendigini test edelim.
    }
}