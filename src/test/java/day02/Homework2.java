package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
         /*
          1. Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın
             (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
          2. Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
             URL'yi yazdırın.
          3. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
          4. Youtube sayfasina geri donun
          5. Sayfayi yenileyin
          6. Amazon sayfasina donun
          7. Sayfayi tamsayfa yapin
          8. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
             doğru başlığı(Actual Title) yazdırın.
          9. Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
             URL'yi yazdırın
         10. Sayfayi kapatin
       */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // 1. Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın
        // (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        Thread.sleep(3000);
        String actualTitle= driver.getTitle();
        String istenenKelime="youtube";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title test Passed");
        }else {
            System.out.println("Title test Failed -> actualTitle : "+actualTitle);
        }
        // 2. Sayfa URL'sinin "youtube" içerip içermediğini doğrulayın, içermiyorsa doğru
        // URL'yi yazdırın.
        String actulaUrl= driver.getCurrentUrl();
        if (actulaUrl.contains(istenenKelime)){
            System.out.println("Url test Passed");
        }else {
            System.out.println("actualUrl : "+actulaUrl);
        }
        // 3. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        // 4. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);
        // 5. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);
        // 6. Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(3000);
        // 7. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // 8. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        // doğru başlığı(Actual Title) yazdırın.
        String istenenKelime2="Amazon";
        String actualTitle2= driver.getTitle();
        if (actualTitle2.contains(istenenKelime2)){
            System.out.println("Title test Passed");
        }else {
            System.out.println("Title test Failed -> actualTitle : "+actualTitle2);
        }
        // 9. Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String istenenKelime3="https://www.amazon.com/";
        String actualUrl2= driver.getCurrentUrl();
        if (actualUrl2.contains(istenenKelime3)){
            System.out.println("Url test Passed");
        }else {
            System.out.println("Url test Failed -> actualUrl : "+actualTitle2);
        }
        // 10. Sayfayi kapatin
        driver.close();
    }
}
