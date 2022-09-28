package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev {
    public static void main(String[] args) throws InterruptedException {

        /*
          Amazon sayfasina gidelim.
          Sayfayı tam ekran yapalım
          Sayfa basligini(title) yazdirin
          Sayfa basliginin “Amazon” icerdigini test edin
          Sayfa adresini(url) yazdirin
          Sayfa url’inin “amazon” icerdigini test edin.
          Sayfa handle degerini yazdirin
          Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
          Sayfayi kapatin.
        */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1-) Amazon sayfasina gidelim.
        driver.get("https://www.amazon.com");
        // 2-) Sayfayı tam ekran yapalım.
        driver.manage().window().maximize();
        // 3-) Sayfa basligini(title) yazdirin.
        System.out.println("Actual Title : " + driver.getTitle()); /*"Amazon.com. Spend less. Smile more."*/
        // 4-) Sayfa basliginin “Amazon” icerdigini test edin.
        String title = driver.getTitle();
        String istenenKelime = "Amazon";
        if (title.contains(istenenKelime)) {
            System.out.println("Title test PASSED"); /*"Title test PASSED"*/
        } else {
            System.out.println("Title test FAILED");
        }
        // 5-) Sayfa adresini(url) yazdirin.
        System.out.println("Url : " + driver.getCurrentUrl()); /*"https://www.amazon.com/"*/
        // 6-) Sayfa url’inin “amazon” icerdigini test edin.
        String url= driver.getCurrentUrl();
        String istenenKelime2="amazon";
        if (url.contains(istenenKelime2)){
            System.out.println("Url test PASSED"); /*"Url test PASSED"*/
        }else {
            System.out.println("Url test FAILED");
        }
        // 7-) Sayfa handle degerini yazdirin.
        System.out.println("Handle : "+driver.getWindowHandle()); /*"CDwindow-ACE13E377663DF25A36ADB8FB3EE3768"*/
        // 8-) Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin.
        String pageSource= driver.getPageSource();
        String arananKelime="Gateway";
        if (pageSource.contains(arananKelime)){
            System.out.println("PageSource test PASSED"); /*"PageSource test PASSED"*/
        }else {
            System.out.println("PageSource test FAILED");
        }
        // 9-) Sayfayi kapatin.
        Thread.sleep(2000);
        driver.close();
    }
}
