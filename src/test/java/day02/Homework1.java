package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        /*
          1.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
          oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
          2.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
          yazdirin.
          3.https://www.walmart.com/ sayfasina gidin.
          4. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
          5. Tekrar "facebook" sayfasina donun
          6. Sayfayi yenileyin
          7. Sayfayi tam sayfa (maximize) yapin
          8.Browser'i kapatin
        */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // 1.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        String actualTitle=driver.getTitle();
        String istenenKelime="facebook";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title test Passed");
        }else {
            System.out.println("actualTitle : "+actualTitle);
        }
        // 2.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin.
        String actualUrl= driver.getCurrentUrl();
        String arananKelime="facebook";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url test Passed");
        }else {
            System.out.println("actualUrl : "+actualUrl);
        }
        // 3.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com");
        Thread.sleep(3000);
        // 4. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        String istenenKelime2="Walmart.com";
        String actualTitle2= driver.getTitle();
        if (actualTitle2.contains(istenenKelime2)){
            System.out.println("Title test Passed");
        }else {
            System.out.println("Title test Failed");
        }
        // 5. Tekrar "facebook" sayfasina donun
        driver.navigate().back();
        Thread.sleep(3000);
        // 6. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);
        // 7. Sayfayi tam sayfa(maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // 8. Browser 'i kapatin
        driver.close();


    }
}
