package utilities;

public class Questions {
  /*  Interview Questions
    Tell me 5 exception that you get.-5 adet selenium da aldigin exceptions dan bahset.
    What type of exceptions do you get in selenium? - Seleniumda ki align exceptions tiplerinden bahset
    What is your solution?-Cozum ne?
    What type of waits do you use?- Hangi resit wait kullanirsin?
    Which wait do you prefer?- Hangi wait tercih edersin?
    Why do you prefer that wait?- Neden onu tercih edersin?
    How to you resolve synronization issue?-Senkronizasyon problemini nasil cozersin?

    NoSuchElementException:
Yanlis locator
Popup, yeni pencere, iframe,…
Sayfa dolmada problemler ve yavaslamalar
Sakli olan elementler
Solution:
Locatorin dogrulugunu tekrar kontrol et
Manual test ile iframe, yeni pencere, alert,… gibi elementlerin varligini kontrol et.
Bekleme problemi olabilir. Implicit wait bekleme suresini cozmuyor. Bu durumda explicit wait yada fluent wait kullaniriz
   /*
TimeOutException explicit wait kullanıldığı zaman ve element bulunamadığında alınan bir hatadır.
Şimdiye kadar karşılaşmamızın nedeni sadece implicit wait kullanmış olmamızdır.
Explicit wait ve yanlış locatar kullandığımız zaman TimeOutException alırız.
Explicit wait var, doğru locatar kullandık ama süre yeterli olmadığı durumlarda TimeOutException alırız.
Explicit wait var, doğru locatar kullandık, süre yeterli ama iframe var TimeOutException alırız.

TimeOutException:
Explicit wait kullanildiginda, ve element bulunamadiginda alinir.
Explicit wait & yanlis locator-> timeout
Explicit wait & doğru locator & sure yeterli degil -> timeout
Explicit wait & dogru locator & sure yeterli & iframe var ->  time out
Solution:
-Sureyi arttirmak
-Farkli explicit kullanmak: wait visibilityOfElementLocated YERINE presenceOfElementLocated. Yada javascript executor da ki waiter sayfa geçişlerini beklemek icin kullanabilirim
-Locatori tekrar kontrol etmek
-Frameworkunde hazir reusable method lar var Bu durumda timeoutexception aldigimda hızlıca o metotlar yardımıyla problemi cozebiliyoruz

   TimeOutException:
If you use explicit wait and wait time is not enough/locator still incorrect then TimeOutException
Simply put, wait time is over but the commend is not completed
Solution:
-Increase the wait time
-Try using different wait. For example try using javascript executor wait for the page to load. This is also a dynamic wait
-I have different explicit waits in my Reusable util class. I have javascript executor wait as well. ReusableMethods.waitForPageToLoad(1);
-Case by case, I prefer different explicit waits to maximize the performance of the automation script
Collapse










*/
   



}
