package day18;

public class C01_JSExecutor_GetValue {
    /*
1) Javascript Executor nedir?
    1- Selenium'dan gelen ve javascript kodlarini calistirmaya yarayan bir interface'dir. Normal Selenium method'lari
yeterli olmadigi durumlarda kullanilabilir

2) Ne zaman ve nasil kullanilir?
    1- Ornegin, bazi butonlara tiklamada problem olabilir, ya da belirli bir web elementin gorunur olacagi sekilde sayfanin
kaydirma islemi, ya da input kutularindaki degerleri almak icin kullanilabilir.

3) Sayfayi asagi veya yukari kaydirma islemi seleniumda nasil yapilir
    1- Selenium'daki Actions ya da javascript executor method'lari ile kaydirma islemleri yapilabilir.
Ornegin, actionslarda page_up,page_down,arrow_up,arrow_down method'lari ile ya da javascript executor'daki scrollIntoView(true)
ile yapilabilir. Ben olusturulmus reusable method'larini kullanarak bu islemleri kolaylikla yapabiliyorum.

4) Bir kutucuktaki yani inputtaki elemanin metni nasil alinabilir?
    1- Javascript executor ile alabiliriz. Cunku js executor ile attribute degerlerini alma imkanimiz var. getText() method'u bu durumlarda CALISMAZ

5) Seleniumda click yaparken problem yasadigin oldu mu? (ya da soyle sorulabilir) Selenium outomasyonunda ne tur problemler yasadin?
    1- Bazen yanlis locator, ya da bekleme(wait) problemi gibi durumlarda problem yasadim. Bazen gizli(hidden) elementlere tiklarken de problem yasadim.
Bu durumlarda javascript executor kullandim ve problemi cozdum.

6) Selenium automation'unda ne tur problemler yasadin
1- TEKNIK PROBLEMLER: Yanlis locator, bekleme(wait), alert, iframe, pop-up seklindeki reklam bildirimleri, multiple window, hidden elementlere tiklama
2- TAKIMLA ILGILI PROBLEMLER: (COK GUNDEME GETIRILMEMELI). Developer bazen buldugum buglari kabul etmiyordu.
Cozum: Takimla beraber degerlendirip fikir birligine variyorduk
 */
}
